import axios from "axios";

export default {
    getRecipes(userId) {
        let response = axios.get(`/recipes/${userId}`);
        // console.log(response);
        return response;
    },

    getRecipeIdByUserId(userId) {
        let response = axios.get(`/recipes/recipeId/${userId}`);
        // console.log(response);
        return response;
    },

    getDummyRecipes(){
        return axios.get(`/recipes/1`);
    },

    addRecipe(userId, recipeId, recipeName) {
        const body = {
            recipeId: recipeId,
            recipeName: recipeName
        }
        return axios.post(`/recipes/${userId}`, body)
    },

    updateRecipe(userId, recipeId, mealDate, mealType) {
        const body = {
            recipeId: recipeId,
            mealDate: mealDate,
            mealType: mealType
        }
        return axios.put(`/recipes/${userId}`, body)
    }
}