-- Problem name: Binary Tree Nodes
-- Difficulty: Medium
-- Problem link: https://www.hackerrank.com/challenges/binary-search-tree-1/problem

-- First solution:
select N,
       case
           when P is null then "Root"
           when N not in (select P from BST where P is not null) then "Leaf"
           else "Inner"
           end
from BST
order by N;

-- Second solution:
select N,
       case
           when P is null then "Root"
           when N in (select P from BST) then "Inner"
           else "Leaf"
           end
from BST
order by N;