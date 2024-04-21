def solution(my_string, n):
    answer = []
    for i in my_string:
        for j in range(0,n):
            answer.append(i)
    return ''.join(answer)