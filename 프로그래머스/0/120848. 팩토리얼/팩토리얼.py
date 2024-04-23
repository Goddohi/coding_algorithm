def solution(n):
    a=1
    for i in range(1,11):
        a=a*i
        if a==n:
            a=i
            break
        if a>n:
            a=i-1
            break
    return a