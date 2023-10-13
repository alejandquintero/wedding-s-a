<template>
	<swiper :navigation="true" :modules="modules" class="mySwiper">	

	  <swiper-slide>
		<div class="slide first-slide">
			<span class="big-day">THE BIG DAY</span>
			<span class="sub-big-day">septiembre 20, 2024</span>
		</div>
	  </swiper-slide>
  		
	  <swiper-slide>
		<div class="slide second-slide">
			<div class="names">
				<span>Sarahys</span>
				<span>&</span>
				<span>Alejandro</span>
			</div>
			<div class="description">
				Lorem ipsum dolor sit amet consectetur adipisicing elit. Reiciendis non corrupti dolore consequatur atque rem architecto distinctio ad, vero tempore quisquam? Rem eos dolor exercitationem suscipit illo ab voluptate magnam.
			</div>
			<div class="time bold">
				20 . 09 . 24
			</div>
			<div class="locations">
				<div class="church">
					<span class="bold">boda</span>
					<span>parroquia santo domingo de tilos</span>
					<span>icono</span>
				</div>
				<div class="party">
					<span class="bold">fiesta</span>
					<span>finca buenos aires</span>
					<span>icono</span>
				</div>
			</div>
		</div>
	  </swiper-slide>
	  <swiper-slide>
		<div class="slide third-slide">
			<div class="titles">
				<h1 class="title">Dresscode</h1>
				<h2 class="subtitle">formal</h2>
			</div>
			<div class="dresscode">
				<div class="women">
					<span>Mujeres: vestido largo colores terracota</span>
				</div>
				<div class="men">
					<span>Hombres: traje formal</span>
				</div>
			</div>
			<div class="images">
				<div class="container-dress">
					<img src="../assets/woman.jpeg">
				</div>
				<div class="container-dress">
					<img src="../assets/man.jpeg">
				</div>
			</div>
		</div>
	  </swiper-slide>
	  <swiper-slide>
		<div class="slide fourth-slide">
			<h1 class="title">itinerario</h1>
			<div class="container-itinerary">
				<div class="activity">
					<div class="left-side">
						<div class="container-logo">
							<img src="../assets/engagement-ring.png">
						</div>
					</div>
					<div class="rigth-side">
						<span class="hour">17:00</span>
						<span class="name-activity">ceremonia</span>
					</div>
				</div>
				<div class="activity">
					<div class="left-side">
						<div class="container-logo">
							<img src="../assets/champagne-glass.png">
						</div>
					</div>
					<div class="rigth-side">
						<span class="hour">19:00</span>
						<span class="name-activity">cóctel</span>
					</div>
				</div>
				<div class="activity">
					<div class="left-side">
						<div class="container-logo">
							<img src="../assets/dance.png">
						</div>
					</div>
					<div class="rigth-side">
						<span class="hour">20:00</span>
						<span class="name-activity">baile</span>
					</div>
				</div>
				<div class="activity">
					<div class="left-side">
						<div class="container-logo">
							<img src="../assets/food.png">
						</div>
					</div>
					<div class="rigth-side">
						<span class="hour">21:00</span>
						<span class="name-activity">banquete</span>
					</div>
				</div>
				<div class="activity">
					<div class="left-side">
						<div class="container-logo">
							<img src="../assets/dance-party.png">
						</div>
					</div>
					<div class="rigth-side">
						<span class="hour">23:00</span>
						<span class="name-activity">party</span>
					</div>
				</div>
			</div>
		</div>
	  </swiper-slide>
	</swiper>
  
	</template>
	
	<script>
	   // Import Swiper Vue.js components
	   import { Swiper, SwiperSlide } from 'swiper/vue';
  
  // Import Swiper styles
  import 'swiper/css';
  
  import 'swiper/css/navigation';
  
  
  // import required modules
  import { Navigation } from 'swiper/modules';
  
  export default {
	components: {
	  Swiper,
	  SwiperSlide,
	},
	setup() {
	  return {
		modules: [Navigation],
	  };
	},
  };
  </script>
	
  <style scoped>

  img{
	max-width: 100%;
  }
  .first-slide{
	display: flex;
	flex-direction: column;
	font-family: 'Sky';
  }
	.slide{
		max-width: 600px;
	}
  .second-slide{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	gap: 2rem;
  }

  .bold{
	font-weight: bold;
  }
  .time{
	font-size: 2.5rem;
  }

  .title{
	font-family: 'Athalia';
	font-size: 5rem;
  }

  .third-slide{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	gap: 50px;
  }

  .names{
	display: flex;
	flex-direction: column;
	line-height: 90px;
	font-size: 6rem;
	font-family: 'Athalia';
  }
  .locations{
	display: flex;
	justify-content: center;
	align-items: center;
	gap: 12px;
  }
  .church, .party{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	width: 250px;
  }
  .party{
	border-left: 1px solid #0000002e;
  }

  .images{
	display: flex;
	justify-content: center;
	align-items: center;
  }

  .container-dress{
	width: 200px;
  }

  .fourth-slide{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	gap: 2rem;
  }
  .titles{
	display: flex;
	flex-direction: column;
	line-height: 40px;
  }

  h1, h2{
	margin: 0;
	padding: 0;
  }

  .subtitle{
	font-size: 1.3rem;
  }

  .container-logo{
	width: 100px;
	padding: .7rem;
  }

  .left-side{
	display: flex;
	justify-content: center;
	align-items: center;
	width: 300px;
	border-right: 1px solid #0000002e;
	position: relative;
  }

  .left-side::after{
	content: '';
	position: absolute;
	width: 10px;
	height: 10px;
	background-color: #000000d3;
	border-radius: 50%;
	top : 50%;
	right: 0;
	transform: translate(6px, -10px);
  }
  .container-itinerary{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	width: 600px;
  }

  .activity{
	display: flex;
	justify-content: center;
	align-items: center;
  }

  .rigth-side{
	width: 300px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
  }
  .swiper-slide {
	text-align: center;
	padding: 4rem;
	font-size: 18px;
	font-family: 'Sky';
	background-color: #f4f5f7;
	height: 100vh;  
	display: flex;
	justify-content: center;
	align-items: center;
  }
  .swiper-slide img {
	display: block;
	width: 100%;
	height: 100%;
	object-fit: cover;
  }
	</style>
	