def solution(array):
    array.sort() #ㅇ림차순
    me1=1 #제일 큰 카운트 기억변수
    c=0 #카운트 변수
    ma=-1 #기준 값 기억변수
    testf=0
    for i in array: #배열 출력
        if(ma<i): #기준값 보다 커져서 기준값 변경
            if(testf==0 and c==0 and me1==1): #초기값 오류설정
                awe=i
            elif(c==1 and me1==1): #배열의 빈도수가 1로 도배 될경우 오류변수
                awe=-1
            if(c>me1):
                me1=c #c값 옮김
            c=1 #초기화
            ma=i #기준값 변경
            testf=1 #초기값 오류변수 헤제
        if(ma == i):
            c=c+1
            if(c>me1):
                awe=i
            elif(c==me1):
                awe=-1
    return awe