<template>
	<div class="slide third-slide">
	  <div class="titles">
		<h1 class="title">Dresscode</h1>
		<h2 class="subtitle">formal</h2>
	  </div>
	  <div class="dresscode">
		<div class="women">
		  <span><map name=""></map><menu type="toolbar"></menu>ujeres: vestido largo colores terracota</span>
		</div>
		<div class="men">
		  <span>hombres: traje formal</span>
		</div>
	  </div>
	  <div class="images">
		<div class="container-dress">
		  <img src="../assets/woman.jpeg" alt="Vestido largo para mujeres">
		</div>
		<div class="container-dress">
		  <img src="../assets/man.jpeg" alt="Traje formal para hombres">
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
	gap: 50px;
  }


  .images{
	display: flex;
	justify-content: center;
	align-items: center;
  }

  .container-dress{
	width: 150px;
  }

  @media screen and (min-width: 768px) {
	.container-dress{
	width: 200px;
  }
}
  </style>