def solution(num_list):
    a = len(num_list)-1
    answer = []
    for i in range(0,a+1): 
        answer.append(num_list[a-i])
    #return answer
    num_list.reverse()
    return num_list