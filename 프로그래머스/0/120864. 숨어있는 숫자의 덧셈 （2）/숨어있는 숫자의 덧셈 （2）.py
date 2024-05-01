def solution(my_string):
    for i in my_string:
        if i not in "1234567890":
            my_string = my_string.replace(i, ' ')
    my_string = my_string.split()
    
    return sum(list(map(int, my_string)))