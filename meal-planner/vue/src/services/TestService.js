import axios from 'axios';

const foodApi ="https://whatever.com"
const key ="fdswah4e21fd4"

const http = axios.create({
    baseURL: foodApi
  });

export default {

    // this is just a demo - change to meet YOUR needs
  getRecipe(recipeId) {
    const url = `${foodApi}/recipes/${recipeId}?key=${key}`;
    console.log(url);
    return http.get(url);
  }
  

}