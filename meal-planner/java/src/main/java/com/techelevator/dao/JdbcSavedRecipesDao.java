package com.techelevator.dao;

import com.techelevator.model.SavedRecipes;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Component
public class JdbcSavedRecipesDao implements SavedRecipesDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcSavedRecipesDao(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<SavedRecipes> getRecipesByUserId(int userId) {
        List<SavedRecipes> recipes = new ArrayList<>();

        String sql = "SELECT * " +
                "FROM saved_recipes AS sr " +
                "INNER JOIN users AS u " +
                "ON sr.user_id = u.user_id"+
                "WHERE sr.user_id = ? ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        while (results.next()) {
            SavedRecipes recipe = mapRowToSavedRecipes(results);
            recipes.add(recipe);
        }
        return recipes;
    }

    @Override
    public void addRecipe(int userId, int recipeId, String recipeName) {
        String sql = "INSERT INTO saved_recipes (user_id, recipe_id, recipe_name) VALUES (?, ?, ?);";
        jdbcTemplate.update(sql, userId, recipeId, recipeName);
    }

    private SavedRecipes mapRowToSavedRecipes(SqlRowSet rs) {
            SavedRecipes savedRecipes = new SavedRecipes();
            savedRecipes.setUserId((rs.getInt("user_id")));
            savedRecipes.setRecipeId(rs.getInt("recipe_id"));
            savedRecipes.setRecipeName((rs.getString("recipe_name")));
            savedRecipes.setMealDate(rs.getDate("meal_date"));
            savedRecipes.setMealType((rs.getString("meal_type")));
            return savedRecipes;
        }
    }

