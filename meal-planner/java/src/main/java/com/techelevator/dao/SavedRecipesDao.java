package com.techelevator.dao;
import com.techelevator.model.SavedRecipes;

import java.util.List;

public interface SavedRecipesDao {
    List<SavedRecipes> getRecipesByUserId(int userId);
}
