#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int price) {
    int answer = 0;

return  price>=100000 ?  (price>=300000 ?  (price>=500000 ? price*4/5 : price*9/10) : price*95/100) :  price;

}