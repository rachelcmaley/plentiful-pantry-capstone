<template>
  <div class="home">
      <NavBar></NavBar>
      <div class="home-grid">
      <div id="firstcontainer">
      <MealPlanWeek></MealPlanWeek>
      </div>
      <div id="secondcontainer">
        <MyPantry></MyPantry>
        <RecommendedRecipes></RecommendedRecipes>
      </div>
      </div>
    <!-- <h1>Home</h1>
    <p>You must be authenticated to see this or not</p> -->
  </div>
</template>

<script>
import NavBar from "../components/NavBar.vue";
import MealPlanWeek from "../components/MealPlanWeek.vue";
import MyPantry from "../components/MyPantry.vue";
import RecommendedRecipes from "../components/RecommendedRecipes.vue";

export default {
  name: "home",
  components: {
    NavBar,
    MealPlanWeek,
    MyPantry,
    RecommendedRecipes
  },
    created(){
        this.$store.commit('UPDATE_PAGE', 'homePage')
    }
};
</script>

<style>
body{
/* background: url("home-image.jpg"); */
background-size: cover;
}
.home-grid{
  display:grid;

  grid-template-rows: 1fr 1fr;
  row-gap: 20px;
  grid-template-areas:"firstcontainer"
                      "secondcontainer";
}
#firstcontainer{
  grid-area: firstcontainer;
}
#secondcontainer{
  display: grid;
  grid-template-columns: 1fr 3fr;
  grid-template-areas: "mypantry recommended";
  gap: 20px;
  grid-area:secondcontainer;
  margin: 0px 20px 0px 20px;
}

MyPantry{
  grid-area: mypantry;
}
RecommendedRecipes{
  grid-area: recommended;
}
</style>
