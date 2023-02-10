<template>
    <div class="col-auto" id="AddToPantry">

        <h2 id="pantryTitle">Add To Pantry</h2>
        <form class="submit-add" @submit.prevent="addToPantry">
            <div class="row gx-2 px-2">
                <div class="col-auto">
                    <div class="form-floating" id="searchBox">
                        <input v-model="ingredient" list="search-ingredient" type="text" class ="form-control" placeholder="Add Ingredient"/>
                        <label for="text" class="form-label">Ingredient</label>
                        <datalist id = "search-ingredient">
                            <option v-for="ingredient in ingredients" :key="ingredient.ingredientId"> {{ingredient.ingredientName}} </option>
                        </datalist>
                    </div>
                </div>
                <div class="col-auto">

                    <button id="addBtn" type="submit" class="btn btn-outline-success">
                        Add
                    </button>
                </div>
            </div>
        </form>
    </div>
</template>

<script>
import pantryService from "../services/PantryService.js";

export default {
    data() {
        return {
            ingredient: "",
            ingredients: [],
            // pantryIngredients: []
        };
    },
    created() {
        pantryService.getIngredients().then(response => {
            this.ingredients = response.data;
        });

        // pantryService.getPantryIngredients().then(response => {
        //     this.pantryIngredients = response.data;
        // })
    },
    methods: {

        addToPantry() {

            const userId = this.$store.state.user.id;
            pantryService
            .addIngredient(userId, this.ingredient)
            .then(()=> {
                this.ingredient="";
                this.reloadPantry();
            });
            // this.$router.push(`/pantry/${userId}`);
        },

        reloadPantry()
        {   
            const pantryPromise = pantryService.getPantryIngredients(this.$store.state.user.id);

            pantryPromise.then ((response) => {

                this.$store.commit("LOAD_PANTRY", response.data);

            });
        }
    }
};
</script>

<style>
#types{
    display: flex;
}
#AddToPantry{
    background: #A0B8A7;
    border-radius: 10px;
    height: 135px;
    width:330px;
    margin-left: 50px;
}
#pantryTitle{
    text-align: center;
    padding-top: 15px;
    color: white;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    
}
#types {
    /* background-color: A5C882; */
    justify-content: center;
}
#searchBox {
        font-size: 15px;
        margin-left: 15px;
    }

#ingredientWord{
        padding-left: 50px;
}

#addBtn{
    height: 30px;
    background:white;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-weight: bold;
    border: solid green 3px;
    height: 55px;
    width:70px;
}


</style>