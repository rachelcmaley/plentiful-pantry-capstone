-- The following line terminates any active connections to the database so that it can be dropped
SELECT pg_terminate_backend(pid) 
FROM pg_stat_activity 
WHERE datname = 'meal_planner';

DROP DATABASE IF EXISTS meal_planner;

DROP USER IF EXISTS meal_planner_owner;
DROP USER IF EXISTS meal_planner_appuser;

-- then create the database
CREATE DATABASE meal_planner;
