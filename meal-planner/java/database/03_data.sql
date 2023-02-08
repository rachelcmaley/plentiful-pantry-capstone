
-- insert users table data
INSERT INTO users (user_id, username,password_hash,role) VALUES (1, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (user_id, username,password_hash,role) VALUES (3, 'admin', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');
ALTER SEQUENCE seq_user_id RESTART WITH 4;

-- insert ingredients table data
COPY ingredients(ingredient_name, ingredient_id)
FROM 'C:\Users\Student\workspace\capstone-meal-planner\meal-planner\java\top-1k-ingredients.csv'
DELIMITER ';';

--insert dummy info into saved_recipes table

--sunday
INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 13,'Cereal','Sunday','Breakfast');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 25,'Quesadillas','Sunday','Lunch');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 57,'Pasta','Sunday','Dinner');

--monday
INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 13,'Coffee','Monday','Breakfast');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 25,'Chicken Biryani','Monday','Lunch');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 57,'Teppanyaki','Monday','Dinner');

--tuesday
INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 13,'Huevos Rancheros','Tuesday','Breakfast');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 25,'Tlayudas','Tuesday','Lunch');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 57,'Carne Asada','Tuesday','Dinner');

--wednesday
INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 13,'Cafe con Pan','Wednesday','Breakfast');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 25,'Chilaquiles','Wednesday','Lunch');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 57,'Spaghetti','Wednesday','Dinner');

--thursday
INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 13,'Breakfast Burrito','Thursday','Breakfast');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 25,'Pizza','Thursday','Lunch');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 57,'Torta','Thursday','Dinner');

--friday
INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 13,'Oatmeal','Friday','Breakfast');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 25,'Salmon with Rice','Friday','Lunch');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 57,'Tacos','Friday','Dinner');

--saturday
INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 13,'Oatmeal','Saturday','Breakfast');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 25,'Cesar Salad','Saturday','Lunch');

INSERT INTO saved_recipes (user_id, recipe_id,recipe_name,meal_day,meal_type)
VALUES (1, 57,'Chicken Alfredo','Saturday','Dinner');
