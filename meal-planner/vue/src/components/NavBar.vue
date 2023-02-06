<template>
    <nav class="container">
        <router-link id="link" class="routerlink" v-bind:to="{name: 'my-pantry'}">My Pantry</router-link>
        <router-link id="link" class="routerlink" v-bind:to="{name: 'meal-planner'}">Meal Planner</router-link>
        <router-link id="link" class="routerlink" v-bind:to="{name: 'past-meal-plans'}">Past Meal Plans</router-link>
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
    margin-top: 15px;
    background-color: white;
}
.container {
    display: flex;
    flex-direction: row;
    justify-content: center;
    background: rgb(160, 184, 167);
    padding-bottom: 20px;
    border: solid rgb(160, 184, 167) 1px;
    border-radius: 15px;
    column-gap: 90px;
    margin-top: 20px;
    }
.routerlink {
    
    color: #0b6e4f;
    padding:0px 10px 0px 10px;
    margin-right: 15px;
}

#sizing{
    
}

a:link { text-decoration: none; }


a:visited { text-decoration: none; }


a:hover { text-decoration: none;
        background-color: green; 
        color: white;}


a:active { text-decoration: none; }

</style>