SELECT e.name
FROM Employee AS e 
JOIN Employee AS m ON e.id=m.managerId 
GROUP BY m.managerId 
HAVING COUNT(*) >= 5