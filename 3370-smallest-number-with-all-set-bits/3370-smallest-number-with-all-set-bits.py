class Solution:
    def smallestNumber(self, n: int) -> int:
        s = ""
        while n > 0:
            s = str(n % 2) + s
            n = n // 2

        return sum([int(math.pow(2, i)) for i in range(len(s))])
