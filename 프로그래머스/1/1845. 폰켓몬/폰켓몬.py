def solution(nums):
    num=len(nums)/2
    setnum=len(set(nums))
    if(setnum>=num):
        answer = num
    else:
        answer=setnum
    return answer