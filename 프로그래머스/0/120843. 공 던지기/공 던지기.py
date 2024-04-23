def solution(numbers, k):
    j,i=0,1
    le = len(numbers);
    while (i !=k):
        i +=1
        j +=2
        if(j>=le):
            j=j-le
            
    return numbers[j];