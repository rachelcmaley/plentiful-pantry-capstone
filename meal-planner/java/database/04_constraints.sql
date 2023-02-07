-- add database constraints here - such as foreign key constraints
-- very common to add constraints AFTER bulk loading data

ALTER TABLE user_ingredients
ADD CONSTRAINT FK_user_ingredients_users
FOREIGN KEY (pantry_id)
REFERENCES pantry(pantry_id);

ALTER TABLE saved_recipes
ADD CONSTRAINT FK_save_recipes_users
FOREIGN KEY (user_id)
REFERENCES users(user_id);