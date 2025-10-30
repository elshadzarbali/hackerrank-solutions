-- Problem name: Weather Observation Station 6
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/weather-observation-station-6/problem

select distinct(City) from Station
where City like 'a%' or City like 'e%' or City like 'i%' or City like 'o%' or City like 'u%';