<template>
    <form>
        <div id="pfpQuestion">
            Choose Your Profile Image
        </div>
        <img id="pfp" v-show="selected == ''" src="../assets/images/plate.png">
        <img id="pfp" v-show="selected == 'Pancakes'" src="../assets/images/pancake.png">
        <img id="pfp" v-show="selected == 'Burger'" src="../assets/images/burger.jpg">
        <img id="pfp" v-show="selected == 'Lasagna'" src="../assets/images/lasagna.jpg">
        <div></div>
        <select id="optionBar" v-model="selected">
            <option disabled value="">Please select one</option>
            <option>Pancakes </option>
            <option>Burger</option>
            <option>Lasagna</option>
        </select>
<!-- <img v-on:select=""> -->
       
    </form>
</template>

<script>
export default {
    data () {
        return {
            selected: "",
        };
    },
}

</script>


<style>

#pfp{
    border:solid green 5px;
    border-radius: 400px;
    height: 300px;
    margin-left: 50px;
    margin-top: 20px;

}

#pfpQuestion{
    color: white;
    font-size: 30px;
    background-color: green;
    width: 390px;
    border-radius: 30px;
    padding-left: 20px;
}

#optionBar{
    height: 50px;
    width: 350px;
    margin-top: 20px;
    margin-left: 20px;
}


</style>

