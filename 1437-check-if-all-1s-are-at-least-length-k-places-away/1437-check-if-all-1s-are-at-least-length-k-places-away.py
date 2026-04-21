class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        i = 0
        j = 0

        while i < len(nums):
            if nums[i] == 0:
                i += 1
            else:
                break

        while i < len(nums) - 1:
            j = i + 1
            while nums[j] != 1 and j < len(nums) - 1 and nums[j + 1] == 0:
                j += 1

            if (j == len(nums) - 1) and nums[j] == 0:
                return True

            # print(i, j)
            if j - i < k:
                # print("False", i, j)
                return False
            i = j + 1

        return True

# 1 0 0 1 0 0 1 1
# 1 1 1 0 0 1 0 0 1

# 0 1 1 0 0 1 1 0 1
# 0 1 0 0 0 1 1 0 0 1