<template>
	<div class="slide fourth-slide">
		<div class="titles">
			<h1 class="title">Asistencia</h1>
		</div>
		<div>
			<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Harum voluptatum adipisci nulla odit. Ea iste
				adipisci placeat modi ratione ut fugit eaque facilis tempore, tempora cum quam veritatis nesciunt autem?</p>
		</div>	
		<div v-if="members" class="container-form">
			<h2 class="subtitle">Familia {{ members[0].name }}</h2>
		</div>
		<div v-if="members" class="container-form">
			<div class="form">
				<div class="form-field" v-for="(member, index) in members[0].members" :key="index">
					<input type="checkbox" v-model="member.accepted" />
					<label class="input">{{ member.name }} {{ member.lastname }}</label>
				</div>
			</div>
		</div>

		<Transition appear mode="out-in" name="fade">

			<div class="container-button-icons-contact" v-if="!showMessageSubmit">

				<div class="container-button">
					<button class="button" @click="updateAttendance">guardar</button>
				</div>

			</div>

			<label v-else="showMessageSubmit" class="message-form" :class="{ red: !successSubmit }">
				{{ statusMsg }}
			</label>

		</transition>
	</div>
</template>
  
<script>
export default {
	name: 'ConfirmForm',
	data() {
		return {
			members: null,
			showMessageSubmit: false,
			successSubmit: false,
			statusMsg: ''
		};
	},
	mounted() {
		fetch('http://localhost:8080/family/123456/members')
			.then((response) => response.json())
			.then((data) => {
				this.members = data;
			})
			.catch((error) => console.error('Error:', error));
	},
	methods: {
		updateAttendance() {
			if (this.members) {
				this.showMessageSubmit = 'sending'; // Mostrar mensaje de envío

				const updatedMembers = this.members[0].members.map((member) => ({
					idPerson: member.idPerson,
					accepted: member.accepted,
				}));

				const requestBody = {
					idFamily: this.members[0].idFamily,
					members: updatedMembers,
				};

				fetch('http://localhost:8080/family', {
					method: 'POST',
					headers: {
						'Content-Type': 'application/json',
					},
					body: JSON.stringify(requestBody),
				})
					.then((response) => {
						if (response.ok) {
							this.statusMsg = 'gracias💗​';
							this.successSubmit = true;
						} else {
							this.statusMsg = 'error';
							this.successSubmit = false;
						}
					})
					.catch((error) => {
						console.error('Error:', error);
						tthis.statusMsg = 'error';
						this.successSubmit = false;
					})
					.finally(() => {
						this.showMessageSubmit = true;

						setTimeout(() => {
							this.showMessageSubmit = false;
						}, 8000)

					})
			}
		},
	},
};

</script>
  
<style scoped>
.titles {
	display: flex;
	flex-direction: column;
	line-height: 40px;
}

label {
	margin-left: 15px;
}

p {
	text-align: justify;
}

.form {
	display: flex;
	width: 100%;
	flex-direction: column;
	gap: 20px;
}

.fourth-slide {
	display: flex;
	flex-direction: column;
	justify-content: space-evenly;
	align-items: center;
	/* gap: 50px; */
	padding-top: 3.7rem;
}

.form-field {
	display: flex;
	justify-content: flex-start;
	width: 100%;
}

.container-form {
	display: flex;
	flex-direction: column;
	gap: 20px;
}

.message-form {
	display: flex;
	justify-content: center;
	align-items: center;
	width: 150px;
	height: 35px;
	text-align: center;
	border-radius: 10px;
	background-color: #9fdeaf;
	box-shadow: 0 0 5px #8ca1bf;
	color: var(--color-bg-dark);
	margin-left: 0px;
}

.button {
	font-family: 'Sky';
	font-size: 16px;
	display: flex;
	height: 35px;
	justify-content: center;
	align-items: center;
	transition: background-color .5s;
	cursor: pointer;
	border: none;
	border-radius: 20px;
	width: 150px;
	background-color: var(--vt-c-indigo);
	color: #f4f5f7;
}

.container-button {
	display: flex;
	justify-content: center;
}

.button:hover {
	background-color: rgba(65, 105, 225, 0.384);
}

.images {
	display: flex;
	justify-content: center;
	align-items: center;
}

.container-dress {
	width: 150px;
}


@media screen and (min-width: 768px) {

		.button{
			font-size: 18px;
		}
	}
	
</style>