class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        cnt = 0
        maxCnt = 0
        
        if nums[0] == 1:
            cnt = 1
        
        for i in range(1, len(nums)):
            if nums[i] == 1:
                cnt += 1
            else:
                maxCnt = max(cnt, maxCnt)
                cnt = 0
        
        maxCnt = max(cnt, maxCnt)
        return maxCnt
