import axios from "axios";

export default {

    getIngredients () {

        return axios.get(`/pantry/ingredients`);

    },

    addIngredient(userId, ingredientName)
    {
        const body = {
            ingredientName: ingredientName
        }
        return axios.post(`/pantry/${userId}/ingredients`, body);
    },

    getPantryIngredients(userId) {
        
        let response = axios.get(`/pantry/${userId}`)
        console.log(response)
        return response;

    },

    deleteIngredient(userId, ingredientName) {

        return axios.delete(`/pantry/${userId}/ingredients`, ingredientName)

    }

    

};

