class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        count = k
        j = 0
        cur = 1
        while count > 0:
            if j < len(arr) and arr[j] == cur:
                j += 1
            else:
                count -= 1

            cur += 1

        return cur - 1