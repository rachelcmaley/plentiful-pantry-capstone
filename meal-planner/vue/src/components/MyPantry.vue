<template>
    <div class="my-pantry" id="pantryBox">
        <h2 id="pantryText">My Pantry</h2>
        <div class="ingredient-list">
            <div class="list-group">
                <div v-for="ingredient in $store.state.pantry" :key="ingredient.id" class="ingredient list-group-item">
                    {{ ingredient.ingredientName }} <button type="button" class="btn-close" aria-label="Close" @click="deleteFromPantry(ingredient.ingredientName)"></button>
                </div>
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
            };
        },

        created () {
            if(this.$store.state.pantry.length == 0)
            {

                const pantryPromise = pantryService.getPantryIngredients(this.$store.state.user.id);

                pantryPromise.then ((response) => {

                    this.$store.commit("LOAD_PANTRY", response.data);

                });
            }

        },

        methods: {
            
            deleteFromPantry(ingredientName) {


                const userId = this.$store.state.user.id;
                pantryService
                .deleteIngredient(userId, ingredientName)
                .then(() => {
                    this.reloadPantry()
                })

            },

             reloadPantry() {   

                const pantryPromise = pantryService.getPantryIngredients(this.$store.state.user.id);

                pantryPromise.then ((response) => {

                    this.$store.commit("LOAD_PANTRY", response.data);

                });

            }
        }
    }


</script>



<style>
.homePantryBox{
    border: solid rgb(95, 156, 95) 3px;
    border-radius: 10px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: 20px;
    height: 360px;
    width: 450px;
}

#underline{
    border-bottom: solid 2px rgb(164, 162, 236);
    margin-right: 90px;
}

#pantryText{
    text-align: center;
    padding-top: 10px;
}

#pantryBox{
    background-color: rgba(255, 242, 168, 0);
    height: 400px;
    width: 300px;
}


li{
    margin-left: 50px;
}

#space{
    padding-top: 15px;
}


</style>