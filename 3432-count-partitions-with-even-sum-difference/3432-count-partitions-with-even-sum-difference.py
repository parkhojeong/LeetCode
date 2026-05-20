class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        leftSum = 0
        rightSum = sum(nums)
        evenCount = 0

        for i in range(len(nums) - 1):
            leftSum += nums[i]
            rightSum -= nums[i]
            if (leftSum - rightSum) % 2 == 0:
                evenCount += 1

        return evenCount
