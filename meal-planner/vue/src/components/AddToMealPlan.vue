<template>
  <div class="add-meal-content">
    <h2 class="form-header">Add {{ recipeInfo.title }} to this Week</h2>
    <div class="recipe-details-img">
      <img class="sgetti" v-bind:src="recipeInfo.image" />
    </div>
    <form class="form-add-meal" >
      <div class="input-wrapper">
        <div class="form-boxes">
          <div class="form-box-one">
            <label for="dayOfTheWeek" class="form-subheader" required
              >Please select day to add to:</label
            >
            <li class="list">
              <ul class="radio">
                <input type="radio" @change="changeWeekday('monday')"  name="weekdays" />
                Monday
              </ul>
              <ul class="radio">
                <input type="radio" @change="changeWeekday('tuesday')" name="weekdays" />
                Tuesday
              </ul>
              <ul class="radio">
                <input type="radio" @change="changeWeekday('wednesday')" name="weekdays" />
                Wednesday
              </ul>
              <ul class="radio">
                <input type="radio" @change="changeWeekday('thursday')" name="weekdays" />
                Thursday
              </ul>
              <ul class="radio">
                <input type="radio" @change="changeWeekday('friday')" name="weekdays" />
                Friday
              </ul>
              <ul class="radio">
                <input type="radio" @change="changeWeekday('saturday')" name="weekdays" />
                Saturday
              </ul>
              <ul class="radio">
                <input type="radio" @change="changeWeekday('sunday')" name="weekdays" />
                Sunday
              </ul>
            </li>
          </div>
          <div class="form-box-two">
            <label for="mealType" class="form-subheader" required
              >Which meal will this be?</label
            >
            <li class="list">
              <ul class="radio">
                <input type="radio" @change="changeMeal('breakfast')" name="mealType" />
                Breakfast
              </ul>
              <ul class="radio">
                <input type="radio" @change="changeMeal('lunch')" name="mealType" />
                Lunch
              </ul>
              <ul class="radio">
                <input type="radio" @change="changeMeal('dinner')" name="mealType" />
                Dinner
              </ul>
            </li>
          </div>
        </div>

        <div class="buttons">
          <button
            type="button"
            class="cancel-btn"
            id="cancel-btn"
            @click="closeForm()"
          >
            Cancel
          </button>
          <button type="submit" class="submit-btn" id="submit-btn" @click.prevent="addMealPlan">
            Submit
          </button>
        </div>
      </div>
    </form>
  </div>
</template>

<script>
// import recipesService from "../services/RecipesService.js"

export default {
  data() {
    return {
      recipeInfo: this.recipe,
      newMealPlan: {
        userId: this.$store.state.user.id,
        recipeName: '',                     
        mealDate: '',
        mealType: ''
      },

    };
  },

  props: ["recipe", "onClose"],

  methods: {
    closeForm() {
      this.onClose();
    },
    addMealPlan() {
      this.newMealPlan.recipeName = this.recipeInfo.title;
      this.$store.commit("ADD_MEAL_PLAN", this.newMealPlan);
      this.closeForm();
    },
    changeWeekday(day)
    {
      this.newMealPlan.mealDate = day;
    },
    changeMeal(meal)
    {
      this.newMealPlan.mealType = meal;
    }
  },

  //update recipe in DB - incomplete
  // updateRecipe() {
  //   const userId = this.$store.state.user.id;
  //   recipesService
  //   .updateRecipe(userId, this.recipeInfo.id, this.mealDate, this.mealType)
  //   .then(() => {
  //     this.mealDate = '';
  //     this.mealType = '';
  //     this.closeForm();
  //   });
  // },

};
</script>

<style>
.add-meal-content {
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: rgb(255, 255, 255);
  background: #ffb20f;
  border-radius: 1rem;
  width: 40%;
  height: 90%;
  overflow-y: scroll;
  display: block;
  padding: 2rem 0;
}

/* cute scrollbar */
.add-meal-content::-webkit-scrollbar {
  width: 10px;
}
.add-meal::-webkit-scrollbar-thumb {
  background: #fff;
  border-radius: 2rem;
}

/*js related*/
.showRecipe {
  display: block;
}

.recipe-details-content {
  margin: 2rem;
}

.recipe-details-content p:not(.recipe-category) {
  padding: 1rem 0;
}

.form-header {
  letter-spacing: 1px;
  padding-bottom: 1rem;
  font-weight: 700;
  font-size: 2rem;
  color: #0b6e4f;
}

.form-boxes {
  display: flex;
  justify-content: space-evenly;
  flex-direction: row;
  margin-top: 30px;
}

.form-subheader {
  background: #fff;
  color: #0b6e4f;
  margin-top: 20px;
  margin-left: 20px;
  margin-bottom: 20px;
  font-size: 1.1rem;
  font-weight: 500;
  border-radius: 0.5rem;
  padding: 0.5rem;
}

.list {
  text-align: left;
  list-style-type: none;
  color: #0b6e4f;
  font-size: 1.1rem;
  font-weight: 500;
  margin-left: 0;
}

.buttons {
  display: flex;
  justify-content: space-between;
  flex-direction: row;
  margin-top: 30px;
}

.submit-btn,
.cancel-btn {
  text-decoration: none;
  color: rgb(255, 255, 255);
  font-weight: 0.5rem;
  padding: 0.5rem 0;
  display: block;
  width: 175px;
  border-radius: 2rem;
  transition: all 0.4s linear;
  cursor: pointer;
  margin-top: 3rem;
}

.submit-btn {
  border: none;
  margin-right: 3rem;
  background: #0b6e4f;
}

.submit-btn:hover {
  background: #084935;
}

.cancel-btn {
  background: #ffb20f;
  color: #0b6e4f;
  border-color: #0b6e4f;
  cursor: pointer;
  margin-left: 3rem;
}

.cancel-btn:hover {
  background: #b47f0c;
}
</style>