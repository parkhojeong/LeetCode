class Solution:
    def readBinaryWatch(self, turnedOn: int) -> List[str]:
        hours = [8, 4, 2, 1]
        minutes = [32, 16, 8, 4, 2, 1]

        result = []
        for i in range(0, turnedOn + 1):
            hourRes = [x for x in self.dfs(hours, 0, [], i) if x <= 11]
            minuteRes = [x for x in self.dfs(minutes, 0, [], turnedOn - i) if x <= 59]

            for hour in hourRes:
                for minute in minuteRes:
                    paddedMinute = str(minute) if minute >= 10 else "0" + str(minute)
                    result.append(str(hour) + ":" + paddedMinute)

        return result

    def dfs(self, arr: List[int], pick: int, visited: List[int], leftCount: int) -> List[int]:
        if leftCount == 0:
            return [pick]

        result: List[int] = []
        for i in range(len(arr)):
            num = arr[i]
            if num in visited:
                continue

            dfsRes = self.dfs(arr[i + 1:], num, visited + [num], leftCount - 1)
            for val in dfsRes:
                result.append(pick + val)

        return result

