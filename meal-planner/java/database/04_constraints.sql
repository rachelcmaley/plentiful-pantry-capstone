-- add database constraints here - such as foreign key constraints
-- very common to add constraints AFTER bulk loading data

ALTER TABLE pantry_ingredients
ADD CONSTRAINT FK_pantry_ingredients_pantry
FOREIGN KEY (pantry_id)
REFERENCES pantry(pantry_id);

ALTER TABLE pantry_ingredients
ADD CONSTRAINT FK_pantry_ingredients_ingredients
FOREIGN KEY (ingredient_id)
REFERENCES ingredients(ingredient_id);