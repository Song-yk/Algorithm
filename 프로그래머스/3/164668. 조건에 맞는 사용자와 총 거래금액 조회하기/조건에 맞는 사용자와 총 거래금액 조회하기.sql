-- 코드를 입력하세요
SELECT B.user_id, B.nickname, A.TOTAL_SALES
from(
        SELECT WRITER_ID, sum(price) as total_sales
        from USED_GOODS_BOARD
        where STATUS = 'DONE'
        group by WRITER_ID having sum(price) >=700000 ) A 
        inner join USED_GOODS_USER B on A.writer_id = B.user_id
order by total_sales;