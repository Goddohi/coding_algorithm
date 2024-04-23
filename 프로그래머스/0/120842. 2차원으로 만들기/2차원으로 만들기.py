def solution(num_list, n):
    answer=[]
    arr=[]
    for i in num_list:
        arr.append(i)
        if len(arr) == n:
            answer.append(arr)
            arr=[]
    return answer;