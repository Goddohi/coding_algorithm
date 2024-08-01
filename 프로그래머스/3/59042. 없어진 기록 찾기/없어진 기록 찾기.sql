SELECT o.ANIMAL_ID , o.NAME 
 FROM ANIMAL_OUTS o LEFT outer join ANIMAL_INS i 
    on i.ANIMAL_ID = o.ANIMAL_ID 
 WHERE i.ANIMAL_ID IS NULL

 ORDER BY o.ANIMAL_ID