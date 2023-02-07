package com.techelevator.controller;

import com.techelevator.dao.JdbcPantryDao;
import com.techelevator.dao.PantryDao;
import com.techelevator.model.Ingredient;
import com.techelevator.model.Pantry;
import com.techelevator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PantryController {

    @Autowired
    private PantryDao pantryDao;

    public PantryController(PantryDao pantryDao) {
        this.pantryDao = pantryDao;
    }

    //lists all ingredients from ingredients table in database
    @GetMapping(path="pantry/ingredients")
    public List<Ingredient> ingredientList() {
        List<Ingredient> ingredients = pantryDao.getAllIngredients();
        return ingredients;
    }

    //lists a user's pantry ingredients
    @GetMapping(path="/pantry/{userId}")
    public List<Pantry> getAllPantryIngredientsByUserId(@PathVariable int userId) {

        List<Pantry> pantry = pantryDao.getAllPantryIngredientsByUserId(userId);
        return pantry;

    }

    //TODO: complete request method
    @PostMapping(path = "/pantry/{userId}/ingredients")
    public void addIngredient(@PathVariable String userId, @RequestBody Ingredient ingredient) {
        System.out.println(ingredient);

       // save to database
    }
}
