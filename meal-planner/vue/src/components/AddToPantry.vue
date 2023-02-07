<template>
    <div class="col-auto" id="AddToPantry">
        <h2 id="pantry-header">Add To Pantry</h2>
        <form class="submit-add" @submit.prevent="addToPantry">
            <div class="row gx-2 px-2">
                <div class="col-auto">
                    <div class="form-floating">
                        <input v-model="ingredient" list="search-ingredient" type="text" class ="form-control" placeholder="Add Ingredient"/>
                        <label for="text" class="form-label">Ingredient</label>
                        <datalist id = "search-ingredient">
                            <option v-for="ingredient in ingredients" :key="ingredient.ingredientId"> {{ingredient.ingredientName}} </option>
                        </datalist>
                    </div>
                </div>
                <div class="col-auto">
                    <button type="submit" class="btn btn-outline-success">
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
            pantryIngredients: []
        };
    },
    created() {
        pantryService.getIngredients().then(response => {
            this.ingredients = response.data;
        });

        pantryService.getPantryIngredients().then(response => {
            this.pantryIngredients = response.data;
        })
    },
    methods: {

        addToPantry() {

            const userId = this.$store.state.user.id;
            pantryService
            .addIngredient(userId, this.ingredient)
            .then(()=> {
                this.ingredient="";
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
    height: 16vh
}
#pantry-header {
    text-align: center;
    margin-bottom: 15px;
    padding-top: 15px;
    color: white;
}
#types {
    /* background-color: A5C882; */
    justify-content: center;
}
#search-box {
    border-radius: 5px;
    width: 85%;
    height: 40px

    }
</style>