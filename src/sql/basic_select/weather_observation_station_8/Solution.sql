-- Problem name: Weather Observation Station 8
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/weather-observation-station-8/problem

select distinct(City) from Station
where City regexp '^[aeiou].*[aeiou]$';