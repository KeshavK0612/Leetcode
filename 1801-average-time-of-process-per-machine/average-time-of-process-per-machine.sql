# Write your MySQL query statement below
with starts as (
    select machine_id, process_id, timestamp as start_time
    from Activity
    where activity_type = 'start'
),
ends as (
    select machine_id, process_id, timestamp as end_time
    from Activity
    where activity_type = 'end'
)
select s.machine_id, round(avg(end_time-start_time),3) as processing_time
from starts s
join ends e on s.machine_id = e.machine_id
and s.process_id = e.process_id
group by s.machine_id