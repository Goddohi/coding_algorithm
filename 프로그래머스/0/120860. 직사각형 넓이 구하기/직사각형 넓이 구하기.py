def solution(dots):
    answer = 0
    if dots[0][0]!=dots[1][0]:
        x=dots[0][0]-dots[1][0]
    else:
        x=dots[1][0]-dots[2][0]
    if dots[0][1]!=dots[1][1]:
        y=dots[0][1]-dots[1][1]
    else:
        y=dots[0][1]-dots[2][1]
    return abs(x*y)