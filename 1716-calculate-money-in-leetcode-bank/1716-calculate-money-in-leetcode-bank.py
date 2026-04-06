class Solution:
    def totalMoney(self, n: int) -> int:
        li = [(((x - 1) % 7 + 1) + (x - 1) // 7) for x in range(1, n + 1)]
        return sum(li)
