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

    addRecipe(userId, recipeId, recipeName) {
        const body = {
            recipeId: recipeId,
            recipeName: recipeName
        }
        return axios.post(`/recipes/${userId}`, body)
    }
}