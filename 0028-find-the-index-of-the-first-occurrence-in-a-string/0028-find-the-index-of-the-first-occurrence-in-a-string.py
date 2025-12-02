class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        for i, ch in enumerate(haystack):
            # print(i, len(needle))
            if haystack[i:i+len(needle)] == needle:
                return i

        return -1
        