class Solution:
    def totalMoney(self, n: int) -> int:
        li = [((x % 7 + 1) + x // 7) for x in range(n)]
        return sum(li)
