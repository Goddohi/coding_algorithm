-- 코드를 입력하세요
SELECT BOOK_ID, TO_CHAR(PUBLISHED_DATE,'YYYY-MM-DD') PUBLISHED_DATE
FROM BOOK
WHERE TO_CHAR(PUBLISHED_DATE,'YYYY') = '2021' AND category IN('인문')
ORDER BY PUBLISHED_DATE ASC; 