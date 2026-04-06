class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        s = set([x for x in nums[:k]])
        if len(nums) <= k:
            return len(s) < len(nums)

        for i in range(k, len(nums)):
            s.add(nums[i])
            if len(s) < k + 1:
                return True

            s.remove(nums[i - k])

        return False
