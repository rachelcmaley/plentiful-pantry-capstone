package com.techelevator.model;


import java.util.Date;

public class SavedRecipes {

    private int savedRecipeId;
    private String recipeName;
    private int userId;
    private int recipeId;
    private String mealDay;
    private String mealType;

    public int getSavedRecipeId() {
        return savedRecipeId;
    }

    public void setSavedRecipeId(int savedRecipeId) {
        this.savedRecipeId = savedRecipeId;
    }

    public String getRecipeName()
    {
        return recipeName;
    }

    public void setRecipeName(String recipeName)
    {
        this.recipeName = recipeName;
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

    public void setMealDay(String mealDay)
    {
        this.mealDay = mealDay;
    }
    public String getMealDay() {
        return mealDay;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
}

