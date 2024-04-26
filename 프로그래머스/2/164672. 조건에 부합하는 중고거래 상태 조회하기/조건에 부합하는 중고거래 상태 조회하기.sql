-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID,	TITLE,	PRICE,	
DECODE(STATUS, 'SALE', '판매중', 'RESERVED','예약중','DONE','거래완료') as status
from USED_GOODS_BOARD
where to_char(CREATED_DATE, 'YYYY-MM-DD') = '2022-10-05'
order by BOARD_ID desc;