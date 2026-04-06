class Solution:
    def hasSameDigits(self, s: str) -> bool:
        while len(s) > 2:
            
            s = "".join(str((int(s[i]) + int(s[i + 1])) % 10) for i, c in enumerate(s[:-1]))

            if s == "".join(reversed(s)):
                return True

        return False
# 0 0 0 
# 1 2 1

# 0 0 0 0 
# 1 2 2 1
# 1 3 3 1

# 0 0 0 0 0    1 1 1 1 1
# 1 2 2 2 1     2 2 2 2
#   3 4 3        4 4 4
#   4 6 4         8 8
#                  16

# 0 0 0 0 0 0    1 1 1 1 1 1
# 1 2 2 2 2 1     2 2 2 2 2 
#   3 4 4 3        4 4 4 4
#.  4 6 6 4         8 8 8
#     7 7           16 16