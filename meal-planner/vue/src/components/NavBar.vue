<template>
    <nav class="container">
        <router-link class="routerlink" v-bind:to="{name: 'past-meal-plans'}">Past Meal Plans</router-link>
        <router-link class="routerlink" v-bind:to="{name: 'my-pantry'}">My Pantry</router-link>
        <router-link class="routerlink" v-bind:to="{name: 'recipes'}">Recipes</router-link>
        <router-link class="routerlink" v-bind:to="{name: 'grocery-list'}">Grocery List</router-link>
        <router-link class="routerlink" v-bind:to="{name: 'profile'}">Profile</router-link>
    </nav>
</template>

<style>
.container {
    display: flex;
    flex-direction: row;
    justify-content: right;
    background: white;
    padding-bottom: 20px;
}
.routerlink {
    color: #0b6e4f;
    padding:0px 30px 0px 30px;
}
</style>