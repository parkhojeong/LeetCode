class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        arr = []
        for i in range(len(nums)):
            if nums[i] == 1:
                arr.append(i)

        # print(arr)
        for i in range(len(arr) - 1):
            if arr[i + 1] - arr[i] <= k:
                return False

        return True