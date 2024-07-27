SELECT    category
        , SUM(total) as total_sales
  FROM    book b 
        , (SELECT   book_id
                  , SUM(sales) as total
            FROM    book_sales
           WHERE    TO_CHAR(sales_date,'YYYYMM')  = '202201'
           GROUP BY book_id) c
             
WHERE     b.book_id = c.book_id
GROUP BY  category
ORDER BY  category;