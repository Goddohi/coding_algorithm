def solution(lines):
    dot_line=[]
    for i in lines:
        dot_line.append(set(range(min(i),max(i))))
    
    print((dot_line[0]&dot_line[1]) )
    answer= len((dot_line[0]&dot_line[1])|(dot_line[0]&dot_line[2]) |(dot_line[1]&dot_line[2]))
    return answer
#블로거가 잘했길래 참고용 
def solution2(lines):
    answer = 0
    count = [0 for _ in range(200)] # 200개의 0로이뤄진 리스트 -> 카운트용
    for line in lines:
        for i in range(line[0], line[1]): #line[1]은 포함되지않으므로 점만겹치는경우 자연스럽게포함X
            count[i + 100] += 1
    answer += count.count(2) # 두 개 이상 겹친 점
    answer += count.count(3) # 세 개 이상 겹친 점
    return answer