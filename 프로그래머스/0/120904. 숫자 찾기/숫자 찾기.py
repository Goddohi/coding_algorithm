def solution(num, k):
    tmp=str(num).find(str(k))+1
    return tmp if tmp != 0 else -1