package com.techelevator.controller;

import com.techelevator.dao.SavedRecipesDao;
import com.techelevator.model.SavedRecipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
