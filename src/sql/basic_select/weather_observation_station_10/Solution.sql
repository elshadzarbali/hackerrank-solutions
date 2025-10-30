-- Problem name: Weather Observation Station 10
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/weather-observation-station-10/problem

select distinct(City) from Station
where City regexp '^.*[^aeiou]$';