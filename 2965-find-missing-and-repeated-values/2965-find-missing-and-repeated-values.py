class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        numSet = {x + 1 for x in range(n * n)}
        twice = -1
        for x in range(n):
            for y in range(n):
                val = grid[x][y]
                if val not in numSet:
                    twice = val
                if val in numSet:
                    numSet.remove(val)

        return [twice, numSet.pop()]
