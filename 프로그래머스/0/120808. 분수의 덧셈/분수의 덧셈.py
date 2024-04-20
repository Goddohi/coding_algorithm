def solution(d1, n1, d2, n2):
    answer = []
    # 배수확인
    if max(n1,n2) % min(n1,n2) == 0:
        a = max(n1,n2)//min(n1,n2)
        if n1 <= n2:
            answer = [d1 * a + d2, n2]
        else:
            answer = [d2 * a + d1, n1]
    # 배수가 아닐 때
    else:
        answer = [d2*n1+d1*n2, n1*n2]
    # 약분가능성 반복으로 인해서 확인하기
    kt = 2
    while min(answer[0],answer[1]) >= kt:
        if answer[0] % kt == 0 and answer[1] % kt ==0:
            answer[0] = answer[0] // kt
            answer[1] = answer[1] // kt
        else:
            kt+=1
    return answer