
class Solution {
    func longestPalindrome(_ s: String) -> Int {
        var dic: [Character: Int] = [:]
        for ch in s {
            let value = dic[ch] ?? 0
            dic.updateValue(value + 1, forKey: ch)
        }

        var maxCount = 0
        var hasOdd = false
        for value in dic.values {
            if value >= 2 {
                maxCount += value - (value % 2)
            }

            if value % 2 == 1 {
                hasOdd = true
            }
        }

        if hasOdd {
            maxCount += 1
        }

        return maxCount
    }
}