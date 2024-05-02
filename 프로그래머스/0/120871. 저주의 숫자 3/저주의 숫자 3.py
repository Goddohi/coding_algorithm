def solution(n):
    count = 1
    result = 1 
   # 해당 방식은 count를 이용해서 원형의 데이터와 동일 할때 반복문을 종료한다. 
    # count는 3의 배수와 3이 들어가는 경우를 모두 제외한 경우를 체크한다.
    # 무한루프를 사용하면 안 좋지만 사용해봤다.
    while True:
        if (result % 3 == 0 or '3' in str(result))and count >= n:
            result += 1
        elif result % 3 == 0 or '3' in str(result):
            result += 1
        elif count >= n:
            break 
        else:
            count += 1
            result += 1   
    return result