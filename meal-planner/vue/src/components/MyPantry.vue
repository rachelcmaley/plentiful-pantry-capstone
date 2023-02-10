<template>
    <div class="my-pantry" id="pantryBox">
        <h2 id="pantryText">My Pantry</h2>
        <div class = "ingredients-container">
            <div class="ingredient-list">
                <div class="list-group">
                    <div v-for="ingredient in $store.state.pantry" :key="ingredient.id" class="ingredient list-group-item">
                        {{ ingredient.ingredientName }} <button type="button" class="btn-close" aria-label="Close" @click="deleteFromPantry(ingredient)"></button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>



<script>

    import pantryService from '../services/PantryService.js';
    import spoonacularService from "../services/SpoonacularService.js";
    import { mapGetters } from 'vuex'

    export default {
        name: 'my-pantry',
        data () {
            return {
            };
        },
        computed: {

            ...mapGetters([
                'ingredientString'
            ])

        },

        
        created () {
            if(this.$store.state.pantry.length == 0)
            {

                const pantryPromise = pantryService.getPantryIngredients(this.$store.state.user.id);

                pantryPromise.then ((response) => {

                    this.$store.commit("LOAD_PANTRY", response.data);

                });

                // const spoonacularPromise = spoonacularService.searchRecipes(this.ingredientString)

                // spoonacularPromise.then ((response) => {

                //     this.$store.commit("LOAD_RECIPES", response.data);
                // });

            }

        },

        methods: {
            
            deleteFromPantry(ingredient) {


                const userId = this.$store.state.user.id;
                pantryService
                .deleteIngredient(userId, ingredient.ingredientName)
                .then(() => {
                    this.reloadPantry();
                    this.reloadRecipes();
                });


            },

            reloadPantry() {   

                const pantryPromise = pantryService.getPantryIngredients(this.$store.state.user.id);

                pantryPromise.then ((response) => {

                    this.$store.commit("LOAD_PANTRY", response.data);

                });

            },

            reloadRecipes()
            {
                const stringIngredients = this.$store.state.pantry.map(ingredient => ingredient.ingredientName).join(',')

                const spoonacularPromise = spoonacularService.searchRecipes(stringIngredients)

                spoonacularPromise.then ((response) => {

                    this.$store.commit("LOAD_RECIPES", response.data);
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

.ingredients-list-home {
overflow: auto;
overflow-y: scroll;
 /* width: 350px;  */
height: 380px;
background: rgb(255, 255, 255);
border-bottom-right-radius: 10px;
border-bottom-left-radius: 10px;
border-top-left-radius: 10px;
border-top-right-radius: 10px;
margin-top: 8px;
margin-left: 25px;
padding-left: 15px;
color: green;

}
/* #pantryBox {
overflow: auto;
overflow-y: scroll;
/* width: 350px; 
/* height: 600px; 
background: rgb(255, 255, 255);
border-bottom-right-radius: 10px;
border-bottom-left-radius: 10px;
border-top-left-radius: 10px;
border-top-right-radius: 10px;
margin-left: 5px;
margin-right: 5px;
padding-left: 0px;
color: green;
} */

.btn-close{
    
}
</style>