import math
def solution(a, b):
    sub = b//math.gcd(a, b)
    while sub%2==0:
        sub=sub//2
    while sub%5==0:
        sub=sub//5
    return 2-(sub==1) 
