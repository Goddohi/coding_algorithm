
def solution(polynomial):
    answer = 0
    my_list = list(polynomial.replace(" ", ""))
    tmp = 0
    tmp_n=0
    tmp_x=0
    for s in my_list:
        if s=="x":
            if tmp==0:
                tmp_x,tmp =tmp_x+1,0
            else:
                tmp_x,tmp =tmp_x+tmp,0
        elif s=="+":   
            if tmp!=0:
                tmp_n,tmp=tmp+tmp_n,0                
        else:
            tmp=tmp*10+int(s)
    if tmp!=0:
        tmp_n,tmp=tmp+tmp_n,0 
    if tmp_x ==1 and tmp_n ==0:
        return "x"
    elif tmp_n ==0:
        return f"{tmp_x}x"
    elif tmp_x ==1:
        return f"x + {tmp_n}"
    elif tmp_x ==0:
        return f"{tmp_n}"
    return f"{tmp_x}x + {tmp_n}"