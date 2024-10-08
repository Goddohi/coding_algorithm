--oracle
WITH Possible_CAR_TYPE AS (
    SELECT DISTINCT c.CAR_ID
                  , c.CAR_TYPE
                  , c.DAILY_FEE
                  , d.DISCOUNT_RATE
      FROM CAR_RENTAL_COMPANY_CAR c
         , CAR_RENTAL_COMPANY_DISCOUNT_PLAN d
         , (SELECT CAR_ID
                    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                   WHERE START_DATE <= TO_DATE('2022-11-30', 'YYYY-MM-DD')
                     AND END_DATE >= TO_DATE('2022-11-01', 'YYYY-MM-DD')
                    ) h

     WHERE c.CAR_TYPE IN ('세단', 'SUV')
       AND c.CAR_TYPE = d.CAR_TYPE
       AND c.CAR_ID = h.CAR_ID(+)
       AND h.CAR_ID IS NULL
       AND d.DURATION_TYPE = '30일 이상'
)

SELECT    CAR_ID 
        , CAR_TYPE
        , TRUNC((DAILY_FEE * (1 - DISCOUNT_RATE / 100)) * 30) AS FEE
FROM Possible_CAR_TYPE
WHERE (DAILY_FEE * (1 - DISCOUNT_RATE / 100)) * 30 BETWEEN 500000 AND 2000000
ORDER BY   FEE DESC
         , CAR_TYPE ASC 
         , CAR_ID DESC;
