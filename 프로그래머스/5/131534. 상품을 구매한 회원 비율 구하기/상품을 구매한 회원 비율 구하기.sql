SELECT       TO_CHAR(o.SALES_DATE,'YYYY') AS year 
           , TO_NUMBER(TO_CHAR(o.SALES_DATE,'MM')) AS month 
           , COUNT(DISTINCT o.user_id) as puchased_users
           , ROUND(COUNT(DISTINCT o.user_id)/(SELECT count(user_id)
                                                FROM user_info 
                                               WHERE TO_CHAR(joined,'YYYY')  = '2021'),1) as puchased_ratio
    
  FROM       ONLINE_SALE o , (SELECT user_id 
                                FROM user_info 
                               WHERE TO_CHAR(joined,'YYYY')  = '2021') u
 
 WHERE    u.user_id = o.user_id
 GROUP BY TO_CHAR(o.SALES_DATE,'YYYY'), TO_NUMBER(TO_CHAR(o.SALES_DATE,'MM')) 
 ORDER BY year, month
;