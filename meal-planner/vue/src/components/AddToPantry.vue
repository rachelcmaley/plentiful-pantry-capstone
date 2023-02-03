<template>
    <div id="AddToPantry">
        <h2 id="pantry-header">Add To Pantry</h2>
        <div id="types">
        <input type="text" v-model="searchWord" placeholder="Type Ingredient Here">
        <ul>
            <li v-for="ingredient in filteredIngredients" :key="ingredient.ingredientId">{{ingredient.ingredientName}}</li>
        </ul>
        <button v-on:click.prevent="saveIngredient()" type="submit" class="button">Add Ingredient</button>
        </div>
    </div>
</template>

<script>
import pantryService from "../services/PantryService.js";

export default {
    data() {
        return {
            searchWord: '',
            ingredients: [

            ]
        };
    },
    created() {
        pantryService.getIngredients().then(response => {
            this.ingredients = response.data;
        })
    },
    calculated: {
        filteredIngredients() {
            if(this.searchWord.length < 2)
            {
                return [];
            }

            return this.ingredients.filter(ingredient => ingredient.ingredientName.toLowerCase().includes(this.searchWord.toLowerCase()))

        }
    },
    methods: {

    }
};
</script>

<style>
#types{
    display: flex;
}
#AddToPantry{
    background: white;
}
#pantry-header {
    text-align: center;
}
</style>