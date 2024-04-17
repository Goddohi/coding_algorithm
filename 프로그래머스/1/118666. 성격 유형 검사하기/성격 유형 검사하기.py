def solution(survey, choices):
    counts = [0, 0, 0, 0, 0, 0, 0, 0]
    for i in range(len(survey)):
        category = survey[i][0]
        if category == 'R':
            if choices[i] < 4:
                counts[0] += 4 - choices[i]
            else:
                counts[1] += choices[i] - 4
        elif category == 'T':
            if choices[i] < 4:
                counts[1] += 4 - choices[i]
            else:
                counts[0] += choices[i] - 4
        elif category == 'C':
            if choices[i] < 4:
                counts[2] += 4 - choices[i]
            else:
                counts[3] += choices[i] - 4
        elif category == 'F':
            if choices[i] < 4:
                counts[3] += 4 - choices[i]
            else:
                counts[2] += choices[i] - 4
        elif category == 'J':
            if choices[i] < 4:
                counts[4] += 4 - choices[i]
            else:
                counts[5] += choices[i] - 4
        elif category == 'M':
            if choices[i] < 4:
                counts[5] += 4 - choices[i]
            else:
                counts[4] += choices[i] - 4
        elif category == 'A':
            if choices[i] < 4:
                counts[6] += 4 - choices[i]
            else:
                counts[7] += choices[i] - 4
        elif category == 'N':
            if choices[i] < 4:
                counts[7] += 4 - choices[i]
            else:
                counts[6] += choices[i] - 4

    answer = ''.join([
        'R' if counts[0] >= counts[1] else 'T',
        'C' if counts[2] >= counts[3] else 'F',
        'J' if counts[4] >= counts[5] else 'M',
        'A' if counts[6] >= counts[7] else 'N'
    ])
    return answer