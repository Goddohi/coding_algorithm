def solution(n):
    piza=0
    for i in range(1,100):       
        piza=i*6
        if(piza%n == 0):
            piza=i
            break
    return piza