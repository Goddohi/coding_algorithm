def solution(s):
    answer = 0
    i=-1
    array = s.split(' ')
    for ch in array:
        if ch=='Z':
            answer-=int(array[i])
        else:
            answer += int(ch)
        i+=1
    return answer