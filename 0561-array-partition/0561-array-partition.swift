class Solution {
    func arrayPairSum(_ nums: [Int]) -> Int {
        var sum = 0
        let sorted = nums.sorted()
        for i in 0..<sorted.count {
            if i % 2 == 0 {
                sum += sorted[i]
            }
        }
        return sum
    }
}
// 1 2 2 5 6 6