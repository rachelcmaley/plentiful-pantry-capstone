DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;

CREATE SEQUENCE seq_user_id
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
	ingredient_name varchar(50) NOT NULL,
	ingredient_id int NOT NULL,
	CONSTRAINT PK_ingredient PRIMARY KEY (ingredient_id)
);

CREATE TABLE pantry (
	pantry_id int NOT NULL PRIMARY KEY,
	user_id int NOT NULL
);

CREATE TABLE pantry_ingredients (
	pantry_id int NOT NULL,
	ingredient_id int NOT NULL,
	amount numeric(10,2),
	PRIMARY KEY (
		pantry_id,
		ingredient_id
	)
);

-- Add seed data in the 03_data.sql script file

-- Add Foreign key constraints in the 04_constraints.sql script file
