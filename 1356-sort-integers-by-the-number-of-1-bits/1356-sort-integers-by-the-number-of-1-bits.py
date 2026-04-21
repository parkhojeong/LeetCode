class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        def countBit(a: int) -> int:
            cnt: int = 0
            while a > 0:
                if a % 2 == 1:
                    cnt += 1
                a //= 2
            return cnt


        arr.sort(key=lambda x: (countBit(x), x))
        return arr