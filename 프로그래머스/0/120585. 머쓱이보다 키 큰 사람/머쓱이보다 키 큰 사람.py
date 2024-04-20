def solution(array, height):
    c=0
    for i in array:
        if(i>height):
            c+=1
    return c