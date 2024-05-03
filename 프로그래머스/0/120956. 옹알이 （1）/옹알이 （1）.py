def solution(babbling):
    ba = ['aya', 'ye', 'woo', 'ma']
    answer = 0
    for bab in babbling:
        for word in ba:
            bab = bab.replace(word, '~')
        bab = bab.replace('~',"")
        if len(bab)==0:
            answer+=1
    return answer