<template>
<div id="pantry-body" >

    <header>
        <NavBar></NavBar>
    </header>
    <div id="pantry">
        <section id="left-panel">
            <div id="addpantry" >
        <AddToPantry ></AddToPantry>
            </div>
        <div id="scroll-ingredients" >
        <MyPantry></MyPantry>
        </div>
        </section>
        <section id="right-panel" class="saved-recipe-wrapper">
            <RecipesYouCanMake></RecipesYouCanMake>
        </section>
</div>
</div>
</template>

<script>

import NavBar from "../components/NavBar.vue";
import AddToPantry from "../components/AddToPantry.vue";
import RecipesYouCanMake from "../components/RecipesYouCanMake.vue";
import MyPantry from "../components/MyPantry.vue";

export default {
    name: "pantry",
    components: {
        AddToPantry,
        MyPantry,
        RecipesYouCanMake,
        NavBar
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
    margin-bottom: 10px;
    width: 25vw;
    height: 100vh;
    /* background: white; */
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
    background: rgba(255, 255, 255, 0.719);
    height: 100vh;
    width: 75vw;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
    overflow:hidden;
    overflow-y: scroll;
}
#add-pantry{
    margin: 5px;
    border: solid lightgrey;
}
#scroll-ingredients {
    /* margin-left: 10px; */
    overflow: auto;
    overflow-y: scroll;
    width: 350px;
    height: 600px;
    background: rgb(255, 255, 255);
    border-bottom-left-radius: 10px;
    border-bottom-right-radius: 10px;
    margin-top: 20px;
    margin-left: 45px;
    padding-left: 15px;
    color: green;
}

.saved-recipe-wrapper::-webkit-scrollbar {
  width: 10px;
}
.saved-recipe-wrapper::-webkit-scrollbar-thumb {
  background: #074733;
  border-radius: 2rem;
}

</style>