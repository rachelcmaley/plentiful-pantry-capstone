<template>
    <div>
        <header>
            <NavBar></NavBar>
        </header>
        <section>
            <FileUpload></FileUpload>
        </section>
    </div>
</template>

<script>

import NavBar from "../components/NavBar.vue";
import FileUpload from "@/components/FileUpload.vue";

export default {
  name: "profile",
  components: {
    NavBar,
    FileUpload
  },

};

</script>
