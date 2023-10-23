<template>
	<div class="slide third-slide">
	  <div class="titles">
		<h1 class="title">Dresscode</h1>
		<h2 class="subtitle">formal</h2>
	  </div>
	  <div class="dresscode">
		<div class="women">
		  <span><map name=""></map><menu type="toolbar"></menu>mujeres: vestido largo colores terracota</span>
		</div>
		<div class="men">
		  <span>hombres: traje formal</span>
		</div>
	  </div>
	  <div class="images">
		<div class="container-dress man">
			<img src="../assets/hombre.png" alt="Traje formal para hombres">
		</div>
		<div class="container-dress woman">
		  	<img src="../assets/mujer.png" alt="Vestido largo para mujeres">
		</div>
	  </div>
	  <div class="container-colors">
		  <div class="colors">
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

	.titles{
	display: flex;
	flex-direction: column;
	line-height: 40px;
  }
  .subtitle{
	font-size: 1.3rem;
  }
  .third-slide{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	gap: 20px;
  }
  .images{
	display: flex;
	justify-content: center;
	align-items: center;
  }

  .dresscode{
	display: flex;
	flex-direction: column;
	align-items: flex-start;
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
	  width: 250px;
	  height: 30px;
	  border-radius: 40px;
	  background: linear-gradient(90deg, #472e05, #861c0e 30%, #bb4e0b, #ec6816, #f18216, #faa842);
  }
  
  @media screen and (min-width: 768px) {
	.container-dress{
	width: 200px;
  }

  .man{
	width: 225px;
  }
}
  </style>