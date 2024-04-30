def solution(number, limit, power):
    answer = 0
    for semiNumber in range(1, number+1):
        settemp=set()
        for i in range(1,int((semiNumber**(1/2)+1))):
            if(semiNumber%i==0):
                settemp.add(i)
                settemp.add(semiNumber//i)
            if(len(settemp)>limit):
                break
        if(limit<len(settemp)):
            answer+=power
        else:
            answer+=len(settemp)
    return answer
