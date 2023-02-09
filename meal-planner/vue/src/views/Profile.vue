<template>
    <div class="pfpElements" id="backgroundPicForProfileVue">
        <header>
            <NavBar></NavBar>
        </header>
        <div id="leftProfile"> 
          <UserFoodInfo/>
          <HelpfulDietInfo/>
        </div>
        <div id="pfpSection">
          <ChooseProfileImage/>
        </div>
    </div>
</template>

<script>

import NavBar from "../components/NavBar.vue";
import ChooseProfileImage from "../components/ChooseProfileImage.vue";
import UserFoodInfo from "../components/UserFoodInfo.vue"
import HelpfulDietInfo from "../components/HelpfulDietInfo.vue"

export default {
  name: "profile",
  components: {
    NavBar,
   ChooseProfileImage,
   UserFoodInfo,
   HelpfulDietInfo,

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

#pfpElements{
  display:grid;
  grid-template-columns: 1fr 1fr 1fr 1fr;
  grid-template-areas: 
  ""
}


</style>
