<template>
  <!-- <div class="container"> -->
    <div class="saved-recipe-wrapper">
      <div class="recipe-search">
        <h2 class="title">Saved Recipes</h2>

        <div class="recipe-result">
          <div id="recipe">
            <!-- recipe box -->
            <div class="recipe-item" v-for="recipe in recipes" :key="recipe.id">
                            <div class="meal-img">
                                <img class='sgetti' v-bind:src="recipe.image">
                            </div>
                            <div class="recipe-name">
                                <h3>{{recipe.title}}</h3>
                                <button class="recipe-btn" @click="showRecipe(recipe.id)">Get Recipe</button>
                                <button class="add-meal-btn">Add to Meal Plan</button>
                            </div>
                        </div>
            <!-- end of recipe box -->

            <!-- test box 1 -->
            <!-- <div class="recipe-item">
              <div class="meal-img">
                <img
                  class="sgetti"
                  v-bind:src="
                    require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')
                  "
                />
              </div>
              <div class="recipe-name">
                <h3>Scgetti</h3>
                <a href="#" class="recipe-btn">Get Recipe</a>
                <button class="add-meal-btn">Add to Meal Plan</button>
              </div>
            </div> -->
            <!-- end of test box 1 -->
            <!-- test box 2 -->
            <!-- <div class="recipe-item">
              <div class="meal-img">
                <img
                  class="sgetti"
                  v-bind:src="
                    require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')
                  "
                />
              </div>
              <div class="recipe-name">
                <h3>Scgetti</h3>
                <a href="#" class="recipe-btn">Get Recipe</a>
                <button class="add-meal-btn">Add to Meal Plan</button>
              </div>
            </div> -->
            <!-- end of test box 2 -->


            <!-- test box 3 -->
            <!-- <div class="recipe-item">
              <div class="meal-img">
                <img
                  class="sgetti"
                  v-bind:src="
                    require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')
                  "
                />
              </div>
              <div class="recipe-name">
                <h3>Scgetti</h3>
                <a href="#" class="recipe-btn">Get Recipe</a>
                <button class="add-meal-btn">Add to Meal Plan</button>
              </div>
            </div> -->
            <!-- test box 3 -->


            <!-- test box 4 -->
            <!-- <div class="recipe-item">
              <div class="meal-img">
                <img
                  class="sgetti"
                  v-bind:src="
                    require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')
                  "
                />
              </div>
              <div class="recipe-name">
                <h3>Scgetti</h3>
                <a href="#" class="recipe-btn">Get Recipe</a>
                <button class="add-meal-btn">Add to Meal Plan</button>
              </div>
            </div> -->
            <!-- test box 4 -->
            <!-- test box 4 -->
            <!-- <div class="recipe-item">
              <div class="meal-img">
                <img
                  class="sgetti"
                  v-bind:src="
                    require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')
                  "
                />
              </div>
              <div class="recipe-name">
                <h3>Scgetti</h3>
                <a href="#" class="recipe-btn">Get Recipe</a>
                <button class="add-meal-btn">Add to Meal Plan</button>
              </div>
            </div> -->
            <!-- test box 4 -->
            <!-- test box 4 -->
            <!-- <div class="recipe-item">
              <div class="meal-img">
                <img
                  class="sgetti"
                  v-bind:src="
                    require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')
                  "
                />
              </div>
              <div class="recipe-name">
                <h3>Scgetti</h3>
                <a href="#" class="recipe-btn">Get Recipe</a>
                <button class="add-meal-btn">Add to Meal Plan</button>
              </div>
            </div> -->
            <!-- test box 4 -->
          </div>
        </div>



        <!-- POP UP RECIPE DETAILS BOX -->
        <RecipeDetails v-if="showDetails" :details="recipeDetails" :on-close="closeDetails"></RecipeDetails>
        
        <!-- POP UP ADD TO MEAL PLAN FORM -->
        <AddToMealPlan ></AddToMealPlan>

      </div>
    </div>
  <!-- </div> -->
</template>


<script>
import spoonacularService from "../services/SpoonacularService.js";
import RecipeDetails from "../components/RecipeDetails.vue";
import AddToMealPlan from "../components/AddToMealPlan.vue";
import recipesService from "../services/RecipesService.js";

