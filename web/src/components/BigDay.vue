<template>
	<div class="slide first-slide">
	  <span class="big-day">THE BIG DAY</span>
	  <span class="sub-big-day">viernes, 20 septiembre, 2024</span>
	</div>
  </template>
  
  <script>
  export default {
	name: 'BigDay',
  }
  </script>
  
  <style scoped>
  .big-day{
	font-size: 4rem;
	font-weight: bold;
	letter-spacing: 10px;
  }
  .sub-big-day{
	font-size: 1rem;
	font-weight: 400;
	letter-spacing: 3px;
  }
  .first-slide{
	display: flex;
	flex-direction: column;
	justify-content: center;
	font-family: 'Sky';
  }

  @media screen and (min-width: 768px) {
  .sub-big-day{
	font-size: 1.2rem;
	letter-spacing: 5px;
  }
}
  </style>