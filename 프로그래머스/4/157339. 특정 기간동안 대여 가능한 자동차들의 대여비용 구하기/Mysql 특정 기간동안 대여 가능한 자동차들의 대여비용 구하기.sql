/*mysql*/
WITH Possible_CAR_TYPE AS (
    SELECT DISTINCT c.CAR_ID
                  , c.CAR_TYPE
                  , c.DAILY_FEE
                  , d.DISCOUNT_RATE
      FROM CAR_RENTAL_COMPANY_CAR c
      JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN d
        ON c.CAR_TYPE = d.CAR_TYPE
      LEFT JOIN (SELECT CAR_ID
                    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                   WHERE START_DATE <= STR_TO_DATE('2022-11-30', '%Y-%m-%d')
                     AND END_DATE >= STR_TO_DATE('2022-11-01', '%Y-%m-%d')
                    ) h
        ON c.CAR_ID = h.CAR_ID
     WHERE c.CAR_TYPE IN ('세단', 'SUV')
       AND h.CAR_ID IS NULL
       AND d.DURATION_TYPE = '30일 이상'
)
SELECT    CAR_ID 
        , CAR_TYPE
        , FLOOR((DAILY_FEE * (1 - DISCOUNT_RATE / 100)) * 30) AS FEE
FROM Possible_CAR_TYPE
WHERE (DAILY_FEE * (1 - DISCOUNT_RATE / 100)) * 30 BETWEEN 500000 AND 2000000
ORDER BY   FEE DESC
         , CAR_TYPE ASC 
         , CAR_ID DESC;
