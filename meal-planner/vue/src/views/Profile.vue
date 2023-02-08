<template>
    <div>
        <header>
            <NavBar></NavBar>
        </header>
        
        <ChooseProfilePicture/>
        
    </div>
</template>

<script>

import NavBar from "../components/NavBar.vue";
import ChooseProfilePicture from "../components/ChooseProfileImage.vue";

export default {
  name: "profile",
  components: {
    NavBar,
   ChooseProfilePicture
  },

};

</script>
