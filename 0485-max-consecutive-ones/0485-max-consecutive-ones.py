class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        arr = []
        for i in range(len(nums)):
            if nums[i] == 1:
                arr.append(i)

        if len(arr) == 0:
            return 0

        cnt = 1
        maxCnt = 0
        for i in range(1, len(arr)):
            if arr[i] - arr[i - 1] == 1:
                cnt += 1
            else:
                maxCnt = max(maxCnt, cnt)
                cnt = 1

        maxCnt = maxCnt = max(maxCnt, cnt)

        return maxCnt
