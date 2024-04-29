def solution(k, m, score):
    temp=[]
    tempN=0
    tempC=0
    answer=0
    pack_Max=len(score)//m
    for n in range(1,k+1):
        temp.append(score.count(n))
        

    print()
    for n in range(0,k):

        if(tempN!=0):
            if((temp[k-(n+1)]+tempN)//m>0):
                answer+= ((temp[k-(n+1)]+tempN)//m)*(k-n)*m
                tempN=(temp[k-(n+1)]+tempN)%m
            else:
                tempN+=temp[k-(n+1)]
        elif(temp[k-(n+1)]//m>0):
            answer+=(temp[k-(n+1)]//m)*(k-n)*m
            tempN=temp[k-(n+1)]%m
        else:
            tempN+=temp[k-(n+1)]

        
    return answer