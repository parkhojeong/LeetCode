class Solution:
    def checkWin(self, arr: List[List[int]], mark: str) -> bool:
        # row
        for row in arr:
            cnt = 0
            for cell in row:
                if cell == mark:
                    cnt += 1
            if cnt == 3:
                return True

        for y in range(3):
            cnt = 0
            for x in range(3):
                if arr[x][y] == mark:
                    cnt += 1
            if cnt == 3:
                return True

        if arr[0][0] == arr[1][1] and arr[1][1] == arr[2][2] and arr[0][0] == mark:
            return True
        if arr[0][2] == arr[1][1] and arr[1][1] == arr[2][0] and arr[0][2] == mark:
            return True

        return False

    def tictactoe(self, moves: List[List[int]]) -> str:
        arr = [['' for x in range(3)] for x in range(3)]
        # print(arr)
        for i in range(len(moves)):
            move = moves[i]
            player = 'A' if i % 2 == 0 else 'B'
            mark = 'X' if player == 'A' else 'O'
            arr[move[0]][move[1]] = mark

            isEnd = self.checkWin(arr, mark)
            if isEnd:
                return player

        if len(moves) < 9:
            return "Pending"

        return "Draw"