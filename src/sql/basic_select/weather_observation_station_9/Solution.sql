-- Problem name: Weather Observation Station 9
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/weather-observation-station-9/problem

-- Approach 1:
select distinct(City) from Station
where City not regexp '^[aeiou].*$';

-- Approach 2:
select distinct(City) from Station
where City regexp '^[^aeiou].*$';