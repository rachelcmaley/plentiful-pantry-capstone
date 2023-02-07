<template>
    <div class="my-pantry">
        <div id="space">  </div>
        <h2 id="pantry">My Pantry</h2>
        <div class="ingredient-list">
            <div v-for="ingredient in pantryIngredients" v-bind:key="ingredient.ingredientId" class="ingredient">
                {{ ingredient.ingredientName }}
            </div>
        </div>
    </div>
</template>


<script>

    import pantryService from '../services/PantryService.js';

    export default {
        name: 'my-pantry',
        data () {
            return {
                pantryIngredients: []
            };
        },

        created () {

            const pantryPromise = pantryService.getIngredientsByPantryId();

            pantryPromise.then ((response) => {
                this.pantryIngredients = response.data;

            });

        }
    }

</script>





<style>
.my-pantry{
    border: solid green 3px;
    background: white;
    border-radius: 10px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: 20px;
}

#underline{
    border-bottom: solid 2px rgb(164, 162, 236);
    margin-right: 90px;
}

#pantry{
    text-align: center;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    color: green;
}

#paperLine{
    border-left: solid rgb(25, 25, 129) 2px;
    margin-left: 10px;
}

li{
    margin-left: 50px;
}

#space{
    padding-top: 15px;
}

</style>