class Solution:
    def hasSameDigits(self, s: str) -> bool:
        while len(s) > 2:
            
            s = "".join(str((int(s[i]) + int(s[i + 1])) % 10) for i, c in enumerate(s[:-1]))

            if s == "".join(reversed(s)):
                return True

        return False