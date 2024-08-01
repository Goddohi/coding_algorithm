SELECT p.PRODUCT_ID, PRODUCT_NAME,SUM(PRICE*AMOUNT) as TOTAL_SALES
  FROM FOOD_PRODUCT p , FOOD_ORDER o
 WHERE TO_CHAR(PRODUCE_DATE,'YYYYMM') = '202205'
   AND  p.PRODUCT_ID = o.PRODUCT_ID
 GROUP BY  p.PRODUCT_ID,PRODUCT_NAME
 ORDER BY  TOTAL_SALES DESC
         , PRODUCT_ID  ASC;