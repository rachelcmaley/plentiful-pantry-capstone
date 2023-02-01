package com.techelevator.dao;

import com.techelevator.model.Ingredient;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

public interface PantryDao {

    public List<Ingredient> getAllIngredientsByPantryId(int pantryId);

    public List<Ingredient> getAllIngredients();

    public boolean addIngredient(String ingredientName, Long ingredientId);

    public boolean removeIngredient(Long ingredientId);
}
