-- Problem name: Weather Observation Station 5
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/weather-observation-station-5/problem

select city, length(city) from station order by length(city) asc, city asc limit 1;
select city, length(city) from station order by length(city) desc, city asc limit 1;