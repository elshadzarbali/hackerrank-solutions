-- Problem name: Weather Observation Station 11
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/weather-observation-station-11/problem

select distinct(City) from Station
where City regexp '^[^aeiou].*$'
   or City regexp '^.*[^aeiou]$';