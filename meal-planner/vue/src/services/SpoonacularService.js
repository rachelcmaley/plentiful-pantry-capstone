import axios from 'axios';
export default async function handler(req, res) {
	const options = {
		method: 'GET',
		url: 'https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/search',
		params: {
			ingredients: '',
            number: '5',
		},
		headers: {
			'x-rapidapi-host':
				'spoonacular-recipe-food-nutrition-v1.p.rapidapi.com',
			'x-rapidapi-key': '19515db714msh0e0fbfab7033a57p1ee74bjsn296510ffd45b'
		}
	};
	try {
		let response = await axios(options);
		res.status(200).json(response.data);
	} catch (error) {
		console.error(error.response);
	}
    
}