<template>
	<div class="slide">
		<div class="titles">
			<h1 class="title">Regalos</h1>
		</div>

		<div>
			<p>si estás pensando en regalarnos algo, sugerimos un regalo clásico que nunca pasa de moda:</p>
			<p><span class="bold">¡dinero en efectivo!</span></p>
			<p>ó</p>
			<p><span class="bold">es59-2100-1893-6013-0028-6350</span></p>
			<p>ó</p>
			<p><span class="bold">bizum: +34 602547908</span></p>
			<p>¡gracias por iluminar nuestra cuenta y nuestro corazón!</p>
		</div>
		<div>
		</div>
	</div>
</template>
  
<script>
export default {
	name: 'Gifts',
}
</script>
  
<style scoped>
h1 {
	height: 70px;
}

.titles {
	display: flex;
	flex-direction: column;
}

.subtitle {
	font-size: 1.3rem;
}

.images {
	display: flex;
	justify-content: center;
	align-items: center;
	transform: translateY(25px);
}

.the-colors {
	padding-bottom: 6px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	gap: 5px;
	/* border-top: 1px solid #0000002e ;
	border-bottom: 1px solid #0000002e ; */
	transform: translateY(10px);

}

.container-dress {
	width: 150px;
}

.man {
	width: 175px;
	transform: translate(37px, -11px);
}

.woman {
	transform: translate(-45px, 0px);
}

.container-colors {
	display: flex;
	gap: 10px;
}

.colors {
	width: 25px;
	height: 25px;
	border-radius: 50%;
	/* background: linear-gradient(90deg, #472e05, #861c0e 30%, #bb4e0b, #ec6816, #f18216, #faa842); */
}

.color-7 {
	background-color: #631219;
}

.color-9 {
	background-color: #cd6132;
}

.color-8 {
	background-color: #d18c01;
}

.color-1 {
	background-color: #861c0e;
}

.color-2 {
	background-color: #883a0c;
}

.color-3 {
	background-color: #bb4e0b;
}

.color-4 {
	background-color: #ec6816;
}

.color-5 {
	background-color: #f18216;
}

.color-6 {
	background-color: #faa842;
}

.dresscode {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	gap: 16px;
}

.dflex {
	display: flex;

}

.separator {
	width: 1px;
	transform: translateY(0px);
	height: 50px;
	background-color: #0000002e;
}

.side {
	display: flex;
	flex-direction: column;
	gap: 5px;
	justify-content: center;
	align-items: center;
	width: 150px;
}

.icon-gender {
	width: 20px;
}

@media screen and (min-width: 768px) {

	.images {
		transform: translateY(0);
	}

	.the-colors {
		transform: translateY(0);
	}


	.container-dress {
		width: 150px;
	}

	.man {
		width: 170px;
	}
}</style>