<template>
    <div class = "container">
        <div class = "recipe-wrapper">
            <div class = "recipe-search">
                <h2 class = "title">Recipes You Can Make</h2>

                <div class = "recipe-search-box">
                    <input type="text" class = "search-control"  v-model="searchWord"
                        placeholder = "Search" id = "search">
                        <button type = "submit" class = "search-btn" id = "search-btn" @click="search">
                            Search
                        </button>
                </div>

                <div class="recipe-result">
                    <h2 class="title">
                        Your Search Results
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
                                <img class='sgetti' v-bind:src="require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')">
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
                                <img class='sgetti' v-bind:src="require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')">
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
                                <img class='sgetti' v-bind:src="require('C:/Users/Student/workspace/capstone-meal-planner/meal-planner/vue/src/assets/images/shakshuka.png')">
                            </div>
                            <div class="recipe-name">
                                <h3>Scgetti</h3>
                                <a href="#" class="recipe-btn">Get Recipe</a>
                            </div>
                        </div> -->
                        <!-- end of recipe box -->
                    </div>
                </div>

                <div>
                    <p>{{recipeDetails}}</p>
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
            searchWord: '',
            recipes: [

            ],
            recipeDetails: ''
        };
    },
    created() {
       
    },
    methods: {
        search()
        {
            spoonacularService.searchRecipes(this.searchWord).then(response => {
                this.recipes = response.data;
            })
        },
        showRecipe(id)
        {
            spoonacularService.getRecipeById(id).then(response => {
                this.recipeDetails = JSON.stringify(response.data)
            })
        }
    }

};
</script>


<style>

*{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}

body{
    font-weight: 300;
    font-size: 1.05rem;
    line-height: 1.6;
    font-family: Arial, Helvetica, sans-serif;
}

.btn{
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
}

.container {
    height: auto;
    width: 100vw;
    display: flexbox;
}

.recipe-wrapper{
    margin: 0 auto;
    padding: 2rem;
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
.search-button{
    width: 100%;
}

.search-control{
    padding: 0 1rem;
    font-size: 1.1rem;
    font-family: inherit;
    outline: 0;
    border: 1px solid #FFB20F;
    color: #FFB20F;
    border-top-left-radius: 2rem;
    border-bottom-left-radius: 2rem;
    transition: all 0.4s linear;
}

.search-control::placeholder{
    color: #FFB20F;
}

.search-btn{
    width: 55px;
    height: 25px;
    font-size: .75rem;
    background: #FFB20F;
    color: rgb(78, 78, 78);
    border: none;
    border-top-right-radius: 2rem;
    border-bottom-right-radius: 2rem;
    transition: all 0.4s linear;
}

.search-btn:hover{
    background: #d39000;
}

.recipe-result {
    margin-top: 4rem;
}

#recipe{
    margin: 2.4rem 0;
}

.recipe-item {
    border-radius: 1rem;
    overflow: hidden;
    box-shadow: 0 4px 21px -12px rgba(0, 0, 0, 0.79);
    margin: 2rem 0;
}

.meal-img img{
    width: 100%;
    display: block;
}

.recipe-name{
    padding: 1.5rem 0.5rem;
}

.meal-name h3{
    font-size: 1.4rem;
}

.recipe-btn{
    text-decoration: none;
    color: #fff;
    background: #FFB20F;
    font-weight: 1.1rem;
    padding: 0.75rem 0;
    display: block;
    width: 175px;
    margin: 1rem auto;
    border-radius: 2rem;
    transition: all 0.4s linear;
}

.recipe-btn:hover{
    background: #d39000;
}


/* MEDIA QUERIES */
@media screen and (min-width: 600px) {
    .meal-search-box{
        width: 540px;
        margin-left: auto;
        margin-right: auto;
    }
}

@media screen and (min-width: 768px) {
    #meal{
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        gap: 2rem;
    }
    .meal-item{
        margin: 0;
    }
}

@media screen and (min-width: 992px) {
    #meal{
        grid-template-columns: repeat(3, 1fr);
    }
}

</style>