-- oracle
SELECT    i.ANIMAL_ID   as ANIMAL_ID 
        , i.NAME        as NAME 
  FROM    ANIMAL_INS i 
        , ANIMAL_OUTS o
 
 WHERE i.ANIMAL_ID = o.ANIMAL_ID
   AND i.DATETIME  > o.DATETIME
 
 ORDER BY i.DATETIME ASC
