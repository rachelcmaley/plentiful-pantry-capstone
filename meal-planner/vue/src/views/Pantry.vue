<template>
<div id="pantry-body">
<div id="pantry">
        <section id="left-panel">
        <AddToPantry></AddToPantry>
        <h2 id="my-ingredients-head">My Ingredients</h2>
        <div id="scroll-ingredients">
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
    margin-top: 30px;
    margin-left: 10px;
    background: white;
}
#my-ingredients-head {
    margin-top: 30px;
    text-align: center;
}
#right-panel {
    margin-top: 30px;
    height: 100vh;
    width: 100vw;
    margin: 30px;
    border-radius: 1rem;
    overflow: auto;
    overflow-y: scroll;
}
#scroll-ingredients {
    margin-left: 10px;
    overflow: auto;
    overflow-y: scroll;
    height: 100vh;
}


</style>