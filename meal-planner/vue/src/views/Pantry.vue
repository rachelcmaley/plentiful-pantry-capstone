<template>
<div id="pantry-body">
<div id="pantry">
        <section id="left-panel">
            <div id="addpantry">
        <AddToPantry></AddToPantry>
            </div>
        <div id="scroll-ingredients">
            <h2 id="my-ingredients-head">My Ingredients</h2>
        <IngredientsList></IngredientsList>
        </div>
        </section>
        <section id="right-panel">
            <RecipesYouCanMake></RecipesYouCanMake>
        </section>
</div>
</div>
</template>

<script>
import AddToPantry from "../components/AddToPantry.vue";
import RecipesYouCanMake from "../components/RecipesYouCanMake.vue";
import IngredientsList from "../components/IngredientsList.vue";

export default {
    name: "my-pantry",
    components: {
        AddToPantry,
        IngredientsList,
        RecipesYouCanMake
    },
    created(){
        this.$store.commit('UPDATE_PAGE', 'pantryPage')
    }
};
</script>

<style>
#pantry-body
#pantry{
    display: flex;
}
#left-panel {
    margin-top: 20px;
    margin-left: 10px;
}
#my-ingredients-head {
    margin-top: 30px;
    text-align: center;
}
#right-panel {
    margin-top: 10px;
}
#add-pantry{
    margin: 5px;
    border: solid lightgrey;
}
#scroll-ingredients {
    background: white;
    margin: 5px;
    border: solid lightgrey;
    padding: 10px;
    overflow: auto;
    overflow-y: scroll;
    height: 500px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}

</style>