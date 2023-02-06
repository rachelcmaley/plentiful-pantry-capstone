<template>
  <div id="page-container">
      <section id="top-panel">
          <MealPlanWeek></MealPlanWeek>
      </section>
      <section id="bottom-panel">
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


</style>