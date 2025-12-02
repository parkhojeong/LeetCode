class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = collections.defaultdict(int)
        for index in range(len(nums)):
            dic[nums[index]-target] = index

        for index in range(len(nums)):
            # print(index)
            # if -1 * nums[index] not in dic:
            #     continue

            val = dic[-1 * nums[index]]
            if val != 0 and index != val:
                return [index, val]
        