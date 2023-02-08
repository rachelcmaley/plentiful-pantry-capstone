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

    @PostMapping(path = "/pantry/{userId}/ingredients")
    public void addIngredient(@PathVariable int userId, @RequestBody Ingredient ingredient) {

        //System.out.println(ingredient.getIngredientName());

       // save to database

        pantryDao.addIngredient(userId, ingredient.getIngredientName());
    }


//    @DeleteMapping(path = "/pantry/{userId}")
//    public void removeIngredient(@PathVariable int userId) {
//
//        pantryDao.removeIngredient(userId);
//
//    }
}
