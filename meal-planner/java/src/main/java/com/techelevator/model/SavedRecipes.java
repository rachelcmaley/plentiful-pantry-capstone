package com.techelevator.model;


import java.util.Date;

public class SavedRecipes {

    private String recipeName;
    private int userId;
    private int recipeId;
    private Date mealDate;
    private String mealType;

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

    public void setMealDate(Date mealDate)
    {
        this.mealDate = mealDate;
    }
    public Date getMealDate() {
        return mealDate;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
}

