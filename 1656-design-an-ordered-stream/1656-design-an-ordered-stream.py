class OrderedStream:

    def __init__(self, n: int):
        self.arr = [""] * n
        self.ptr = 0

    def insert(self, idKey: int, value: str) -> List[str]:
        self.arr[idKey - 1] = value

        i = self.ptr
        while i < len(self.arr):
            if self.arr[i] != "":
                i += 1
            else:
                break

        output = self.arr[self.ptr:i]
        self.ptr = i
        return output


# Your OrderedStream object will be instantiated and called as such:
# obj = OrderedStream(n)
# param_1 = obj.insert(idKey,value)