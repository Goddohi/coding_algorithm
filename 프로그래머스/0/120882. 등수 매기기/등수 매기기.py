def solution(score):
    score_avg = [(eng + math) / 2 for eng, math in score]
    sort_avg= sorted(score_avg, reverse=True)
    answer = [sort_avg.index(i)+1 for i in score_avg]
    return answer