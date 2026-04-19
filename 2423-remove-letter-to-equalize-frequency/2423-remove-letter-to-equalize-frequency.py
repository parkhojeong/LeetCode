class Solution:
    def equalFrequency(self, word: str) -> bool:
        dic = defaultdict(int)
        for ch in word:
            dic[ch] += 1

        # zz
        if len(dic) == 1:
            return True

        dic2 = defaultdict(int)
        for value in dic.values():
            dic2[value] += 1

        if len(dic2) == 1 and set(dic2.keys()).pop() == 1:
            return True

        if len(dic2) == 2:
            keySet = set(dic2.keys())
            key1 = keySet.pop()
            key2 = keySet.pop()

            # aab
            if (key1 == 1 and dic2[key1] == 1) or (key2 == 1 and dic2[key2] == 1):
                return True

            # abcccc
            if key1 < key2 and (key2 - key1 == 1) and dic2[key2] == 1:
                return True
            if key2 < key1 and (key1 - key2 == 1) and dic2[key1] == 1:
                return True

        return False


# abcc
# aazz
# abc
# abccc
# abcccc

# all letter is once -> count does not matter (abcde)
# two group: one is once, anohter is the same (abbbccc)

# { count : [] }
# abcde { 1: 5 }
# abbbccc {3: 2, 1: 1(*)}
# aabb {2: 2}

# len(1) -> key is 1
# len(2) -> value for key(1) is 1
