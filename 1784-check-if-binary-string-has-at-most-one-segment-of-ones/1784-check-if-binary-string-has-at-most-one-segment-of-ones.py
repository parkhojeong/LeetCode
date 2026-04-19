class Solution:
    def checkOnesSegment(self, s: str) -> bool:
        cnt = 0
        for segment in s.split('0'):
            if segment != '':
                cnt += 1

        return True if cnt <= 1 else False
