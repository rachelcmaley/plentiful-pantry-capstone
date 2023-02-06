package com.techelevator.dao;

import com.techelevator.model.MealPlan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class JdbcMealPlanDao implements MealPlanDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcMealPlanDao(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<MealPlan> getRecipeIdByMealPlanId(int userId){
        List<MealPlan> recipes = new ArrayList<>();

        String sql="SELECT recipe_id "+
                    "FROM meal_plan AS mp "+
                    "INNER JOIN users AS u "+
                    "ON mp.user_id = u.user_id";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql,userId);
//        while(results.next()) {
//            MealPlan recipe = mapRowTo
//        }

        private MealPlan mapRowToMealPlan (SqlRowSet rs) {

        }
    }
}
