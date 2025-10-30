-- Problem name: Higher Than 75 Marks
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/more-than-75-marks/problem

select Name from Students where Marks > 75 order by right(Name, 3), ID;