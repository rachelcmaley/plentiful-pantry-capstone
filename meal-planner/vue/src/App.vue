<template>
  <div id="app" v-bind:class="$store.state.pageClass">
    <div id="nav">
      <router-link id="nav" v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;&nbsp;
      <router-link id="nav" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
    </div>
    <router-view />
  </div>
</template>

<script>
export default {
  computed: {
    
  },
  setup() {
    
  },
 
}

</script>

<style>
#nav{
  background: rgb(145, 185, 157);
  color: rgb(255, 255, 255);
}

a:link { text-decoration: none; }


a:visited { text-decoration: none; }


a:hover { text-decoration: none;}


a:active { text-decoration: none; }

/* #app{
  background: url("pantry-image.jpg");
  height: 100vh;
} */

body{
  margin: 0;
}
#app
{
  width: 100vw;
  height: 100vh;
}

.homePage
{
  background: url('assets/images/home-image2.jpg') ;
  background-size: cover;
  background-repeat: no-repeat;
  overflow: no-repeat;
}
.pantryPage
{
  background: url("assets/images/pantry-image.jpg");
  background-size: cover;
}

.registerPage{
  background: url("assets/images/food.png");
  background-size: cover;
}

.loginPage{
  background: url("assets/images/home-image.jpg");
  background-size: cover;
}

</style>