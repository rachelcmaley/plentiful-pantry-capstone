package com.techelevator.model;


public class MealPlan {

    private int mealPlanId;
    private int userId;
    private int recipeId;

    public int getMealPlanId() {
        return mealPlanId;
    }

    public void setMealPlanId(int mealPlanId)
    {
        this.mealPlanId = mealPlanId;
    }

    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public int getRecipeId(){
        return recipeId;
    }
    public void setRecipeId(int recipeId)
    {
        this.recipeId = recipeId;
    }
}

