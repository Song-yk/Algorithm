-- 코드를 입력하세요
SELECT A.animal_id, a.name
from animal_ins A
inner join animal_outs B on A.animal_id = B.animal_id
where A.datetime > b.datetime
order by A.DATETIME;