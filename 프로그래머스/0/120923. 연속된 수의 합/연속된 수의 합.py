def solution(num, total):
    answer = []
    mid = num//2
    center = total//num
            
    if num % 2 == 0:
        for i in range(-(mid-1), mid+1):
            answer.append(center + i)
    else:
        for i in range(-mid, mid+1):
            answer.append(center + i)
    return answer