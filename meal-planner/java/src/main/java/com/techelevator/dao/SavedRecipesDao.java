package com.techelevator.dao;
import com.techelevator.model.SavedRecipes;

import java.util.List;

public interface SavedRecipesDao {
    List<SavedRecipes> getRecipesByUserId(int userId);

    public void addRecipe(int userId, int recipeId, String recipeName);

    List<SavedRecipes> getRecipeIdByUserId(int userId);
}
