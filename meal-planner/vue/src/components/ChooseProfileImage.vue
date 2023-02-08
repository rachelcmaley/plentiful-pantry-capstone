<template>
    <form>
        Choose Your Profile Image
        <select v-model="selected">
            <option disabled value="">Please select one</option>
            <option>Pancakes </option>
            <option>Burger</option>
            <option>Lasagna</option>
        </select>
<!-- <img v-on:select=""> -->
        <img v-show="selected == 'Pancakes'" src="../assets/images/pancake.png">
        <img v-show="selected == 'Burger'" src="../assets/images/burger.jpg">
        <img v-show="selected == 'Lasagna'" src="../assets/images/lasagna.jpg">
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




