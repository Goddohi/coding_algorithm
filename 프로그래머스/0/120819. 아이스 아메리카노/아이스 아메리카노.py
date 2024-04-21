def solution(money):
    a=money//5500
    m=money%5500
    answer = [a,m]
    return [money//5500,money%5500]


#def solution(money):
#    a=money//5500
#    m=money-a*5500
#    answer = [a,m]
#    return answer