class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        if k == 1:
            return 0

        nums = sorted(nums)
        minVal = sys.maxsize
        for i in range(k - 1, len(nums)):
            minVal = min(minVal, nums[i] - nums[i - (k - 1)])

        return minVal
