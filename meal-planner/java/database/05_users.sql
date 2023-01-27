-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER meal_planner_owner
WITH PASSWORD 'meal_planner_pass';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO meal_planner_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO meal_planner_owner;

CREATE USER meal_planner_appuser
WITH PASSWORD 'meal_planner_pass';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO meal_planner_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO meal_planner_appuser;
