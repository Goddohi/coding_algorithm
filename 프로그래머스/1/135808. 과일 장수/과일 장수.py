def solution(k, m, score):
    #몇개의 갯수가 각자 있는지 가지는 임시 저장소
    temp=[]
    
    #포장못한 남은 사과 갯수(임시 저장공간)
    tempN=0
    
    answer=0
    
    #갯수 카운터 함수
    for n in range(1,k+1):
        temp.append(score.count(n))
        
    #-n+1 = 역순출력  (k-n)해당 순서의 상품 포장 가치 
    for n in range(0,k):
        if((temp[-(n+1)]+tempN)//m>0):
            answer+= ((temp[-(n+1)]+tempN)//m)*(k-n)*m
            tempN=(temp[-(n+1)]+tempN)%m
        else:
            tempN+=temp[-(n+1)]

        
    return answer
