-- 코드를 입력하세요
SELECT A.book_id, B.Author_name, to_char(A.published_date,'YYYY-MM-DD')
From book A
inner join Author B on A.AUTHOR_ID = B.AUTHOR_ID
where category in('경제')
order by A.published_date
;