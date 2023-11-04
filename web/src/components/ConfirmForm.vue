<template>
	<div class="slide">
		<div class="titles">
			<h1 class="title">Asistencia</h1>
		</div>
		<div>
			<p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Harum voluptatum adipisci nulla odit. Ea iste
				adipisci placeat modi ratione ut fugit eaque facilis tempore, tempora cum quam veritatis nesciunt autem?</p>
		</div>	
		<div v-if="members" class="container-form">
			<h2 class="subtitle">{{ members.name }}</h2>
		</div>
		<div v-if="members" class="container-form">
			<div class="form">
				<div class="form-field" v-for="(member, index) in members.members" :key="index">
					
					<div class="form-checkbox">
						<input class="checkbox" type="checkbox" :id="member.idPerson" v-model="member.accepted">
						<label class="input" :for="member.idPerson" :tabindex="index">{{ member.name }} {{ member.lastname }}</label>
					</div>
				</div>
			</div>
		</div>

		<Transition appear mode="out-in" name="fade">

			<div class="container-button" v-if="!showMessageSubmit">

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
	props:{
		members: Object
	},
    data() {
        return {
            showMessageSubmit: false,
            successSubmit: false,
            statusMsg: '',
			api: '',
			typing: false
        };
    },
    mounted() {
		this.api = import.meta.env.VITE_URL_API
    },
    methods: {
        updateAttendance() {
            if (this.members) {
                this.showMessageSubmit = 'sending'; // Mostrar mensaje de envío
                const updatedMembers = this.members.members.map((member) => ({
                    idPerson: member.idPerson,
                    accepted: member.accepted,
                }));
                const requestBody = {
                    idFamily: this.members.idFamily,
                    members: updatedMembers,
                };
                fetch(`${this.api}`, {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json',
                    },
                    body: JSON.stringify(requestBody),
                })
                    .then((response) => {
                    if (response.ok) {
                        this.statusMsg = '💗​';
                        this.successSubmit = true;
                    }
                    else {
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
                    }, 8000);
                });
            }
        },
    }
};

</script>
  
<style lang ="scss" scoped>
.titles {
	display: flex;
	flex-direction: column;
}

label {
	margin-left: 15px;
}

p {
	text-align: justify;
}

.subtitle{
	font-size: 3rem;
	font-family: 'Athalia' ;
}

.form {
	display: flex;
	width: 100%;
	justify-content: flex-start;
	align-items: flex-start;
	width: 100%;
	flex-direction: column;
	gap: 15px;
}

.form-field {
	display: flex;
	justify-content: flex-start;
	width: 100%;
}

.container-form {
	width: 100%;
	display: flex;
	flex-direction: column;
}

.message-form {
	display: flex;
	justify-content: center;
	align-items: center;
	width: 100%;
	max-width: 250px;	
	height: 35px;
	text-align: center;
	border-radius: 20px;
	background-color: var(--vt-c-slide-color-titles);
	color: var(--color-bg-dark);
	margin-left: 0px;
}

.button {
	width: 100%;
	max-width: 250px;
	padding: 0;
	font-family: 'Sky';
	font-size: 16px;
	display: flex;
	height: 35px;
	justify-content: center;
	align-items: center;
	transition: background-color .3s;
	cursor: pointer;
	border: none;
	border-radius: 20px;
	background-color: var(--vt-c-slide-color-titles);
	color: var(--vt-c-slide-color);
}

.container-button {
	width: 100%;
	display: flex;
	justify-content: center;
}

.button:hover {
	color: var(--vt-c-slide-color-titles);
	outline: 1px solid var(--vt-c-slide-color-titles);
	outline-offset: -1px;
	background-color: var(--vt-c-slide-color);
}

/* Checkbox */
// Variables
$checkbox-size: 20px;
$checkbox-border: #000;
$checkbox-selected: #000; // Primary colour

.checkbox{
  position: absolute;
  opacity: 0;
  
  // Text
  & + label{
    display: inline-block;
    position: relative;
    cursor: pointer;
    line-height: $checkbox-size;
    padding-left: $checkbox-size + 10;
    // font-size: $checkbox-size - 2;
    // font-family: sans-serif;
    // color: #666; // Label colour
    
    // Checkbox
    &:before{
      position: absolute;
      display: block;
      left: 0;
      top: 0;
      content: "";
      background: var(--vt-c-slide-color);
      width: $checkbox-size;
      height: $checkbox-size;
      
      box-shadow: inset 0 0 0 1px $checkbox-border;
      border-radius: 50%;
      transition: 200ms ease-in-out all;
    }
    
    // Tick
    &:after{
      position: absolute;
      display: block;
      top: 5px;
      left: 8px;
      content: "";
      width: 3px;
      height: 7px;
      border-right: 1px solid transparent;
      border-bottom: 1px solid transparent;
      transform: rotate(45deg);
      
      transition: 200ms ease-in-out all;
    }
  }
  
  // Hover
  & + label:hover{
    color: #333;
  }
  
  // Focus
  & + label:focus{
    outline: none;
  }
  
  // Checked
  &:checked{
    & + label{
      &:before{
        background: $checkbox-selected;
        box-shadow: none;
      }
      &:after{
        border-color: white;
      }
    }
  }
  
  // Disabled
  &:disabled{
    & + label{
      &:before{
        background: #f2f2f2; // Disabled colour
        box-shadow: none;
      }
      &:after{
        border-color: transparent;
      }
    }
  }
  
  // Disabled Checked
  &:checked:disabled{
    & + label{
      &:before{
        background: #f2f2f2;
        box-shadow: none;
      }
      &:after{
        border-color: #cecece;
      }
    }
  }
}

// Additional demo styling
.form-checkbox{
  position: relative;
  display: block;
  margin: 0 0 15px;
}
.demo{
  display: block;
  width: 240px;
  margin: 50px auto;
  padding: 100px;
  border: 1px solid $checkbox-border;
  border-radius: 10px;
}

/* Checkbox */


@media screen and (min-width: 768px) {

		.button{
			font-size: 18px;
		}
	}
	
</style>