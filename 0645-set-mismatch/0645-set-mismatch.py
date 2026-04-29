class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        numSet = {x + 1 for x in range(len(nums))}
        duplicatedNum = -1
        for num in nums:
            if num not in numSet:
                duplicatedNum = num
            else:
                numSet.remove(num)

        return [duplicatedNum, numSet.pop()]