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

		<swiper-slide v-if="codeValid">
			<ConfirmForm :members="members"></ConfirmForm>
		</swiper-slide>

		<swiper-slide>
			<Gifts :members="members"></Gifts>
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
import ConfirmForm from './ConfirmForm.vue'
import Gifts from './Gifts.vue'

export default {
	data() {
		return {
			codeValid: false,
			api: null,
			code: null,
			members: null
		}
	},
	mounted() {
		this.api = import.meta.env.VITE_URL_API
		this.code = window.location.pathname.split("/").pop()

		if (this.code.length > 0) {
			let endpoint = import.meta.env.VITE_ENDPOINT_LIST_MEMBERS
			fetch(`${this.api}/${this.code}/${endpoint}`)
				.then((response) => {
					if (response.status == 200) {
						return response.json()
					}
					throw Error(response.status)
				})
				.then((data) => {
					if (data.length > 0) {
						this.codeValid = true;
						this.members = data[0];
					}
					else {
						this.codeValid = false;
					}
				})
				.catch((error) => {
					this.codeValid = false;
					console.error(error)
				});
		}
	},
	components: {
		Swiper,
		SwiperSlide,
		BigDay,
		Details,
		Dresscode,
		Itinerary,
		ConfirmForm,
		Gifts
	},
	setup() {
		return {
			modules: [Navigation],
		};
	},
};
</script>
	
<style>
a:hover {
	background-color: none;
}

img {
	max-width: 100%;
}

.slide {
	color: var(--vt-c-slide-color-paragraph);
	max-width: 300px;
	min-height: 100vh;
	padding: 2.5rem 0;
	display: flex;
	flex-direction: column;
	justify-content: space-evenly;
	align-items: center;
}

.bold {
	color: var(--vt-c-slide-color-titles);
	font-weight: bold;
}

h1,
h2 {
	margin: 0;
	padding: 0;
	color: var(--vt-c-slide-color-titles);
}

.title {
	font-family: 'Athalia';
	font-size: 3rem;
}

.swiper-slide {
	text-align: center;
	padding: 4rem;
	font-size: 16px;
	font-family: 'Sky';
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
	.slide {
		max-width: 600px;
	}

	.swiper-slide {
		font-size: 18px;
	}

	.title {
		font-size: 5rem;
	}
}
</style>
	