import axios from "axios";

export default {
    getRecipes(userId) {
        return axios.get(`/recipes/${userId}`);
    }
}