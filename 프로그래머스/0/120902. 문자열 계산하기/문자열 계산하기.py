def solution(my_string):
    answer = 0
    my_list = list(my_string.replace(" ", ""))
    tmp = 0
    tmp_type=1
    for s in my_list:
        if s=="+":
            if tmp_type==1:
                answer,tmp,tmp_type =answer+tmp,0,1  
            elif tmp_type==0:
                answer,tmp,tmp_type =answer-tmp,0,1
        elif s=="-":
            if tmp_type==1:
                answer,tmp,tmp_type =answer+tmp,0,0 
            elif tmp_type==0:
                answer,tmp,tmp_type =answer-tmp,0,0
        else:
            tmp=tmp*10+int(s)
    if tmp_type==1:
        answer =answer+tmp 
    elif tmp_type==0:
        answer =answer-tmp
    return answer