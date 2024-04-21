def solution(array):
    c=0
    array.sort()
    for i in array:
        c=c+1
    d=int(c/2)
    answer= array[d]
    
    return answer