class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        for index in range(len(words) - 1, 0, -1):
            if "".join(sorted(words[index])) == "".join(sorted(words[index - 1])):
                words.pop(index)

        return words