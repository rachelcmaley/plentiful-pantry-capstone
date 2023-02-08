import axios from 'axios';

const baseUrl =  'https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com';
const api = axios.create({
	headers: {
		'X-RapidAPI-Key': '19515db714msh0e0fbfab7033a57p1ee74bjsn296510ffd45b',
		'X-RapidAPI-Host': 'spoonacular-recipe-food-nutrition-v1.p.rapidapi.com'
	}
})


export default {

	searchRecipes(ingredients) {

	// 	const options = {
	// 		method: 'GET',
	// 		url: 'https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/findByIngredients',
	// 		params: {
	// 			ingredients: ingredients,//'apples,flour,sugar',
	// 			number: '5',
	// 			ignorePantry: 'true',
	// 			ranking: '1'
	// 		},
	// 		headers: {
	// 			'X-RapidAPI-Key': '19515db714msh0e0fbfab7033a57p1ee74bjsn296510ffd45b',
	// 			'X-RapidAPI-Host': 'spoonacular-recipe-food-nutrition-v1.p.rapidapi.com'
	// 		}
	// 	};

	// 	return axios.request(options)
		///recipes/findByIngredients?ingredients=apples,flour,sugar&number=5&ignorePantry=true&ranking=1


		const url = `${baseUrl}/recipes/findByIngredients?ingredients=${ingredients}&number=5&ignorePantry=true&ranking=1`;
		console.log(ingredients)
		return api.get(url)
		

	},

	getRecipeById(id)
	{
		//  url: 'https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/479101/information',
		const url = `${baseUrl}/recipes/${id}/information`
		return api.get(url);
		// console.log(id);
	}
}