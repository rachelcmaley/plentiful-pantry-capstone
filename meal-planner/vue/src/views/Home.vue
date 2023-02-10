<template>
  <div>
      <div class="home-grid">

        <header >
          <NavBar></NavBar>
        </header>

        <main>
        <MealPlanWeek></MealPlanWeek>
        </main>

        <div id="myPantryHome">  
          <MyPantry class="hello"></MyPantry>
        </div>

        <footer id="recRecipiesHome"> 
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
  "pantry recipies recipies recipies";
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

#myPantryHome{

  grid-area: pantry;
  margin-top: 25px;
  margin-left: 160px;
  border: solid rgb(0, 194, 113) 3px;
  border-radius: 20px;
  background-color: rgba(209, 255, 200, 0.788);
  color: green;
  height:425px;
  width: 300px;
  font-family:  'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}

.hello {
   /* margin-left: 10px; */
    overflow: auto;
    overflow-y: scroll;
    width: 280px;
    height: 400px;
    background: rgb(255, 255, 255);
    border-bottom-left-radius: 10px;
    border-bottom-right-radius: 10px;
    margin-top: 10px;
    margin-left: 8px;
    color: green;

}

.hello::-webkit-scrollbar {
  width: 10px;
}
.hello::-webkit-scrollbar-thumb {
  background: #f895a2;
  border-radius: 2rem;
}

#recRecipiesHome{
  grid-area: recipies;
  margin-top: 25px;
  margin-left: 30px;
}


</style>
