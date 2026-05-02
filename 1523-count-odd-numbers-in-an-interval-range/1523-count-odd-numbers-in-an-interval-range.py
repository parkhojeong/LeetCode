class Solution:
    def countOdds(self, low: int, high: int) -> int:
        diff = high - low + 1
        count = diff // 2
        if diff % 2 == 1 and low % 2 == 1:
            count += 1

        return count

# 0 1 2 3
# 0 1 2 3 4
#   1 2 3 4 5
#   1 2 3 4
# 0
# 1
# 0 1
# 1 2
