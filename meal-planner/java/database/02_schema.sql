DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;
DROP SEQUENCE IF EXISTS seq_saved_recipe_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

  CREATE SEQUENCE seq_saved_recipe_id
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE ingredients (
	ingredient_id int NOT NULL,
	ingredient_name varchar(50) NOT NULL,
	CONSTRAINT PK_ingredient PRIMARY KEY (ingredient_id)
	);

CREATE TABLE user_ingredients (
	user_id int NOT NULL,
	ingredient_name varchar(50) NOT NULL,
	PRIMARY KEY (
		user_id,
		ingredient_name
	)
);

CREATE TABLE saved_recipes (
saved_recipe_id int DEFAULT nextval('seq_saved_recipe_id'::regclass) NOT NULL,
	user_id int NOT NULL,
	recipe_id int NOT NULL,
	recipe_name varchar(150) NOT NULL,
	meal_day varchar(50),
	meal_type varchar(50),
	PRIMARY KEY (
		saved_recipe_id
	)
);

CREATE TABLE user_profile(
    user_id int NOT NULL,
    profile_pic_id int,
    name varchar(100)
)
	

-- Add seed data in the 03_data.sql script file

-- Add Foreign key constraints in the 04_constraints.sql script file
