def solution(before, after):
    char_count = {} # 딕셔너리 사용
    for char in before:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1
    for char in after:
        if char in char_count:
            char_count[char] -= 1
        else:
            return 0
    for char, count in char_count.items():
        if count != 0:
            return 0
    return 1


#단순하게 정렬시키면 sorted 사용시켜서 비교하면 될듯하다