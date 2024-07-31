SELECT r.contest_id, ROUND(COUNT(DISTINCT r.user_id) / COUNT(DISTINCT u.user_id) * 100, 2) AS percentage
FROM Users u
JOIN Register r 
GROUP BY 1
ORDER BY 2 DESC, 1 ASC;