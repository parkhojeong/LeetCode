class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        for i in range(len(nums)):
            for num in nums:
                if num == original:
                    original *= 2
                    break

        return original