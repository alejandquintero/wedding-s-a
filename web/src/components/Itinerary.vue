<template>
	<div class="slide">
	  <h1 class="title">Itinerario</h1>
	  <div class="container-itinerary">
		<div class="activity" v-for="item in activities" :key="item.id">
		  <div class="left-side">
			<div class="container-logo">
			  <img :src="item.image" alt="Actividad">
			</div>
		  </div>
		  <div class="right-side">
			<span class="hour">{{ item.hour }}</span>
			<span class="name-activity">{{ item.name }}</span>
		  </div>
		</div>
	  </div>
	</div>
  </template>
  
  <script>
  export default {
	name: 'Itinerary',
	data() {
	  return {
		activities: [
		  {
			id: 1,
			image: 'icons/engagement-ring.png',
			hour: '17:00',
			name: 'ceremonia'
		  },
		  {
			id: 2,
			image: 'icons/champagne-glass.png',
			hour: '19:00',
			name: 'cóctel'
		  },
		  {
			id: 3,
			image: 'icons/dance.png',
			hour: '20:00',
			name: 'baile'
		  },
		  {
			id: 4,
			image: 'icons/food.png',
			hour: '21:00',
			name: 'banquete'
		  },
		  {
			id: 5,
			image: 'icons/dance-party.png',
			hour: '23:00',
			name: 'party'
		  }
		]
	  };
	},
  }
  </script>
  
  <style scoped>

.container-logo{
	width: 100px;
	padding: 1.5rem;
  }

  .name-activity, .hour{
	color: var(--vt-c-slide-color-titles);
  }

  .left-side{
	display: flex;
	justify-content: center;
	align-items: center;
	width: 150px;
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

  .right-side{
	width: 150px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
  }

  @media screen and (min-width: 768px) {
	.left-side, .right-side{
		width: 300px;
   	}
	.fourth-slide{
		gap: 2rem;
 	}

	.container-logo{
		width: 100px;
		padding: .7rem;
  	}
}
</style>
  