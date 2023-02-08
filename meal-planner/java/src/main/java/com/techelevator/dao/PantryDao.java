package com.techelevator.dao;

import com.techelevator.model.Ingredient;
import com.techelevator.model.Pantry;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface PantryDao {

    public List<Ingredient> getAllIngredientsByUserId(int userId);

    public List<Ingredient> getAllIngredients();

    public List<Pantry> getAllPantryIngredientsByUserId(int userId);

    public void addIngredient(int userId, String ingredientName);

    public void removeIngredient(int userId, String ingredientName);
}
