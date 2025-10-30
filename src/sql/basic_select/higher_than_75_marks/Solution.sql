-- Problem name: Weather Observation Station 12
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/weather-observation-station-12/problem

select distinct(City) from Station
where City regexp '^[^aeiou].*[^aeiou]$';