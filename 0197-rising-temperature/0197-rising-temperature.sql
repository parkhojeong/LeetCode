# Write your MySQL query statement below
select w1.id
from Weather w1
join Weather w2 on SUBDATE(w1.recordDate, 1) = w2.recordDate
where w1.temperature > w2.temperature
-- where temperature > (
--     select temperature
--     from Weather w2
--     where w2.recordDate = SUBDATE(w1.recordDate, 1)
-- )