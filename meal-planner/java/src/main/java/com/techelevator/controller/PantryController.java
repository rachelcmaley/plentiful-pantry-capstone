package com.techelevator.controller;

import com.techelevator.dao.JdbcPantryDao;
import com.techelevator.dao.PantryDao;
import com.techelevator.model.Ingredient;
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

    @GetMapping(path="pantry/ingredients")
    public List<Ingredient> ingredientList() {
        return pantryDao.getAllIngredients();
    }

    @GetMapping("/pantry/{userId}")
    public List<Ingredient> getAllIngredientsByUserId(@PathVariable int userId) { return pantryDao.getAllIngredientsByUserId(userId); }



    //TODO: complete request method
//    @RequestMapping(path = "/pantry/{userId}/addIngredientToPantry", method = RequestMethod.POST)
//    public void addIngredient(@PathVariable String userId) {
//        int ingredientId =
//
//       Ingredient ingredient = new Ingredient();
//       ingredient.setIngredientName();
//    }
}
