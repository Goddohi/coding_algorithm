def solution(my_string, overwrite_string, s):
    answer = ''
    len_my=len(my_string)
    len_over=len(overwrite_string)
    #if s!=0:
    answer += my_string[0:s]
    answer+=overwrite_string
    if len_my>len_over+s:
        answer+= my_string[len_over+s:]
    return answer