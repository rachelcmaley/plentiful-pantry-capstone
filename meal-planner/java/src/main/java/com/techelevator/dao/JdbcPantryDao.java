package com.techelevator.dao;

import com.techelevator.model.Ingredient;
import com.techelevator.model.Pantry;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcPantryDao implements PantryDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcPantryDao(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    //loads all the user's pantry items when they log in
    @Override
    public List<Ingredient> getAllIngredientsByUserId(int userId) {
        List<Ingredient> ingredients = new ArrayList<>();
        String sql = "SELECT ingredient_name\n" +
                "FROM pantry_ingredients as pi\n" +
                "INNER JOIN pantry as p\n" +
                "ON pi.pantry_id = p.pantry_id\n" +
                "INNER JOIN users as u\n" +
                "ON p.user_id = u.user_id\n" +
                "INNER JOIN ingredients as i\n" +
                "ON pi.ingredient_id = i.ingredient_id;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        while (results.next()) {
            Ingredient ingredient = mapRowToIngredient(results);
            ingredients.add(ingredient);
        }
        return ingredients;
    }

    @Override
    public List<Pantry> getAllPantryIngredientsByUserId(int userId) {
        List<Pantry> pantrys = new ArrayList<>();
        String sql = "SELECT ingredient_name " +
                ", pi.ingredient_id " +
                ", i.ingredient_name " +
                "FROM pantry_ingredients AS pi " +
                "INNER JOIN pantry AS p " +
                "ON pi.pantry_id = p.pantry_id " +
                "INNER JOIN users AS u " +
                "ON p.user_id = u.user_id " +
                "INNER JOIN ingredients AS i " +
                "ON pi.ingredient_id = i.ingredient_id;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        while (results.next()) {
            Pantry pantry = mapRowToPantry(results);
            pantrys.add(pantry);
        }
        return pantrys;
    }

    @Override
    public List<Ingredient> getAllIngredients() {

        List<Ingredient> ingredients = new ArrayList<>();
        String sql = "SELECT ingredient_id, ingredient_name\n" +
                "FROM ingredients;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Ingredient ingredient = mapRowToIngredient(results);
            ingredients.add(ingredient);
        }
        return ingredients;

    }

    //allows user to add ingredient to pantry
    @Override
    public void addIngredient(Ingredient ingredient) {
        if(ingredient.getIngredientId() == 0) {
             int newId = 0;                                //TODO: How to create an ingredient_id for a new Ingredient?
            ingredient.setIngredientId(newId);
            jdbcTemplate.update("INSERT INTO ingredients(ingredient_name, ingredient_id)\n" +
                    "\tVALUES (?, ?);",
                    ingredient.getIngredientId(), ingredient.getIngredientName());
        }
    }

    // remove ingredient from user's pantry
    @Override
    public void removeIngredient(Long ingredientId) {
        String sql = "DELETE FROM ingredients WHERE ingredient_id = ?;";
        jdbcTemplate.update(sql, ingredientId);
    }

    private Ingredient mapRowToIngredient(SqlRowSet rs) {
        Ingredient ingredient = new Ingredient();
        ingredient.setIngredientName(rs.getString("ingredient_name"));
        ingredient.setIngredientId(rs.getInt("ingredient_id"));
        return ingredient;
    }

    private Pantry mapRowToPantry(SqlRowSet results) {
        Pantry pantry = new Pantry();
        pantry.setIngredientName(results.getString("ingredient_name"));
        pantry.setPantryId(results.getInt("pantry_id"));
        pantry.setIngredientId(results.getInt("ingredient_id"));
        return pantry;
    }


}
