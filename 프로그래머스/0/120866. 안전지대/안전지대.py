def solution(board):
    dxy=[[-1,0],[1,0],[0,-1],[0,1],[-1,-1],[1,1],[-1,1],[1,-1]]#좌우위아래 대각선
    boom = []
    for i in range(len(board)):
        for j in range(len(board)):
            if board[i][j] == 1:
                boom.append((i,j))
                
    for x, y in boom:
        for i in range(8):
            pointx = x + dxy[i][0]
            pointy = y + dxy[i][1]
            if 0 <= pointx < len(board) and 0 <= pointy < len(board):
                board[pointx][pointy] = 1

    count = 0
    for x in range(len(board)):
       count+= board[x].count(0)

    return count