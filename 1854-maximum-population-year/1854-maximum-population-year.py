class Solution:
    def maximumPopulation(self, logs: List[List[int]]) -> int:
        arr = [0 for x in range(1950, 2051)]
        for log in logs:
            for i in range(log[0], log[1]):
                arr[i - 1950] += 1

        maxVal = -1
        minIdx = -1
        for i in range(len(arr)):
            if maxVal < arr[i]:
                maxVal = arr[i]
                minIdx = i

        return minIdx + 1950
