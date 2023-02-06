package com.techelevator.dao;
import com.techelevator.model.MealPlan;

import java.util.List;

public interface MealPlanDao{
    public List<MealPlan> getRecipeIdByMealPlanId(int userId);
}
