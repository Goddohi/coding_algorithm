def solution(bin1, bin2):
    bin1,bin2=int(bin1,2),int(bin2,2)
    bin3=bin(bin1+bin2)
    return bin3.replace("0b","")
#int(a,b)
# a를 b진수 -> 10진수
#oct()함수
#10진수 ➡️ 8진수 문자열
#hex()함수
#10진수 ➡️ 16진수 문자열
#bin()함수
#10진수 ➡️ 2진수 문자열