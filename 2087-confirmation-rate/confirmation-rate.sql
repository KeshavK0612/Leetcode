# Write your MySQL query statement below
select s.user_id,ROUND(
        1.0 * COUNT(CASE WHEN action = 'confirmed' THEN 1 END) 
        / COUNT(*)
    , 2) AS confirmation_rate
    from Signups s
    left join Confirmations c on s.user_id = c.user_id
    group by user_id