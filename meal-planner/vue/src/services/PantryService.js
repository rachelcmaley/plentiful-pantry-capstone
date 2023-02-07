import axios from "axios";

export default {

    getIngredients () {

        return axios.get(`/pantry/ingredients`);

    },

    getIngredientsByPantryId(id) {

        return axios.get(`/pantry/ingredients/${id}`);

    }

    

};

