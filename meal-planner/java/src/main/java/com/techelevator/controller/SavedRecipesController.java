package com.techelevator.controller;

import com.techelevator.dao.SavedRecipesDao;
import com.techelevator.model.SavedRecipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class SavedRecipesController {

    @Autowired
    private SavedRecipesDao savedRecipesDao;

    public SavedRecipesController(SavedRecipesDao savedRecipesDao) {
        this.savedRecipesDao = savedRecipesDao;
    }

    @GetMapping(path="/recipes/{userId}")
    public List<SavedRecipes> getSavedRecipesList(@PathVariable int userId)
    {
        List<SavedRecipes> recipes = savedRecipesDao.getRecipesByUserId(userId);
        return recipes;
    }

    //save (add) recipe to DB
    @PostMapping(path= "/recipes/{userId}")
    public void addRecipe(@PathVariable int userId, @RequestBody SavedRecipes savedRecipes) {
        savedRecipesDao.addRecipe(userId, savedRecipes.getRecipeId(), savedRecipes.getRecipeName());
    }

    @GetMapping(path="/recipes/recipeId/{userId}")
    public List<Integer> getRecipeIdByUserId(@PathVariable int userId)
    {
        List<Integer> recipeIds = savedRecipesDao.getRecipeIdByUserId(userId);
        return recipeIds;
    }

    @PutMapping(path="recipes/{userId}")
    public void updateSavedRecipes(@RequestBody SavedRecipes savedRecipes, @PathVariable int userId)
    {
        savedRecipesDao.updateSavedRecipes(userId,savedRecipes.getMealDay(),savedRecipes.getMealType(),savedRecipes.getRecipeName(),savedRecipes.getRecipeId());
    }
}
