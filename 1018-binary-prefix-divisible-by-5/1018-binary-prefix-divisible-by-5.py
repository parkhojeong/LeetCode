class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        m = 0
        sum = 0
        arr = []
        for i in range(len(nums)):
            if nums[i] == 1 and m == 0:
                m = 2
            sum = nums[i] + sum * m
            arr.append(sum)

        for i in range(len(arr)):
            if arr[i] % 5 == 0:
                arr[i] = True
            else:
                arr[i] = False

        return arr