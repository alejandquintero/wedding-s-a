<template>
	<div class="slide second-slide">
	  <div class="names">
		<h1>Sarahys</h1>
		<h1 class="special">&</h1>
		<h1>Alejandro</h1>
	  </div>
	  <div class="description">
		¡te invitamos a vivir un momento único en nuestras vidas!
	  </div>
	  <div class="dates">
		<span class="time bold">20 . 09 . 24</span>
		<span>
			<span class="countdown">{{ days }}</span> días
			<span class="countdown">{{ hours }}</span> hrs
			<span class="countdown">{{ minutes }}</span> min
			<span class="countdown">{{ seconds }}</span> seg
		</span>
	  </div>
	  <div class="locations">
		<div class="church">
		  <span class="bold">ceremonia</span>
		  <a href="https://maps.app.goo.gl/Gdr5KhaH3z231UQt5" target="_blank" class="icon-location tada">
			<img src="../assets/location.png" alt="Ubicación de la iglesia">
		  </a>
		  <span class="where">santo domingo de silos</span>
		</div>
		<div class="separator"></div>
		<div class="party">
		  <span class="bold">party</span>
		  <a href="https://maps.app.goo.gl/5wzmC2yJCt6qVxua9" target="_blank" class="icon-location tada">
			<img src="../assets/location.png" alt="Ubicación de la fiesta">
		  </a>
		  <span class="where">finca buenos aires</span>
		</div>
	  </div>
	</div>
  </template>
  
  <script>
  export default {
	name: 'Details',
	data() {
		return {
		targetDate: new Date("2024-09-20T17:00:00"),
		days: 0,
		hours: 0,
		minutes: 0,
		seconds: 0,
		};
	},
	methods: {
		updateCountdown() {
		const currentDate = new Date();
		const timeDifference = this.targetDate - currentDate;
		if (timeDifference > 0) {
			this.days = Math.floor(timeDifference / (1000 * 60 * 60 * 24));
			this.hours = Math.floor((timeDifference % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
			this.minutes = Math.floor((timeDifference % (1000 * 60 * 60)) / (1000 * 60));
			this.seconds = Math.floor((timeDifference % (1000 * 60)) / 1000);
		}
		},
	},
	created() {
		this.updateCountdown();
		this.timer = setInterval(this.updateCountdown, 1000);
	},
	beforeDestroy() {
		clearInterval(this.timer);
	},
  }
  </script>
  
  <style scoped>

  .dates{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
  }
  .second-slide{
	justify-content: center;
	gap: 1.25rem;
  }
.special{
	font-family: 'Brilliant';
}

.description{
	text-align: center;
	padding: 0 1rem;
}
  .names{
	display: flex;
	flex-direction: column;
	gap: 15px;
	line-height: 60px;
	font-family: 'Athalia';
  }

   h1{
	font-size: 5rem;
   }

  .where{
	display: flex;
	align-items: center;
  }
  .locations{
	display: flex;
	justify-content: center;
	align-items: center;
	gap: 16px;
  }

  .separator{
	width: 1px;
	height: 100px;
	background-color: #0000002e;
  }

  .church, .party{
	display: flex;
	flex-direction: column;
	gap: 5px;
	justify-content: center;
	align-items: center;
	width: 150px;
  }

.icon-location{
	cursor: pointer;
	width: 20px;
}

.time{
	font-size: 2.2rem;
}

.tada {
  -webkit-animation-name: tada;
  animation-name: tada;
  -webkit-animation-duration: 1s;
  animation-duration: 1s;
  -webkit-animation-fill-mode: both;
  animation-fill-mode: both;
  animation-iteration-count: infinite;
  }
  @-webkit-keyframes tada {
  0% {
  -webkit-transform: scale3d(1, 1, 1);
  transform: scale3d(1, 1, 1);
  }
  10%, 20% {
  -webkit-transform: scale3d(.9, .9, .9) rotate3d(0, 0, 1, -3deg);
  transform: scale3d(.9, .9, .9) rotate3d(0, 0, 1, -3deg);
  }
  30%, 50%, 70%, 90% {
  -webkit-transform: scale3d(1.1, 1.1, 1.1) rotate3d(0, 0, 1, 3deg);
  transform: scale3d(1.1, 1.1, 1.1) rotate3d(0, 0, 1, 3deg);
  }
  40%, 60%, 80% {
  -webkit-transform: scale3d(1.1, 1.1, 1.1) rotate3d(0, 0, 1, -3deg);
  transform: scale3d(1.1, 1.1, 1.1) rotate3d(0, 0, 1, -3deg);
  }
  100% {
  -webkit-transform: scale3d(1, 1, 1);
  transform: scale3d(1, 1, 1);
  }
  }
  @keyframes tada {
  0% {
  -webkit-transform: scale3d(1, 1, 1);
  transform: scale3d(1, 1, 1);
  }
  10%, 20% {
  -webkit-transform: scale3d(.9, .9, .9) rotate3d(0, 0, 1, -3deg);
  transform: scale3d(.9, .9, .9) rotate3d(0, 0, 1, -3deg);
  }
  30%, 50%, 70%, 90% {
  -webkit-transform: scale3d(1.1, 1.1, 1.1) rotate3d(0, 0, 1, 3deg);
  transform: scale3d(1.1, 1.1, 1.1) rotate3d(0, 0, 1, 3deg);
  }
  40%, 60%, 80% {
  -webkit-transform: scale3d(1.1, 1.1, 1.1) rotate3d(0, 0, 1, -3deg);
  transform: scale3d(1.1, 1.1, 1.1) rotate3d(0, 0, 1, -3deg);
  }
  100% {
  -webkit-transform: scale3d(1, 1, 1);
  transform: scale3d(1, 1, 1);
  }
  } 

@media screen and (min-width: 768px) {
	.names{
	line-height: 90px;
  }

  h1{
	font-size: 6rem;
  }

  .time {
	font-size: 2.5rem;
	}

	.locations{
		align-items: center;
	}

	.church, .party{
	gap: 5px;
	width: 250px;
  }

  .second-slide{
	gap: 2rem;
  }
}

</style>