def solution(sides):
    temp = sides[0]+sides[1]
    maxtemp = max(sides)
    mintemp = min(sides)
    answer = 0
    # sides 안에 큰경우가 없을 경우 혹은 제일 큰길이가 이등변 삼각형일경우 
    for i in range(maxtemp,temp):
        if i+mintemp >maxtemp:
            answer += 1
    # max 값이 제일 큰경우
    for i in range(1,maxtemp):
        if i+ mintemp > maxtemp:
            answer += 1
   
# 위의 코드를 하나로 합칠경우      
    answer2=0
    for i in range(1,temp):
        if i >=maxtemp:
            if i+mintemp >maxtemp:
                answer2 += 1
        else:
            if i+ mintemp > maxtemp:
                answer2 += 1
    return answer2