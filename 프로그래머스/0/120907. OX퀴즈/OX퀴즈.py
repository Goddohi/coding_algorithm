def solution(quiz):
    answer = []
    for q in quiz:
        qus, answerOX = q.split('=')
        qus = qus.split()
        if qus[1] == '+':
            if int(qus[0]) + int(qus[2]) == int(answerOX):
                answer.append('O')
            else:
                answer.append('X')
        elif qus[1] == '-':
            if int(qus[0]) - int(qus[2]) == int(answerOX):
                answer.append('O')
            else:
                answer.append('X')
    return answer
    