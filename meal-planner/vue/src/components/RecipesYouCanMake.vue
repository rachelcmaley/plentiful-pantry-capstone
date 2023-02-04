<template>
  <div class="container">
    <div class="recipe-wrapper">
      <div class="recipe-search">
        <h2 class="title">Recipes You Can Make</h2>

        <div class="recipe-search-box">
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
            Test Search
          </button>
        </div>

        <div class="recipe-result">
          <h2 class="title">
            Your Search Results
            <!-- test header remove later -->
          </h2>
          <div id="recipe">
            <!-- recipe box -->
            <div class="recipe-item" v-for="recipe in recipes" :key="recipe.id">
                            <div class="meal-img">
                                <img class='sgetti' v-bind:src="recipe.image">
                            </div>
                            <div class="recipe-name">
                                <h3>{{recipe.title}}</h3>
                                <button class="recipe-btn" @click="showRecipe(recipe.id)">Get Recipe</button>
                            </div>
                        </div>
            <!-- end of recipe box -->
            <!-- recipe box -->
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
            <!-- end of recipe box -->
            <!-- recipe box -->
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
            <!-- end of recipe box -->
            <!-- recipe box -->
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
            <!-- end of recipe box -->
            <!-- recipe box -->
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
            <!-- end of recipe box -->
          </div>
        </div>



        <!-- POP UP RECIPE DETAILS BOX -->
        <div class="recipe-details">
          <!-- recipe close btn -->
          <button
            type="button"
            class="btn recipe-close-btn"
            id="recipe-close-btn"
            @click="closeDetails()"
          >
            &times;
          </button>

          <!-- recipe content -->
          <div class="recipe-details-content">
            <h2 class="recipe-title">Recipe Title Here</h2>
            <p class="recipe-category">category name</p>
            <div class="recipe-instruction">
              <h3>Instructions:</h3>

                <div>
                  <p>{{ recipeDetails }}</p>
                </div>

              <!-- <p> Lorem, ipsum dolor sit amet consectetur adipisicing elit.
                Cupiditate dolores nobis ipsa quisquam incidunt officia, unde
                suscipit saepe ratione, a commodi nostrum ea magni quod omnis!
                Sunt quasi ducimus tenetur? </p>
                <p> Lorem, ipsum dolor sit amet consectetur adipisicing elit.
                Cupiditate dolores nobis ipsa quisquam incidunt officia, unde
                suscipit saepe ratione, a commodi nostrum ea magni quod omnis!
                Sunt quasi ducimus tenetur? </p> -->
            </div>
            <div class="recipe-img">
                <img
                  class="sgetti"
                  v-bind:src="
                    require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')
                  "
                />
            </div>
            <!-- TODO: add toggle 'Unsave recipe' -->
            <button
                type="button"
                class="btn recipe-save-btn"
                id="recipe-save-btn"
            >
                Save Recipe
            </button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>


<script>
import spoonacularService from "../services/SpoonacularService.js";

export default {
  data() {
    return {
      searchWord: "",
      recipes: [],
      recipeDetails: "",
    };
  },
  created() {},
  methods: {
    search() {
      spoonacularService.searchRecipes(this.searchWord).then((response) => {
        this.recipes = response.data;
      });
    },
    showRecipe(id) {
        spoonacularService.getRecipeById(id).then((response) => {
        this.recipeDetails = JSON.stringify(response.data);

        document.querySelector('.recipe-details').style.display = 'block';
      });
    },
    closeDetails(){
        document.querySelector('.recipe-details').style.display = 'none';
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
  margin-bottom: 1rem;
  text-align: start;
}

.container {
  height: auto;
  width: 80vw;
}

.recipe-wrapper {
  margin: 0 auto;
  width: 100vw;
  padding-right: 2rem;
  background: rgb(255, 255, 255);
  text-align: center;
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
  width: 55px;
  height: 25px;
  font-size: 0.75rem;
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


/*recipe details */
.recipe-details{
    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    color: rgb(255, 255, 255);
    background: #ffb20f;
    border-radius: 1rem;
    width: 90%;
    height: 90%;
    overflow-y: scroll;
    display: none;
    padding: 2rem 0;
}

/* cute scrollbar */
.recipe-details::-webkit-scrollbar{
    width: 10px;
}
.recipe-details::-webkit-scrollbar-thumb{
    background: #fff;
    border-radius: 2rem;
}

/*js related*/
.showRecipe{
    display: block;
}

.recipe-details-content{
    margin: 2rem;
}

.recipe-details-content p:not(.recipe-category){
    padding: 1rem 0;
}

.recipe-close-btn {
    position: absolute;
    right: 2rem;
    top: 2rem;
    font-size: 20px;
    border: none;
    width: 32px;
    height: 35px;
    border-radius: 50%;
    display: flex;
    align-items: flex-end;              /* TODO: position botton at bottom of box*/
    justify-content: center;
    opacity: 0.9;
    cursor: pointer;
}

.recipe-title{
    letter-spacing: 1px;
    padding-bottom: 1rem;
}

.recipe-category{
    background: #fff;
    font-weight: 600;
    color: #ffb20f;
    display: inline-block;
    padding: 0.2rem 0.5rem;
    border-radius: 0.3rem;
}

.recipe-instruction{
    padding: 1rem 0;
}

.recipe-img img{
    margin: 0 auto;
    display: block;
}

.recipe-save-btn {
  text-decoration: none;
  color: rgb(255, 255, 255);
  font-weight: 1.1rem;
  padding: 0.75rem 0;
  display: block;
  width: 175px;
  margin: 1rem auto;
  border-radius: 2rem;
  transition: all 0.4s linear;
  border: none;
}

.recipe-save-btn:hover{
    background: #074431;
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