export default {
  components: {
        RecipeDetails,
        AddToMealPlan
    },
  data() {
    return {
      searchWord: "",
      recipes: [],
      recipeDetails: null,
      showDetails: false,
      recipeIds: []
    };
  },
  created() {
      this.getRecipes();
  },
  methods: {
    //second step: use recipe id to search API
    // for each recipeId in recipeIds[], search recipeId in API and add to recipes[]
    getRecipes() {

      recipesService.getRecipeIdByUserId(this.$store.state.user.id).then((response) => {
          this.recipeIds = response.data;
          this.recipeIds.forEach((recipeId) => {
          spoonacularService.getRecipeById(recipeId).then((response) => {
            this.recipes.push(response.data)
          })
        });
      })
     
    },
    //first step: get recipe ID from database
    getRecipeId() {
      recipesService.getRecipeIdByUserId(this.$store.state.user.id).then((response) => {
        this.recipeIds = response.data;
      })
    },
    search() {
      spoonacularService.searchRecipes(this.searchWord).then((response) => {
        this.recipes = response.data;
      });
    },
    showRecipe(id) {
        spoonacularService.getRecipeById(id).then((response) => {
        this.recipeDetails = response.data;
        this.showDetails = true;
      });
    },
    closeDetails(){
        this.showDetails = false;
    }
  },
};
</script>


<style>
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}

#recipeBox{
  background-color: rgb(172, 87, 87);
  border-radius: 10px;
}

body {
  font-weight: 300;
  font-size: 1.05rem;
  line-height: 1.6;
  font-family: Arial, Helvetica, sans-serif;
}

.btn {
  font-family: inherit;
  cursor: pointer;
  outline: 0;
  font-size: 1.05rem;
}

.sgetti {
}

.text {
  opacity: 0.8;
}

.title {
  font-size: 2rem;

  /* margin-bottom: 1rem;
  text-align: center;
  color: #f5f5f5;
  padding: 10px;
  background-color: rgb(43, 92, 57);
  width:250px;
  border-radius: 6px;
  margin-left: auto;
  margin-right: auto;
   */
  text-align: start;
  color: #0B6E4F;
  padding-top: 10px;
  padding-bottom: 1rem;
  border-bottom: solid #ffb20f;

}

.container {
  height: 100vh;
  
  width: 100vw;
}


/* .recipe-wrapper {
  background: rgba(255, 255, 255, 0.781);
  text-align: center;
  height: 570px;
  width:1500px;
  margin-left: auto;
  margin-right: auto; 
} */ 


.saved-recipe-wrapper {
  width: 100vw;
  height: 66vh;
  padding-bottom: 1rem;
  padding-left: 3rem;
  background: rgb(255, 255, 255);
  text-align: center;
  overflow-y: scroll;
  margin-top: 20px;
  border: solid rgb(95, 156, 95) 3px;
    border-radius: 10px;
}

/* cute scrollbar */
.recipe-wrapper::-webkit-scrollbar {
  width: 10px;
}
.recipe-wrapper::-webkit-scrollbar-thumb {
  background: #074733;
  border-radius: 2rem;
}

.recipe-result {
  margin-top: 5px;
}

#recipe {
  margin-left: 40px;
}

.recipe-item {
  border-radius: 1rem;
  overflow: hidden;
  box-shadow: 0 4px 21px -12px rgba(0, 0, 0, 0.79);
  margin-right: auto;
  margin-left: 90px;
  background-color: white;
}

.meal-img img {
  display: block;
}

.recipe-name {
}

.meal-name h3 {
  font-size: 1.4rem;
}

.recipe-btn {
}

.recipe-btn:hover {
}

.add-meal-btn {
  text-decoration: none;
  color: #fff;
  background: #0B6E4F;
  font-weight: 1.1rem;
  padding: 0.75rem 0;
  display: block;
  width: 175px;
  margin: 1rem auto;
  border-radius: 2rem;
  transition: all 0.4s linear;
  border: none;
}

.add-meal-btn:hover {
  background: #074733;
}

/* MEDIA QUERIES */
@media screen and (min-width: 600px) {
  .recipe-search-box {
    width: 540px;
    margin-left: auto;
    margin-right: auto;
  }
}

@media screen and (min-width: 768px) {
  #recipe {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 2rem;
  }
  .recipe-item {
    margin: 0;
  }
  .recipe-details{
      width: 700px;
  }
  
}

@media screen and (min-width: 1025px) {
  #recipe {
    grid-template-columns: repeat(5, 1fr);
    gap: 2rem;
  }
}
</style>