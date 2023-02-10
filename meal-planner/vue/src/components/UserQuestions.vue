<template>
    <div id="everythingContainer">
        <div id="partOne">
            <div id="goalQuestion">
                What is your main goal?
            </div>
            <h1 id="mainGoal"  v-show="goalAnswer == ''"></h1>
            <h1 id="mainGoal" class="looseWeight" v-show="goalAnswer == 'Loose weight'">🌱Loose Weight🌱</h1>
            <h1 id="mainGoal" class="getHealthier" v-show="goalAnswer == 'Eat Healthier'">🥕Eat Healthier🥕</h1>
            <h1 id="mainGoal" class="gainMuscle" v-show="goalAnswer == 'Gain Muscle'">💪Gain Muscle💪</h1>
            <div></div>
            <select id="optionBarQ" v-model="goalAnswer">
                <option disabled value="" >Please select one</option>
                <option>Loose weight </option>
                <option>Eat Healthier</option>
                <option>Gain Muscle</option>
            </select>
        </div>

        <div id="partTwo">
            <div id="goalQuestion">
                What is your preferred diet?
            </div>
            <h1 id="dietAnswer"  v-show="dietQuestion == ''"> </h1>
            <h1 id="dietAnswer" class="ketoFriendly" v-show="dietQuestion == 'Keto Friendly'">🍖Keto Friendly🍖</h1>
            <h1 id="dietAnswer" class="noCarbs" v-show="dietQuestion == 'No Carbs'">🥦No Carbs🥦</h1>
            <h1 id="dietAnswer" class="noSugar" v-show="dietQuestion == 'No Carbs'">💗No Sugar💗</h1>
            <div></div>
            <select id="optionBarQD" v-model="dietQuestion">
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
}

#goalQuestion{
    text-align: center;
    padding-bottom: 10px;
    padding-top: 10px;
    font-size: 30px;
}

#partOne{
    background-color: white;
    width:500px;
    height: 240px;
    margin-left: 120px;
    border: solid green 3px;
    border-radius: 15px;
}

#partTwo{
    background-color: white;
    width: 500px;
    border: solid green 3px;
    border-radius: 15px;
}

#everythingContainer{
    display: grid;
    grid-template-columns: 1fr 1fr;
}
#mainGoal{
    text-align: center;
}
#dietAnswer{
    text-align: center;
}

#optionBarQ{
    margin-left:75px;
    height: 50px;
    width: 350px;
    margin-top: 20px;
    margin-right: auto;
    border-radius: 10px;
}

#optionBarQD{
    margin-left:75px;
    height: 50px;
    width: 350px;
    margin-top: 20px;
    margin-right: auto;
    border-radius: 10px;
}

.getHealthier{
    color: rgb(201, 120, 0);
}
.looseWeight{
    color: rgb(88, 172, 88);
}
.gainMuscle{
    color: rgb(179, 10, 10);

}
.ketoFriendly{
    color: rgb(206, 0, 206);
}
.noCarbs{
    color:rgb(62, 162, 255);
}
.noSugar{
    color:rgb(221, 221, 0);
}
</style>