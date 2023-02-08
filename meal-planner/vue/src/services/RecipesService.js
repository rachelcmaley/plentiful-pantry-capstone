import axios from "axios";

export default {
    // getRecipes(userId) {
    //     return axios.get(`/recipes/${userId}`);
    // },
    getRecipes() {
        return axios.get(`/recipes/1`);
    },

    addRecipe(userId, recipeId, recipeName) {
        const body = {
            recipeId: recipeId,
            recipeName: recipeName
        }
        return axios.post(`/recipes/${userId}`, body)
    }
}