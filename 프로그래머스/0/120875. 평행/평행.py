def solution(dots):
    #1-2 / 3 - 4
    ex_list =[(기울기(dots[0],dots[1]) == 기울기(dots[2],dots[3])),#예제1
        기울기(dots[0],dots[2]) == 기울기(dots[1],dots[3]),#예제2
        기울기(dots[0],dots[3]) == 기울기(dots[1],dots[2])]#예제3
    for ex in ex_list:
        if ex == True:     
            return 1 
    return 0
#기울기
def 기울기(dot1,dot2):
    return (dot2[1]-dot1[1])/(dot2[0]-dot1[0])