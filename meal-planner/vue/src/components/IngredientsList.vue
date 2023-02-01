<template>
  <div class="ingredients-list">
    <div v-for="ingredient in ingredients" v-bind:key="ingredient.id" class="ingredient">
        {{ ingredient.name }}
    </div>
  </div>
</template>

<script>

    import pantryService from '../services/PantryService.vue';

    export defualt {
        name: 'ingredient-list',
        data () {
            return {
                ingredients []
            };
        },

        created () {

            const pantryPromise = pantryService.getIngredients();

            pantryPromise.then (response => {
                this.ingredients = response.data

            });

        }
    };

</script>