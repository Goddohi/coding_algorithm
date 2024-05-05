def solution(A, B):
    answer=-1
    for a in range(len(A)):
        if A==B:
            answer = a
            break          
        A = A[-1] + A[:-1]  
    return answer
#def solution(A, B): return (B * 2).find(A)