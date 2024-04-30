    
                           
                           
def solution(number, limit, power):
    #number가 1일경우는 연산제외 limit가 2이상이라 연산없이 계산가능
    answer = 1
    setting=[]
    #number가 1일경우는 연산제외
    if(number>1):
        for semiNumber in range(2, number+1):
            settemp=set({1,semiNumber}) 
            for i in range(1,int((semiNumber**(1/2)+1))):
                if(semiNumber==i**2):
                    settemp.add(i)
                    break
                elif(semiNumber%i==0):
                    settemp.add(i)
                    settemp.add(semiNumber//i)
                if( len(settemp)>limit):
                    break
            if(limit<len(settemp)):
                answer+=power
            else:
                answer+=len(settemp)
    return answer
