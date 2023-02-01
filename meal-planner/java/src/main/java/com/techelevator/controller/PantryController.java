package com.techelevator.controller;

import com.techelevator.dao.JdbcPantryDao;
import com.techelevator.dao.PantryDao;
import com.techelevator.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(path="/ingredients")
    public List<Ingredient> ingredientList() {
        return pantryDao.getAllIngredients();
    }

    @GetMapping("/pantry/{pantryId}")
    public List<Ingredient> getAllIngredientsByPantryId(@PathVariable int pantryId) { return pantryDao.getAllIngredientsByPantryId(pantryId); }

}
