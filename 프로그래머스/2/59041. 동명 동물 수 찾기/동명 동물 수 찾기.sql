-- 코드를 입력하세요
SELECT name, count(*)
from ANIMAL_INS
where name is not null
group by name
having count(*) > 1
order by name;