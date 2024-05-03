def solution(chicken):
    answer=0
    while chicken >= 10:
        cou =chicken//10#쿠폰으로 시킨 치킨
        mod = chicken % 10#쿠폰안된 치킨수
        answer+=cou
        chicken =cou+mod       
    return answer
