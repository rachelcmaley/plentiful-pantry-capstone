<template>
  <div id="weekly-grid">
    <div id="sunday">
      <h2>Sunday</h2>
      <p id="firstSun">Breakfast meal</p>
      <p id="secondSun">Lunch Meal</p>
      <p id="thirdSun">Dinner Meal</p>
    </div>
    <div id="monday">
      <h2>Monday</h2>
        <p id="firstMon">Breakfast Meal</p>
        <p id="secondMon">Lunch Meal</p>
        <p id="thirdMon">Dinner Meal</p>
    </div>
    <div id="tuesday">
      <h2>Tuesday</h2>
        <p id="firstTue">Breakfast Meal</p>
        <p id="secondTue">Lunch Meal</p>
        <p id="thirdTue">Dinner Meal</p>
    </div>
    <div id="wednesday">
      <h2>Wednesday</h2>
        <p id="firstWed">Breakfast Meal</p>
        <p id="secondWed">Lunch Meal</p>
        <p id="thirdWed">Dinner Meal</p>
    </div>
    <div id="thursday">
      <h2>Thursday</h2>
        <p id="firstThu">Breakfast Chicken Meal</p>
        <p id="secondThu">Lunch Meal</p>
        <p id="thirdThu">Dinner Meal</p>
    </div>
    <div id="friday">
      <h2>Friday</h2>
        <p id="firstFri">Breakfast Meal</p>
        <p id="secondFri">Lunch Meal</p>
        <p id="thirdFri">Dinner Meal</p>
    </div>
    <div id="saturday">
      <h2>Saturday</h2>
        <p id="firstSat">Breakfast Meal</p>
        <p id="secondSat">Lunch Meal</p>
        <p id="thirdSat">Dinner Meal</p>
    </div>
  </div>
</template>

<style>
p{
    width: 80%;
}
h2 {
    font-size: 18px;
    align-content: center;
}
body{
    background: #0b6e4f;
}
#sunday,#monday,
#tuesday,#wednesday,
#thursday,#friday{
    display: flex;
    align-items: center;
    justify-content: space-evenly;
    padding-left: 20px;
    background: white;
    border-right: solid 1px grey;
    height: 80%;
    flex-direction: column;
}
#saturday {
    display: flex;
    align-items: center;
    justify-content: space-evenly;
    padding-left: 20px;
    background: white;
    height: 80%;
    flex-direction: column;
}
#firstSun {
  grid-area:firstSun;
}
#secondSun {
  grid-area:secondSun;
  padding-bottom:25px;
  padding-top: 25px;
  border-top:solid 1px lightgrey ;
  border-bottom: solid 1px lightgrey;
}
#thirdSun {
  grid-area:thirdSun;
}
#firstMon {
    grid-area:firstMon;
    padding: 10px;
}
#secondMon {
    grid-area:secondMon;
    padding-bottom:25px;
  padding-top: 25px;
  border-top:solid 1px lightgrey ;
  border-bottom: solid 1px lightgrey;
}
#thirdMon {
    grid-area:thirdMon;
    padding: 10px;
}
#firstTue {
    grid-area: firstTue;
    padding: 10px;
}
#secondTue {
    grid-area: secondTue;
    padding-bottom:25px;
  padding-top: 25px;
  border-top:solid 1px lightgrey ;
  border-bottom: solid 1px lightgrey;
}
#thirdTue {
    grid-area: thirdTue;
    padding: 10px;
}
#firstWed {
    grid-area: firstWed;
    padding: 10px;
}
#secondWed {
    grid-area: secondWed;
    padding-bottom:25px;
  padding-top: 25px;
  border-top:solid 1px lightgrey ;
  border-bottom: solid 1px lightgrey;
}
#thirdWed {
    grid-area: thirdWed;
    padding: 10px;
}
#firstThu{
    grid-area: firstThu;
    padding: 10px;
}
#secondThu{
    grid-area: secondThu;
    padding-bottom:25px;
  padding-top: 25px;
  border-top:solid 1px lightgrey ;
  border-bottom: solid 1px lightgrey;
}
#thirdThu{
    grid-area: thirdThu;
    padding: 10px;
}
#firstFri{
    grid-area: firstFri;
    padding: 10px;
}
#secondFri{
    grid-area: secondFri;
    padding-bottom:25px;
  padding-top: 25px;
  border-top:solid 1px lightgrey ;
  border-bottom: solid 1px lightgrey;
}
#thirdFri{
    grid-area: thirdFri;
    padding: 10px;
}
#firstSat{
    grid-area: firstSat;
    padding: 10px;
}
#secondSat{
    grid-area: secondSat;
    padding-bottom:25px;
  padding-top: 25px;
  border-top:solid 1px lightgrey ;
  border-bottom: solid 1px lightgrey;
}
#thirdSat{
    grid-area: thirdSat;
    padding: 10px;
}
#weekly-grid {
    width: 95%;
    padding-left: 2%;
    padding-right: 2%;
    margin-top: 30px;
    border-radius: 25px;
    border: 1px solid black;
    background: white;
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas:
    "firstSun firstMon firstTue firstWed firstThu firstFri firstSat"
    "secondSun secondMon secondTue secondWed secondThu secondFri secondSat"
    "thirdSun thirdMon thirdTue thirdWed thirdThu thirdFri thirdSat";
    column-gap: 50px;
    align-items: center;
}
</style>