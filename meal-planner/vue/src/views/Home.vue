<template>
  <div>
      <div class="home-grid">

        <header>
          <NavBar></NavBar>
        </header>

        <main>
        <MealPlanWeek></MealPlanWeek>
        </main>

        <aside>  
          <MyPantry></MyPantry>
        </aside>

        <footer> 
          <RecommendedRecipes></RecommendedRecipes>
        </footer>

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

.home-grid{
  display:grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
  grid-template-areas: 
  "navBar navBar navBar navBar"
  "mpw mpw mpw mpw "
  "pantry pantry recipies recipies"
}

header{
  grid-area: navBar;
  margin-top: 40px;
  height: 50px;
}


main{
  grid-area: mpw;
  width: 1600px;
  margin: auto;
  margin-top: 25px;
}

aside{
  grid-area: pantry;
  margin-top: 25px;
  margin:auto;
}

footer{
  grid-area: recipies;
  margin-top: 25px;
  margin:auto;

}


</style>
