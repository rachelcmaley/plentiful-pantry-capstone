package com.techelevator.dao;

import com.techelevator.model.Ingredient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcPantryDao implements PantryDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcPantryDao(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    @Override
    public List<Ingredient> getAllIngredientsByPantryId(int pantryId) {
        List<Ingredient> ingredients = new ArrayList<>();
        String sql = "SELECT *" +
                "FROM pantry_ingredients as pi\n" +
                "INNER JOIN pantry as p\n" +
                "ON pi.pantry_id = p.pantry_id\n" +
                "INNER JOIN ingredients as i\n" +
                "ON pi.ingredient_id = i.ingredient_id" +
                "WHERE pantry_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, pantryId);
        while (results.next()) {
            Ingredient ingredient = mapRowToIngredient(results);
            ingredients.add(ingredient);
        }
        return ingredients;
    }

    @Override
    public List<Ingredient> getAllIngredients() {

        List<Ingredient> ingredients = new ArrayList<>();
        String sql = "SELECT ingredient_name\n" +
                "FROM ingredients;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Ingredient ingredient = mapRowToIngredient(results);
            ingredients.add(ingredient);
        }
        return ingredients;

    }

    @Override
    public boolean addIngredient(String ingredientName, Long ingredientId) {
        return false;
    }

    @Override
    public boolean removeIngredient(Long ingredientId) {
        return false;
    }

    private Ingredient mapRowToIngredient(SqlRowSet rs) {
        Ingredient ingredient = new Ingredient();
        ingredient.setIngredientName(rs.getString("ingredient_name"));
        ingredient.setIngredientId(rs.getInt("ingredient_id"));
        return ingredient;
    };

}
