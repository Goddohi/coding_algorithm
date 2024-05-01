def solution(numbers):
    numbers.sort()
    answer = (numbers[-2]*numbers[-1] 
              if numbers[0]*numbers[1]<=numbers[-2]*numbers[-1] 
              else numbers[0]*numbers[1])
    return answer