<template>
    <nav class="container">
        <router-link id="link" class="routerlink" v-bind:to="{name: 'my-pantry'}">My Pantry</router-link>
        <router-link id="link" class="routerlink" v-bind:to="{name: 'meal-planner'}">Meal Planner</router-link>
        <!-- <router-link id="link" class="routerlink" v-bind:to="{name: 'grocery-list'}">Grocery List</router-link> -->
        <router-link id="link" class="routerlink" v-bind:to="{name: 'profile'}">Profile</router-link>
    </nav>

</template>

<script>
export default {
    setup() {
        
    },
}

</script>


<style>

#link{
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: 20px;
    border: solid green 2px;
    border-radius: 10px;
    background-color: white;
    padding: 10px 20px;
}

.routerlink{
    margin-left: 200px;
}
          

</style>