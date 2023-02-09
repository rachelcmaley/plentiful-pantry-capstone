<template>
    <div id="everythingContainer">
        <div id="goalQuestion">
            What is your main goal?
        </div>
        <h1 id="mainGoal" v-show="selected == ''"> ddsdfs</h1>
        <h1 id="mainGoal" v-show="selected == 'Loose weight'"> Loose Weight</h1>
        <h1 id="mainGoal" v-show="selected == 'Eat Healthier'"> Eat Healthier</h1>
        <h1 id="mainGoal" v-show="selected == 'Gain Muscle'"> Gain Muscle</h1>
        <div></div>
        <select id="optionBar" v-model="selected">
            <option disabled value="">Please select one</option>
            <option>Loose weight </option>
            <option>Eat Healthier</option>
            <option>Gain Muscle</option>
        </select>
    </div>
    
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
