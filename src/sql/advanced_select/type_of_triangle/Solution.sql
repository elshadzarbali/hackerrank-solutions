-- Problem name: Type of Triangle
-- Difficulty: Easy
-- Problem link: https://www.hackerrank.com/challenges/what-type-of-triangle/problem

select case
           when A + B <= C or A + C <= B or B + C <= A then "Not A Triangle"
           when A = C and A = B then "Equilateral"
           when A = B or A = C or B = C then "Isosceles"
           else "Scalene"
           end
from Triangles;