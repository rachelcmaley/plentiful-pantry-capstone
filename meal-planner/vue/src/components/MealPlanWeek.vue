<template>
  <div id="weekly-grid">
    <div>
      <h2 class="day" id="sunday">Sunday</h2>
      <div id="line">
        <p id="fSu">{{ getRecipe('sunday', 'breakfast') }}</p> <!-- goal is to add {{ $store.state.mealPlans.recipeName }} -->
        <p id="sSu">{{ getRecipe('sunday', 'lunch') }}</p> <!-- but how to specify which day/mealType to display? -->
        <p id="tSu">{{ getRecipe('sunday', 'dinner') }}</p>
      </div>
    </div>
    <div>
      <h2 class="day" id="monday">Monday</h2>
      <div id="line">
        <p id="fMo">{{ getRecipe('monday', 'breakfast') }}</p>
        <p id="sMo">{{ getRecipe('monday', 'lunch') }}</p>
        <p id="tMo">{{ getRecipe('monday', 'dinner') }}</p>
      </div>
    </div>
    <div>
      <h2 class="day" id="tuesday">Tuesday</h2>
      <div id="line">
        <p id="fTu">{{ getRecipe('tuesday', 'breakfast') }}</p>
        <p id="sTu">{{ getRecipe('tuesday', 'lunch') }}</p>
        <p id="tTu">{{ getRecipe('tuesday', 'dinner') }}</p>
      </div>
    </div>
    <div>
      <h2 class="day" id="wednesday">Wednesday</h2>
      <div id="line">
        <p id="fWe">{{ getRecipe('wednesday', 'breakfast') }}</p>
        <p id="sWe">{{ getRecipe('wednesday', 'lunch') }}</p>
        <p id="tWe">{{ getRecipe('wednesday', 'dinner') }}</p>
      </div>
    </div>
    <div>
      <h2 class="day" id="thursday">Thursday</h2>
      <div id="line">
        <p id="fTh">{{ getRecipe('thursday', 'breakfast') }}</p>
        <p id="sTh">{{ getRecipe('thursday', 'lunch') }}</p>
        <p id="tTh">{{ getRecipe('thursday', 'dinner') }}</p>
      </div>
    </div>
    <div>
      <h2 class="day" id="friday">Friday</h2>
      <div id="line">
        <p id="fFr">{{ getRecipe('friday', 'breakfast') }}</p>
        <p id="sFr">{{ getRecipe('friday', 'lunch') }}</p>
        <p id="tFr">{{ getRecipe('friday', 'dinner') }}</p>
      </div>
    </div>
    <div>
      <h2 class="day" id="saturday">Saturday</h2>
      <p id="fSa">{{ getRecipe('saturday', 'breakfast') }}</p>
      <p id="sSa">{{ getRecipe('saturday', 'lunch') }}</p>
      <p id="tSa">{{ getRecipe('saturday', 'dinner') }}</p>
    </div>
  </div>
</template>


<script>
import RecipesService from "../services/RecipesService.js";

export default {
  data() {
    return {
      // sunday : {
      //   breakfast :"",
      //   lunch:"",
      //   dinner:""
      // },
      days: [
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
      ],
      meals: ["Breakfast", "Lunch", "Dinner"],
      mealPlanRecipes: [],
      sortedMealPlanRecipes: [],
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
    this.days.forEach(day =>{
      let foundrecipe = {
        recipeName: "",
        savedRecipeId: "",
        userId: "",
        recipeId: "",
        mealDay:"",
        mealType: ""
      };
      this.meals.forEach(meal => {
        // const foundRecipe = this.mealPlanRecipes.find(recipe=>{
        //   (recipe.mealDay == day && recipe.mealType == meal)
            
        // })
        this.mealPlanRecipes.forEach(recipe => {
          if(recipe.mealDay == day && recipe.mealType == meal){
            foundrecipe.recipeName = recipe.recipeName;
            foundrecipe.savedRecipeId = recipe.savedRecipeId;
            foundrecipe.userId = recipe.userId;
            foundrecipe.recipeId = recipe.recipeId;
            foundrecipe.mealDay = recipe.mealDay;
            foundrecipe.mealType = recipe.mealType;
            this.sortedMealPlanRecipes.push(foundrecipe);
          }
        })
        //this.sortedMealPlanRecipes.push(foundRecipe);
      })
    })
  })
},
getRecipe(day, meal){
  const userId = this.$store.state.user.id;
  const recipes = this.$store.state.mealPlans.filter(plan => plan.userId == userId && plan.mealDate == day && plan.mealType == meal);

  if(recipes.length > 0)
    return recipes[0].recipeName;
  else 
    return "-";
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

#fSu {
  grid-area: fSu;
}
#sSu {
  grid-area: sSu;
}
#tSu {
  grid-area: tSu;
}
#fMo {
  grid-area: fMo;
}
#sMo {
  grid-area: sMo;
}
#tMo {
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
#tFr {
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
#sunday {
  grid-area: sunday;
}
#monday {
  grid-area: monday;
}
#tuesday {
  grid-area: tuesday;
}
#wednesday {
  grid-area: wednesday;
}
#thursday {
  grid-area: thursday;
}
#friday {
  grid-area: friday;
}
#saturday {
  grid-area: saturday;
}

.day {
  font-weight: bold;
  text-align: center;
  border-bottom: solid rgb(95, 156, 95) 3px;
  color: green;
}

#line {
  border-right: solid green 3px;
}

p {
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