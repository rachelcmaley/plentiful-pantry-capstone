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
    margin-top: 30px;
    margin-left: 10px;
<<<<<<< HEAD
=======
    margin-bottom: 10px;
    width: 30vw;
    height: 100vh;
    /* background: white; */
>>>>>>> main
}
#my-ingredients-head {
    margin-top: 20px;
    /* margin-left: 10px; */
    text-align: center;
    background: white;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
}
#right-panel {
    margin-top: 30px;
    margin-left: 10px;
    height: 100vh;
    width: 100vw;
    border-radius: 1rem;
    overflow:hidden;
    overflow-y: scroll;
}
#add-pantry{
    margin: 5px;
    border: solid lightgrey;
}
#scroll-ingredients {
<<<<<<< HEAD
    background: white;
    margin: 5px;
    border: solid lightgrey;
    padding: 10px;
    overflow: auto;
    overflow-y: scroll;
    height: 500px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
=======
    /* margin-left: 10px; */
    overflow: auto;
    overflow-y: scroll;
    height: 100vh;
    background: white;
    border-bottom-left-radius: 10px;
    border-bottom-right-radius: 10px;
>>>>>>> main
}


</style>