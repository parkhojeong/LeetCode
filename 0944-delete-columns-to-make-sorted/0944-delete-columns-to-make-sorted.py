class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        cnt = 0
        for x in range(len(strs[0])):
            for y in range(1, len(strs)):
                prev = strs[y - 1]
                cur = strs[y]
                if cur[x] < prev[x]:
                    cnt += 1
                    break

        return cnt
        