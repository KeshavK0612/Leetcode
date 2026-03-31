# Write your MySQL query statement below
select Department,Employee,Salary
From ( 
select d.name as Department
,e.name as  Employee, dense_rank() over(partition by d.name order by e.salary desc ) as rnk, e.salary as Salary
from Department d join Employee e on d.id= e.departmentId
) as t
where rnk <=3