class MovingAverage:
    _data: [int]
    _size: int

    def __init__(self, size: int):
        self._size = size
        self._data = []

    def next(self, val: int) -> float:
        if len(self._data) == self._size:
            self._data = self._data[1:]

        self._data.append(val)
        return sum(self._data) / len(self._data)



# Your MovingAverage object will be instantiated and called as such:
# obj = MovingAverage(size)
# param_1 = obj.next(val)