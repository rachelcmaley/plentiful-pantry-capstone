<template>
  <div class="container">
    <div class="recipe-wrapper">
      <div class="recipe-search">
        <h2 class="title">Recipes You Can Make</h2>

        <!-- <div class="recipe-search-box">
          <input
            type="text"
            class="search-control"
            v-model="searchWord"
            placeholder="Search"
            id="search"
          />
          <button
            type="submit"
            class="search-btn"
            id="search-btn"
            @click="search"
          >
            Search
          </button>
        </div> -->

        <div class="recipe-result">
          <div id="recipe">
            <!-- recipe box -->
            <div class="recipe-item" v-for="recipe in $store.state.recipes" :key="recipe.id">
                            <div class="meal-img">
                                <img class='sgetti' v-bind:src="recipe.image">
                            </div>
                            <div class="recipe-name">
                                <h3>{{recipe.title}}</h3>
                                <button class="recipe-btn" @click="showRecipe(recipe.id)">Get Recipe</button>
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
              </div>
            </div> -->
            <!-- test box 4 -->
          </div>
        </div>



        <!-- POP UP RECIPE DETAILS BOX -->
        <RecipeDetails v-if="showDetails" :details="recipeDetails" :on-close="closeDetails"></RecipeDetails>
        
      </div>
    </div>
  </div>
</template>


<script>
import spoonacularService from "../services/SpoonacularService.js";
import RecipeDetails from "../components/RecipeDetails.vue";
import pantryService from "../services/PantryService.js";
import {mapGetters} from 'vuex'

export default {
  components: {
        RecipeDetails
    },
  data() {
    return {
      searchWord: "",
      recipes: [],
      recipeDetails: null,
      showDetails: false,
      ingredients: '',
      ingredientsList: []
    };
  
  },
  computed: {

    ...mapGetters ([
      'ingredientSearch'
    ])

  },
  created() {

    const stringIngredients = this.$store.state.pantry.map(ingredient => ingredient.ingredientName).join(',');

    const pantryPromise = pantryService.getPantryIngredients(this.$store.state.user.id);

    pantryPromise.then ((response) => {
      this.$store.commit("LOAD_PANTRY", response.data);

      spoonacularService.searchRecipes(stringIngredients).then((response) => {
        this.$store.commit("LOAD_RECIPES", response.data);
      });
    });
  },    
  methods: {
    // getIngredients() {
    //   pantryService.getPantryIngredients(this.$store.state.user.id).then((response) => {
    //     this.ingredients = response.data;
    //   })
    // },
    // search() {
    //   spoonacularService.searchRecipes(this.ingredients).then((response) => {
    //     this.recipes = response.data;
    //   });
    // },

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
  height: 200px;
  width: auto;
}

.text {
  opacity: 0.8;
}

.title {
  font-size: 2rem;
  margin-bottom: 80px;
  text-align: start;
}

.container {
  height: 100vh;
  width: 100vw;
}

.recipe-wrapper {
  margin: 0 auto;
  width: 100vw;
  padding-right: 2rem;
  text-align: center;
  padding-top: 10px;
}

.recipe-search {
  margin: 2rem;
}

.recipe-search-box {
  margin: 1.2rem 0;
  display: flex;
  align-items: stretch;
}

.search-control,
.search-button {
  width: 100%;
}

.search-control {
  padding: 0 1rem;
  font-size: 1.1rem;
  font-family: inherit;
  outline: 0;
  border: 1px solid #ffb20f;
  color: #ffb20f;
  border-top-left-radius: 2rem;
  border-bottom-left-radius: 2rem;
  transition: all 0.4s linear;
}

.search-control::placeholder {
  color: #ffb20f;
}

.search-btn {
  width: 90px;
  height: 50px;
  font-size: 19px;
  background: #ffb20f;
  color: rgb(78, 78, 78);
  border: none;
  border-top-right-radius: 2rem;
  border-bottom-right-radius: 2rem;
  transition: all 0.4s linear;
}

.search-btn:hover {
  background: #d39000;
}

.recipe-result {
  margin-top: 4rem;
}

#recipe {
  margin: 2.4rem 0;
}

.recipe-item {
  width: 300px;
  border-radius: 1rem;
  overflow: hidden;
  box-shadow: 0 4px 21px -12px rgba(0, 0, 0, 0.79);
  margin: 2rem 0;
}

.meal-img img {
  width: 100%;
  display: block;
}

.recipe-name {
  padding: 1.5rem 0.5rem;
}

.meal-name h3 {
  font-size: 1.4rem;
}

.recipe-btn {
  text-decoration: none;
  color: #fff;
  background: #ffb20f;
  font-weight: 1.1rem;
  padding: 0.75rem 0;
  display: block;
  width: 175px;
  margin: 1rem auto;
  border-radius: 2rem;
  transition: all 0.4s linear;
  border: none;
}

.recipe-btn:hover {
  background: #d39000;
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

@media screen and (min-width: 992px) {
  #recipe {
    grid-template-columns: repeat(4, 1fr);
    gap: 1rem;
  }
}
</style>