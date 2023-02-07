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
    }

};

