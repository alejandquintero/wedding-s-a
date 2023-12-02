<template>
	<div class="slide">
	  <div class="titles">
		<h1 class="title">Dresscode</h1>
	  </div>
	  <div class="dresscode">
		<div class="side">
		  <span class="bold">otoño elegante</span>
		  <div class="icon-gender">
			<img src="../assets/male-gender.png" alt="Género masculino">
		  </div>
		  <span>traje formal negro</span>
		</div>
		<div class="separator"></div>
		<div class="side">
		  <span class="bold">atuendo formal</span>
		  <div class="icon-gender">
			<img src="../assets/female-gender.png" alt="Género femenino">
		  </div>
		  <span>vestido largo</span>
		</div>
	  </div>
	  <div class="the-colors">
		<span class="bold">los colores</span>
		  <div class="container-colors">
			  <div class="colors color-7"></div>
			  <div class="colors color-1"></div>
			  <div class="colors color-2"></div>
			  <div class="colors color-3"></div>
			  <div class="colors color-9"></div>
			  <div class="colors color-4"></div>
			  <div class="colors color-5"></div>
			  <div class="colors color-6"></div>
		  </div>
	  </div>
	  <div class="images">
		<div class="container-dress man">
			<img src="../assets/man.png" alt="Traje formal para hombres">
		</div>
		<div class="container-dress woman">
		  	<img src="../assets/woman.png" alt="Vestido largo para mujeres">
		</div>
	  </div>
	</div>
  </template>
  
  <script>
  export default {
	name: 'Dresscode',
  }
  </script>
  
  <style scoped>

	h1{
		height: 70px;
	}
	.titles{
	display: flex;
	flex-direction: column;
  }
  .subtitle{
	font-size: 1.3rem;
  }
  .images{
	display: flex;
	justify-content: center;
	align-items: center;
	transform: translateY(25px);
  }

  .the-colors{
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

  .container-dress{
	width: 150px;
  }

  .man{
	width: 175px;
	transform: translate(37px, -11px);
  }

  .woman{
	transform: translate(-45px, 0px);
  }

  .container-colors{
	display: flex;
	gap: 10px;
  }

  .colors{
	  width: 25px;
	  height: 25px;
	  border-radius: 50%;
	  /* background: linear-gradient(90deg, #472e05, #861c0e 30%, #bb4e0b, #ec6816, #f18216, #faa842); */
  }

  .color-7{
	  background-color: #631219;
	}

	.color-9{
	  background-color: #cd6132;
	}

	.color-8{
	  background-color: #d18c01;
	}
  .color-1{
	  background-color: #861c0e;
	}
	
	.color-2{
		background-color: #883a0c;
	}
  .color-3{
	background-color: #bb4e0b;
  }
  
  .color-4{
	background-color: #ec6816;
  }
  
  .color-5{
	background-color: #f18216;
  }
  .color-6{
	background-color: #faa842;
  }

  .dresscode{
	display: flex;
	justify-content: center;
	align-items: center;
	gap: 16px;
  }

  .separator{
	width: 1px;
	transform: translateY(10px);
	height: 50px;
	background-color: #0000002e;
  }

  .side{
	display: flex;
	flex-direction: column;
	gap: 5px;
	justify-content: center;
	align-items: center;
	width: 150px;
  }

.icon-gender{
	width: 20px;
}
  
  @media screen and (min-width: 768px) {

	.images{
	transform: translateY(0);
  }

  .the-colors{
	transform: translateY(0);
  }


	.container-dress{
	width: 150px;
  }

  .man{
	width: 170px;
  }
}
  </style>