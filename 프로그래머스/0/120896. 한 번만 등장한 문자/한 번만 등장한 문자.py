def solution(s):
    return ''.join(sorted([char for char in s if s.count(char)==1]))

def solution2(s):
    char_conut = {} #딕셔너리사용
    for char in s:
        if char in char_conut:
            char_conut[char] +=1
        else:
            char_conut[char] = 1
    solo_chars = [char for char, count in char_conut.items() if count == 1]
    #char와 count라고 딕셔너리값 불러옴 하지만 count가 1일때만 char가 리스트에 저장
    #.sort() 원본이 변형O 반환값X  sorted 원본이 변형X 반환O
    return ''.join(sorted(solo_chars))  
    