-- 코드를 입력하세요
SELECT MEMBER_ID,MEMBER_NAME,GENDER, to_char(DATE_OF_BIRTH,'YYYY-MM-DD') as DATE_OF_BIRTH
from member_profile
where to_char(date_of_birth,'MM') = '03' and gender = 'W'
and tlno is not null
order by member_id;