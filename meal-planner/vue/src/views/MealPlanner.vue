<template>
  <div id="page-container">
      <header>
          <NavBar></NavBar>
      </header>
      <section class="top-panel" id="topPanel">
          <MealPlanWeek></MealPlanWeek>
      </section>
      <section  class="bottom-panel" id="bottomPanel">
          <SavedRecipes></SavedRecipes>
      </section>
  </div>
</template>

<script>
import NavBar from "../components/NavBar.vue";
import MealPlanWeek from "../components/MealPlanWeek.vue"
import SavedRecipes from "../components/SavedRecipes.vue"

export default {
    name: "meal-planner",
    components: {
        MealPlanWeek,
        SavedRecipes,
        NavBar
    }

}
</script>


<style>
        #topPanel{
            width: 1400px;
            margin-left:auto;
            margin-right: auto;
            margin-top: 40px;
        }

        #bottomPanel{
            height: 9px;
        }

        #page-container{
            background-image: url("../assets/images/berriesAndDessert.png");
            background-size: cover;
            background-position: center;
            position: fixed;
            height: 100%;
            width: 100%;
            background-repeat: no-repeat;
            overflow: no-repeat;
        }
</style>
