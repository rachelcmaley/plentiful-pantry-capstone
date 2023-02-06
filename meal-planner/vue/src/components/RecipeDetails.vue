<template>
  <div class="recipe-details">
    <!-- recipe close btn -->
    <button
      type="button"
      class="recipe-close-btn"
      id="recipe-close-btn"
      @click="closeDetails()"
    >
      &times;
    </button>

    <!-- recipe content -->
    <div class="recipe-details-content">
      <h2 class="recipe-title">{{ recipeDetails.title }}</h2>
        <!-- TODO: add toggle 'Unsave recipe' -->
      <button type="button" class="recipe-save-btn" id="recipe-save-btn">
        Save Recipe
      </button>
      <div v-if="recipeDetails.cuisines != null" >
        <p class="recipe-category" > {{recipeDetails.cuisine}}</p>
      </div>
      <div class="recipe-details-img">
        <img class="sgetti" v-bind:src="recipeDetails.image" />
      </div>
      <div class="detail-points">
        <div>Total time to make: {{ recipeDetails.readyInMinutes }} minutes</div>
        <div>Servings: {{ recipeDetails.servings }}</div>
        </div>
        <div>
            <div class="recipe-category" > {{recipeDetails.diets[0]}}</div>
            <div class="recipe-category" > {{recipeDetails.diets[1]}}</div>
        </div>
      
      <h3 class="instruct-heading">Instructions:</h3>
      <div class="recipe-instruction">
        <div>
          <ol>
          <li v-for="step in recipeDetails.analyzedInstructions[0].steps"
          :key="step.number">
            {{
              step.step
            }}
            {{
              step.ingedients
            }}</li>
            
          </ol>
        </div>

        <!-- <p> TEST: Lorem, ipsum dolor sit amet consectetur adipisicing elit.
        Cupiditate dolores nobis ipsa quisquam incidunt officia, unde
        suscipit saepe ratione, a commodi nostrum ea magni quod omnis!
        Sunt quasi ducimus tenetur? </p>
        <p> Lorem, ipsum dolor sit amet consectetur adipisicing elit.
        Cupiditate dolores nobis ipsa quisquam incidunt officia, unde
        suscipit saepe ratione, a commodi nostrum ea magni quod omnis!
        Sunt quasi ducimus tenetur? </p> -->
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["details", "onClose"],
  created() {},
  methods: {
    closeDetails() {
      this.onClose();
    },
  },
  data() {
    return {
      recipeDetails: this.details,
      diets: [],
    };
  },
};
</script>

<style>
/*recipe details */
.recipe-details {
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: rgb(255, 255, 255);
  background: #ffb20f;
  border-radius: 1rem;
  width: 90%;
  height: 90%;
  overflow-y: scroll;
  display: block;
  padding: 2rem 0;
}

/* cute scrollbar */
.recipe-details::-webkit-scrollbar {
  width: 10px;
}
.recipe-details::-webkit-scrollbar-thumb {
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

.recipe-close-btn {
  position: fixed;
  right: 2rem;
  top: .5rem;
  font-size: 30px;
  border: none;
  width: 50px;
  height: 50px;
  border-radius: 50%;
  /* display: center; */
  /* align-items: center;  */
  /* justify-content: center;  */
  transition: all 0.4s linear;
  opacity: 0.9; 
  cursor: pointer;
  background: #ffb20f;
}

.recipe-title {
  letter-spacing: 1px;
  padding-bottom: 1rem;
  font-weight: 800;
  font-size: 2rem;
}

.recipe-category {
  background: #fff;
  font-weight: 600;
  color: #ffb20f;
  display: inline-block;
  padding: 0.2rem 0.5rem;
  border-radius: 0.3rem;
  margin: .75rem;
}

.detail-points{
    margin-top: 1rem;
    list-style: none;
    text-align: center;
}

.instruct-heading {
    text-align: center;
    margin-top: 2rem;
    margin-bottom: 1rem;
}

.recipe-instruction {
  /* padding: 1rem 0; */
  justify-content: left;
  text-align: left;
}

.recipe-details-img img {
  margin: 0 auto;
  display: block;
  justify-content: center;
}

.recipe-save-btn {
  text-decoration: none;
  color: rgb(255, 255, 255);
  font-weight: 1.1rem;
  padding: 0.5rem 0;
  display: block;
  width: 175px;
  margin: 1rem auto;
  border-radius: 2rem;
  transition: all 0.4s linear;
  border: none;
}

.recipe-save-btn:hover {
  background: #074431;
}
</style>