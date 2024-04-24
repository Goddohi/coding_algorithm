def solution(my_string):
    numbers = [int(i) for i in my_string if i in "0123456789"]
    answer=0
    for i in numbers:
        answer += i
    return answer