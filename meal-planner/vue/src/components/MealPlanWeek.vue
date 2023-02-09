<template>

  <div id="weekly-grid">
    <div>
      <h2 class="day" id="sunday">Sunday</h2>
        <div id="line">
          <p  id="fSu">{{mealPlanRecipes[0].recipeName}}</p>
          <p id="sSu">{{mealPlanRecipes[1].recipeName}}</p>
          <p id="tSu">{{mealPlanRecipes[2].recipeName}}</p>
        </div>
    </div>
    <div>
      <h2 class="day" id="monday">Monday</h2>
        <div id="line">
            <p id="fMo">{{mealPlanRecipes[3].recipeName}}</p>
            <p id="sMo">{{mealPlanRecipes[4].recipeName}}</p>
            <p id="tMo">{{mealPlanRecipes[5].recipeName}}</p>
        </div>
    </div>
    <div >
        <h2 class="day" id="tuesday">Tuesday</h2>
          <div id="line">
            <p id="fTu">{{mealPlanRecipes[6].recipeName}}</p>
            <p id="sTu">{{mealPlanRecipes[7].recipeName}}</p>
            <p id="tTu">{{mealPlanRecipes[8].recipeName}}</p>
          </div>
    </div>
    <div >
      <h2 class="day" id="wednesday">Wednesday</h2>
        <div id="line"> 
          <p id="fWe">{{mealPlanRecipes[9].recipeName}}</p>
          <p id="sWe">{{mealPlanRecipes[10].recipeName}}</p>
          <p id="tWe">{{mealPlanRecipes[11].recipeName}}</p>
         </div>
    </div>
    <div >
      <h2 class="day" id="thursday">Thursday</h2>
          <div id="line">
            <p id="fTh">{{mealPlanRecipes[12].recipeName}}</p>
            <p id="sTh">{{mealPlanRecipes[13].recipeName}}</p>
            <p id="tTh">{{mealPlanRecipes[14].recipeName}}</p>
          </div>
    </div>
    <div >
      <h2 class="day" id="friday">Friday</h2>
          <div id="line">
          <p id="fFr">{{mealPlanRecipes[15].recipeName}}</p>
          <p id="sFr">{{mealPlanRecipes[16].recipeName}}</p>
          <p id="tFr">{{mealPlanRecipes[17].recipeName}}</p>
          </div>
    </div>
    <div>
      <h2 class="day" id="saturday">Saturday</h2>
      <p id="fSa">{{mealPlanRecipes[18].recipeName}}</p>
      <p id="sSa">{{mealPlanRecipes[19].recipeName}}</p>
      <p id="tSa">{{mealPlanRecipes[20].recipeName}}</p>
    </div>
  </div>
</template>


<script>
 import RecipesService from '../services/RecipesService.js';

export default{
  data() {
    return {
      // sunday : {
      //   breakfast :"",
      //   lunch:"",
      //   dinner:""
      // },
      days:[
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
      ],
      meals:[
        "Breakfast",
        "Lunch",
        "Dinner"
      ],
      mealPlanRecipes: [],
      test: ""
    };
  },
created(){
  this.addToMealPlan()
  
},

methods: {
  addToMealPlan() {
  RecipesService.getDummyRecipes()
  .then((response)=> {
    this.mealPlanRecipes = response.data;
    // this.days.forEach(day =>{
    //   this.meals.forEach(meal => {
    //     const foundRecipe = this.mealPlanRecipes.find(recipe=>{
    //       if(recipe.mealDay)
    //     })
    //   })
    // })
  })
}
}
};
</script>


<style>

/*
      Grid names are broken into two parts
      the first letter signifies if its the First Second or Third meal. F, S, or T.
      The last two letters are the first two letters of the day of the week.

      for example,  
      *F* irst    *Su* nday = fSu
      *S* second  *Mo* nday = sMo
  */



#fSu {grid-area: fSu;
}
#sSu {
  grid-area: sSu;
}
#tSu {
  grid-area: tSu;
}
#fMo{
  grid-area: fMo;
}
#sMo{
  grid-area: sMo;
}
#tMo{
  grid-area: tMo;
}
#fTu {
  grid-area: fTu;
}
#sTu {
  grid-area: sTu;
  
}
#tTu {
  grid-area: tTu;
}
#fWe {
  grid-area: fWe;
}
#sWe {
  grid-area: sWe;
}
#tWe {
  grid-area: tWe;
}
#fTh {
  grid-area: fTh;
}
#sTh {
  grid-area: sTh;
  
}
#tTh {
  grid-area: tTh;
}
#fFr {
  grid-area: fFr;
}
#sFr {
  grid-area: sFr;
  
}
#tFr{
  grid-area: tFr;
}
#fSa {
  grid-area: fSa;
}
#sSa {
  grid-area: sSa;
}
#tSa {
  grid-area: tSa;
}
#sunday{
  grid-area: sunday;
}
#monday{
  grid-area: monday;
}
#tuesday{
  grid-area: tuesday;
}
#wednesday{
  grid-area: wednesday;
}
#thursday{
  grid-area: thursday;
}
#friday{
  grid-area: friday;
}
#saturday{
  grid-area: saturday;
}

.day{
  font-weight: bold;
  text-align: center;
  border-bottom: solid rgb(95, 156, 95) 3px;
  color: green;
}

#line{
  border-right: solid green 3px;
}

p{
  text-align: center;
}

#weekly-grid {
 background-color: rgb(221, 255, 231);
 border: solid rgb(95, 156, 95) 3px;
 font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
 border-radius: 20px;
 padding: 45px 20px 30px 20px;
 font-size: 20px;
 display: grid;
 height: 280px;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr;

  grid-template-areas:
    "sunday monday tuesday wednesday thursday friday saturday"
    "fSu fMo fTu fWe fTh fFr fSa"
    "sSu sMo sTu sWe sTh sFr sSa"
    "tSu tMo tTu tWe tTh tFr tSa";
}


</style>