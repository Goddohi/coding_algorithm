
def solution(array, n):
    array.sort()
    answer = array[0]
    a = abs(array[0] - n)
    for i in array:
        b = abs(i - n)
        if b < a:
            answer = i
            a = b
    return answer
def solution2(array, n):
    array.sort()
    answer = [(n-i)**2 for i in array]
    a=min(answer)
    for i in range(len(answer)):
        if a==answer[i]:
            return array[i]
    return array[len(answer)-1]