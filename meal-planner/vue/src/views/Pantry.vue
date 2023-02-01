<template>
<div id="pantry-body">
<div id="pantry">
        <section id="left-panel">
        <AddToPantry></AddToPantry>
        <h2 id="my-ingredients-head">My Ingredients</h2>
        <IngredientsList></IngredientsList>
        </section>
        <section id="right-panel">
            <SuggestedRecipes></SuggestedRecipes>
        </section>
</div>
</div>
</template>

<script>
import AddToPantry from "../components/AddToPantry.vue";
import SuggestedRecipes from "../components/SuggestedRecipes.vue";
import IngredientsList from "../components/IngredientsList.vue";

export default {
    name: "my-pantry",
    components: {
        AddToPantry,
        IngredientsList,
        SuggestedRecipes
    },
    created(){
        this.$store.commit('UPDATE_PAGE', 'pantryPage')
    }
};
</script>

<style>
body{
    /* background: url("pantry-image.jpg"); */
}
#pantry-body
#pantry{
    display: flex;
}
#left-panel {
    margin-top: 10px;
    margin-left: 10px;
    background: white;
}
#my-ingredients-head {
    margin-top: 30px;
    text-align: center;
}

</style>