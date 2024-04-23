def solution(age):
    age = str(age)
    ag = 'abcdefghij'
    i=0
    for a in ag:
        age = age.replace(str(i), a)
        i +=1
    return age