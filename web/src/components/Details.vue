<template>
	<div class="slide second-slide">
	  <div class="names">
		<span>Sarahys</span>
		<span>&</span>
		<span>Alejandro</span>
	  </div>
	  <div class="description">
		Lorem ipsum dolor sit amet consectetur adipisicing elit. Reiciendis non corrupti dolore consequatur atque rem architecto distinctio ad, vero tempore quisquam? Rem eos dolor exercitationem suscipit illo ab voluptate magnam.
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
		  <span class="where">parroquia de santo domingo de silos</span>
		  <a href="https://maps.app.goo.gl/Gdr5KhaH3z231UQt5" target="_blank" class="icon-location">
			<img src="../assets/location.png" alt="Ubicación de la iglesia">
		  </a>
		</div>
		<div class="party">
		  <span class="bold">fiesta</span>
		  <span class="where">finca buenos aires</span>
		  <a href="https://maps.app.goo.gl/5wzmC2yJCt6qVxua9" target="_blank" class="icon-location">
			<img src="../assets/location.png" alt="Ubicación de la fiesta">
		  </a>
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
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	gap: 1rem;
  }

  .names{
	display: flex;
	flex-direction: column;
	line-height: 60px;
	font-size: 4rem;
	font-family: 'Athalia';
  }

  .where{
	display: flex;
	align-items: center;
	min-height: 55px;
  }
  .locations{
	display: flex;
	justify-content: center;
	align-items: flex-start;
	gap: 12px;
  }
  .church, .party{
	display: flex;
	flex-direction: column;
	gap: 5px;
	justify-content: center;
	align-items: center;
	width: 150px;
  }
  .party{
	border-left: 1px solid #0000002e;
  }

.icon-location{
	cursor: pointer;
	width: 30px;
}

.time{
	font-size: 2rem;
}

@media screen and (min-width: 768px) {
	.names{
	line-height: 90px;
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