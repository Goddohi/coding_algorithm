def solution(nums):
    answer = 0
    setting=[]
    for i in range(0,len(nums)-2):
        for j in range(i+1,len(nums)-1):         
            for k in range(j+1,len(nums)):
                setting.append(nums[i]+nums[j]+nums[k])
                
        
    #최소 6부터시작
    for i in setting:
        answer +=1
        for j in range(2,int(i**(1/2)+2)):
            if i%j==0:
                answer-=1
                break
    return answer