def solution(numbers):
    c=0;
    hap=0;
    for i in numbers:
        hap= hap+i
        c=c+1
    return hap/len(numbers)