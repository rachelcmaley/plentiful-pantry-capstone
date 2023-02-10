<template>
    <div class="pfpElements" id="backgroundPicForProfileVue">
        <header id="navProfile">
            <NavBar></NavBar>
        </header>
          <div id="questions">
            <UserFoodInfo/>
          </div>
        <div id="helpInfo"> 
          <HelpfulDietInfo/>
        </div>
        <div id="chooseImage">
          <ChooseProfileImage/>
        </div>
    </div>
</template>

<script>

import NavBar from "../components/NavBar.vue";
import ChooseProfileImage from "../components/ChooseProfileImage.vue";
import UserFoodInfo from "../components/UserQuestions.vue"
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

.pfpElements{
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
    grid-template-areas: 
    "nav nav nav"
    "qp qp pfp"
    "fp fp pfp" 
  
}

#navProfile{
  grid-area: nav;
}

#questions{
  grid-area: qp;

}

#helpInfo{
  grid-area: fp;
  
}

#chooseImage{
  grid-area: pfp;
  margin-left: 120px;
  background-color: white;
  border: solid green 5px;
  border-radius: 20px;
  padding-left: 30px;

  padding-top: 20px;
  height: 500px;
  width: 450px;
}




</style>
