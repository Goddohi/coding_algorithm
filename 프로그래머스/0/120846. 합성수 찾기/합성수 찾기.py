def solution(n):
    answer = 0
    for i in range(n + 1):# range(4,n+1) 도 좋다 합성수는 4부터니까 
        #int(i ** 0.5) + 1 -> 약수의 중간 까지 카운트  +1 의경우 예외처리
        for j in range(2, int(i ** 0.5) + 1):
            if i % j == 0:
                answer += 1
                break
    return answer