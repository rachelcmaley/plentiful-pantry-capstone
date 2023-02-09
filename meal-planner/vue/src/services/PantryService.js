import axios from "axios";

export default {

    getIngredients () {

        return axios.get(`/pantry/ingredients`);

    },

    getPantryIngredients(userId) {
        
        let response = axios.get(`/pantry/${userId}`)
        console.log(response)
        return response;

    },

    addIngredient(userId, ingredientName)
    {
        const body = {
            ingredientName: ingredientName
        }
        return axios.post(`/pantry/${userId}/ingredients`, body);
    },

    deleteIngredient(userId, ingredientName) {

        // const body = {
        //     ingredientName: ingredientName
        // }
        // const body = ingredientName
        return axios.delete(`/pantry/${userId}/ingredients/${ingredientName}`)

    }

};

