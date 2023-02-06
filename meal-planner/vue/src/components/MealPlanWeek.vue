<template>
  <div id="weekly-grid">
    <div id="sunday">
      <h2 class="day">Sunday</h2>
      <p id="firstSun">Breakfast meal</p>
      <p id="secondSun">Lunch Meal</p>
      <p id="thirdSun">Dinner Meal</p>
    </div>
    <div id="monday">
      <h2 class="day">Monday</h2>
      <p id="firstMon">Breakfast Meal</p>
      <p id="secondMon">Lunch Meal</p>
      <p id="thirdMon">Dinner Meal</p>
    </div>
    <div id="tuesday">
      <h2 class="day">Tuesday</h2>
      <p id="firstTue">Breakfast Meal</p>
      <p id="secondTue">Lunch Meal</p>
      <p id="thirdTue">Dinner Meal</p>
    </div>
    <div id="wednesday">
      <h2 class="day">Wednesday</h2>
      <p id="firstWed">Breakfast Meal</p>
      <p id="secondWed">Lunch Meal</p>
      <p id="thirdWed">Dinner Meal</p>
    </div>
    <div id="thursday">
      <h2 class="day">Thursday</h2>
      <p id="firstThu">Breakfast Meal</p>
      <p id="secondThu">Lunch Meal</p>
      <p id="thirdThu">Dinner Meal</p>
    </div>
    <div id="friday">
      <h2 class="day">Friday</h2>
      <p id="firstFri">Breakfast Meal</p>
      <p id="secondFri">Lunch Meal</p>
      <p id="thirdFri">Dinner Meal</p>
    </div>
    <div id="saturday">
      <h2 class="day">Saturday</h2>
      <p id="firstSat">Breakfast Meal</p>

      <p id="secondSat">Lunch Meal</p>
      <p id="thirdSat">Dinner Meal</p>
    </div>
  </div>
</template>

<style>

.day {
    margin-left: 25px;
    color: rgb(13, 117, 36);
    font-weight: bold;
    font-size: 25px;
}

#sunday,
#monday,
#tuesday,
#wednesday,
#thursday,
#friday {
  display: flex;
  justify-content: space-evenly;
  height: 80%;
  flex-direction: column;
  text-align: center;
}
#saturday {
  display: flex;
  justify-content: space-evenly;
  flex-direction: column;
}
#firstSun {
  grid-area: firstSun;
}
#secondSun {
  grid-area: secondSun;

}
#thirdSun {
  grid-area: thirdSun;
}
#firstMon {
  grid-area: firstMon;
}
#secondMon {
  grid-area: secondMon;
}
#thirdMon {
  grid-area: thirdMon;
}
#firstTue {
  grid-area: firstTue;
}
#secondTue {
  grid-area: secondTue;
  
}
#thirdTue {
  grid-area: thirdTue;
}
#firstWed {
  grid-area: firstWed;
}
#secondWed {
  grid-area: secondWed;
}
#thirdWed {
  grid-area: thirdWed;
}
#firstThu {
  grid-area: firstThu;
}
#secondThu {
  grid-area: secondThu;
  
}
#thirdThu {
  grid-area: thirdThu;
}
#firstFri {
  grid-area: firstFri;
}
#secondFri {
  grid-area: secondFri;
  
}
#thirdFri {
  grid-area: thirdFri;
}
#firstSat {
  grid-area: firstSat;
}
#secondSat {
  grid-area: secondSat;
  
}
#thirdSat {
  grid-area: thirdSat;
}


#weekly-grid {
 background-color: rgb(255, 255, 255);
 border: solid green 3px;
 font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
 border-radius: 20px;
 font-size: 20px;
 margin: 50px 40px;
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas:
    "firstSun firstMon firstTue firstWed firstThu firstFri firstSat"
    "secondSun secondMon secondTue secondWed secondThu secondFri secondSat"
    "thirdSun thirdMon thirdTue thirdWed thirdThu thirdFri thirdSat";
  align-items: center;
}
</style>