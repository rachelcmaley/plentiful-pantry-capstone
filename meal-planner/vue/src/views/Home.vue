<template>
  <div class="home">
    <NavBar></NavBar>
    <WeeklyPlanner></WeeklyPlanner>
    <h1>Home</h1>
    <p>You must be authenticated to see this or not</p>
  </div>
</template>

<script>
import NavBar from '../components/NavBar.vue';
import WeeklyPlanner from '../components/WeeklyPlanner.vue';

export default {
  name: "home",
  components: {
    NavBar,
    WeeklyPlanner
  }
};
</script>

<style>
</style>
