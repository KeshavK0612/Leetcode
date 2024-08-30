# Write your MySQL query statement below
select x,y,z,
 case when  x+y>z AND x+z>y AND z+y>x THEN 'Yes'
 Else 'No'
 END as triangle
 from Triangle