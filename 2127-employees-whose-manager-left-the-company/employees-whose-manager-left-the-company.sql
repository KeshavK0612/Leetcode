SELECT e1.employee_id
FROM Employees e1
LEFT JOIN Employees e2 ON e2.employee_id = e1.manager_id
WHERE e1.salary < 30000
  AND e2.employee_id IS NULL and e1.manager_id is not null
ORDER BY e1.employee_id;
