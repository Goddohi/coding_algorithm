WITH ALL_MEMBER AS (
    SELECT * FROM
        USER_INFO
    WHERE JOINED LIKE '2021%'
)

SELECT YEAR(OS.SALES_DATE) AS YEAR, 
       MONTH(OS.SALES_DATE) AS MONTH, 
       COUNT(DISTINCT OS.USER_ID) AS PURCHASED_USERS,
       ROUND(COUNT(DISTINCT OS.USER_ID) / (SELECT COUNT(*) FROM ALL_MEMBER), 1)  AS PUCHASED_RATIO
FROM 
USER_INFO UI
JOIN
    ONLINE_SALE OS
ON
    UI.USER_ID = OS.USER_ID      
WHERE JOINED LIKE '2021%'
GROUP BY 1, 2
ORDER BY 1, 2