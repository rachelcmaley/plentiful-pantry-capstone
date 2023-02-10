<template>

    <div class="my-pantry" id="pantryBox">
        <h2 id="pantryText">My Pantry</h2>
        <div class="ingredient-list">
            <div class="list-group">
                <div v-for="ingredient in $store.state.pantry" :key="ingredient.id" class="ingredient list-group-item">
                    {{ ingredient.ingredientName }} <button type="button" class="btn-close" aria-label="Close" @click="deleteFromPantry(ingredient)"></button>

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




#pantryText{
    text-align: center;
    padding-top: 10px;
}


li{
    margin-left: 50px;
}

#space{
    padding-top: 15px;
}

.list-group{
    margin-left: 10px;
    margin-right: 10px;

}
#userIngredienstPantry{
    margin-top: 10px;
    border-bottom: solid green 3px;
    border-right: solid green 3px;
    width: 290px;
}



.btn-close{
}
</style>