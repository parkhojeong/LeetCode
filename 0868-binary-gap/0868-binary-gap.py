class Solution:
    def binaryGap(self, n: int) -> int:
        arr = []
        while n > 0:
            arr.insert(0, n % 2)
            n = n // 2

        maxDiff = 0
        i = 0
        j = 0
        while i < len(arr) and j < len(arr):
            if arr[i] == 1:
                j = i + 1
                while j < len(arr):
                    if arr[j] == 1:
                        maxDiff = max(maxDiff, j - i)
                        i = j
                        break
                    j = j + 1
            else:
                i = i + 1

        return maxDiff
