def solution(names):
    answer = []
    n=len(names)-1
    print(n)
    for i in range(0,(n//5)+1):
        answer.append(names[i*5])
    return answer