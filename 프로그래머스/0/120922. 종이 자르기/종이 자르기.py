def solution(M, N):
    if M ==1:
        m=0
    else:
        m=M-1
    if N ==1:
        n=0
    else:
        n=(N-1)*(M)
    return n+m