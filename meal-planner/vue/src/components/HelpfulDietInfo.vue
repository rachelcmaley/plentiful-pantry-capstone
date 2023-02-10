<template>
    <div id="healthInfo">
        <h1 v-if="goalAnswer == 'Loose weight' && dietQuestion == 'Keto Friendly'">
            <text v-show="articleA1"  id="a1"> dsssssssssss</text>
        </h1>
    </div>
</template>


<script>


export default {
    data() {
        return{
        }
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

#a1{
    background-color: white;
}

</style>