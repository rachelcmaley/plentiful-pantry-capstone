<template>
    <div id="backgroundPicForProfileVue">
        <header>
            <NavBar></NavBar>
        </header>
        
        <ChooseProfileImage/>
        
    </div>
</template>

<script>

import NavBar from "../components/NavBar.vue";
import ChooseProfileImage from "../components/ChooseProfileImage.vue";

export default {
  name: "profile",
  components: {
    NavBar,
   ChooseProfileImage
  },

};

</script>


<style>

#backgroundPicForProfileVue{
   background: url("../assets/images/garlicbutterchicken.jpg");
  background-size: cover;
  background-position: center;
  position: fixed;
  width: 100%;
  height: 100%;
  background-repeat: no-repeat;
  overflow: no-repeat;
}



</style>
