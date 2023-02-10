<template>
    <div id="everythingContainer">
        <div id="partOne">
            <div id="goalQuestion">
                What is your main goal?
            </div>
            <h1 id="mainGoal" v-show="goalAnswer == ''"></h1>
            <h1 id="mainGoal" v-show="goalAnswer == 'Loose weight'"> Loose Weight</h1>
            <h1 id="mainGoal" v-show="goalAnswer == 'Eat Healthier'"> Eat Healthier</h1>
            <h1 id="mainGoal" v-show="goalAnswer == 'Gain Muscle'"> Gain Muscle</h1>
            <div></div>
            <select id="optionBar" v-model="goalAnswer">
                <option disabled value="" >Please select one</option>
                <option>Loose weight </option>
                <option>Eat Healthier</option>
                <option>Gain Muscle</option>
            </select>
        </div>

        <div id="partTwo">
            <div id="preferedDiet">
                What is your preferred diet?
            </div>
            <h1 id="dietAnswer" v-show="dietQuestion == ''"> </h1>
            <h1 id="dietAnswer" v-show="dietQuestion == 'Keto Friendly'">Keto Friendly</h1>
            <h1 id="dietAnswer" v-show="dietQuestion == 'No Carbs'">No Carbs</h1>
            <h1 id="dietAnswer" v-show="dietQuestion == 'No Sugar'">No Sugar</h1>
            <div></div>
            <select id="optionBar" v-model="dietQuestion">
                <option disabled value="" >Please select one</option>
                <option>Keto Friendly </option>
                <option>No Carbs</option>
                <option>No sugar</option>
            </select>
        </div>

    </div>
    
</template>

<script>
export default {
    data () {
        return {
            goalAnswer: "",
            dietQuestion: "",
        };
    },
}
</script>


<style>
#everythingContainer{
    background-color: white;
}

#goalQuestion{
    padding-left: 50px;
    padding-top: 30px;
    font-size: 30px;
}

#everythingContainer{
    display: grid;
    grid-template-columns: 1fr 1fr;
}

#optionBar{
    
}

</style>