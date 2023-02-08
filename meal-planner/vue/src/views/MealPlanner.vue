<template>
  <div id="page-container">
      <section class="top-panel" id="topPanel">
          <MealPlanWeek></MealPlanWeek>
      </section>
      <section  class="bottom-panel" id="bottomPanel">
          <SavedRecipes></SavedRecipes>
      </section>
  </div>
</template>

<script>
import MealPlanWeek from "../components/MealPlanWeek.vue"
import SavedRecipes from "../components/SavedRecipes.vue"

export default {
    name: "meal-planner",
    components: {
        MealPlanWeek,
        SavedRecipes
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
</style>