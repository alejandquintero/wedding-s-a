<template>
	<swiper :navigation="true" :modules="modules" class="mySwiper">	

	  <swiper-slide>
		<BigDay></BigDay>
	  </swiper-slide>
  		
	  <swiper-slide>
		<Details></Details>
	  </swiper-slide>

	  <swiper-slide>
		<Dresscode></Dresscode>
	  </swiper-slide>

	  <swiper-slide>
		<Itinerary></Itinerary>
	  </swiper-slide>
	</swiper>
  
</template>
	
<script>
  import 'swiper/css';  
  import 'swiper/css/navigation';
  import { Swiper, SwiperSlide } from 'swiper/vue';
  import { Navigation } from 'swiper/modules';
  import BigDay from './BigDay.vue'
  import Details from './Details.vue'
  import Dresscode from './Dresscode.vue'
  import Itinerary from './Itinerary.vue'
  
  export default {
	components: {
	  Swiper,
	  SwiperSlide,
	  BigDay,
	  Details,
	  Dresscode,
	  Itinerary
	},
	setup() {
	  return {
		modules: [Navigation],
	  };
	},
  };
  </script>
	
  <style>
	a:hover{
		background-color: none;
	}

	img{
		max-width: 100%;
	}

	.slide{
	max-width: 300px;
	}

	.bold{
	font-weight: bold;
	}

	h1, h2{
	margin: 0;
	padding: 0;
	}

	.title{
		font-family: 'Athalia';
		font-size: 4rem;
	}

	.swiper-slide {
	text-align: center;
	padding: 4rem;
	font-size: 16px;
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

	@media screen and (min-width: 768px) {
		.slide{
			max-width: 600px;
		}

		.swiper-slide {
			font-size: 18px;
		}

		.title{
			font-size: 5rem;
		}
	}
	
	
</style>
	