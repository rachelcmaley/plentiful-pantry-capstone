<template>
<div id="pantry-body">
<div id="pantry">
        <section id="left-panel">
        <AddToPantry></AddToPantry>
        <MyPantry></MyPantry>
        </section>
        <section id="right-panel">
            <SuggestedRecipes></SuggestedRecipes>
        </section>
</div>
</div>
</template>

<script>
import MyPantry from "../components/MyPantry.vue";
import AddToPantry from "../components/AddToPantry.vue";
import SuggestedRecipes from "../components/SuggestedRecipes.vue";

export default {
    name: "my-pantry",
    components: {
        AddToPantry,
        MyPantry,
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

</style>