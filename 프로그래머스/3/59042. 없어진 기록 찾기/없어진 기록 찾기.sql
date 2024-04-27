-- 코드를 입력하세요
SELECT B.animal_id, B.name
from ANIMAL_InS A
full outer join ANIMAL_outS B on A.animal_id = B.animal_id
where A.animal_id is null
order by B.animal_id;