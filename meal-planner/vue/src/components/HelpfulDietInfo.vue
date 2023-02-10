<template>
    <div id="healthInfo">
        <h1 v-show="ab == 'No Carbs'"></h1>
    </div>
</template>

<script>
export default {
    setup() {
        
    },
}
</script>

<style >

#healthInfo{
    width:1010px;
    height:450px;
    margin-left: 130px;
    /* background-color: rgb(211, 255, 211); */
    border: solid green 4px;
    border-radius: 30px;
    margin-bottom: 40px;
}


</style>