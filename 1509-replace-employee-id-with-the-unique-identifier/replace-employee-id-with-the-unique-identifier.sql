# Write your MySQL query statement below
select e.name, eu.unique_id
from employees e
left join EmployeeUNI eu on eu.id = e.id;
