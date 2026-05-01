class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        bits = ""
        while n > 0:
            bits += str(n % 2)
            n = n // 2

        for i in range(1, len(bits)):
            if bits[i] == bits[i - 1]:
                return False
        
        return True