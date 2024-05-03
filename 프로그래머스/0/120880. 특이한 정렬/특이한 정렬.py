def solution(numlist, n):
    awsner = sorted(numlist ,key=lambda x:(abs(x - n),-x)) 
    return awsner