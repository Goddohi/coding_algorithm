def solution(keyinput, board):
    point = [0, 0]
    for i in keyinput:
        if i == "left" and point[0]-1 >= -(board[0] // 2):
            point[0] -= 1
        elif i == "right" and point[0]+1 <= (board[0] // 2):
            point[0] += 1
        elif i == "up" and point[1]+1 <= (board[1] // 2):
            point[1] += 1
        elif i == "down" and point[1]-1 >= -(board[1] // 2):
            point[1] -= 1
    return point