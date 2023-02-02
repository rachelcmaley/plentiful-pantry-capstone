<template>
  <div class="ingredient-list">
    <div v-for="ingredient in ingredients" v-bind:key="ingredient.ingredientId" class="ingredient">
        {{ ingredient.ingredientName }}
    </div>
  </div>
</template>

<script>

    import pantryService from '../services/PantryService.js';

    export default {
        name: 'ingredient-list',
        data () {
            return {
                ingredients: []
            };
        },

        created () {

            const pantryPromise = pantryService.getIngredients();

            pantryPromise.then ((response) => {
                this.ingredients = response.data;

            });

        }
    }

</script>