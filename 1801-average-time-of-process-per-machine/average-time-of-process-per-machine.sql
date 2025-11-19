# Write your MySQL query statement below
WITH ordered AS (
    SELECT
        machine_id,
        process_id,
        activity_type,
        timestamp,
        LEAD(timestamp) OVER (
            PARTITION BY machine_id, process_id 
            ORDER BY timestamp
        ) AS next_ts
    FROM Activity
)
SELECT 
    machine_id,
    ROUND(AVG(next_ts - timestamp), 3) AS processing_time
FROM ordered
WHERE activity_type = 'start'
GROUP BY machine_id;
