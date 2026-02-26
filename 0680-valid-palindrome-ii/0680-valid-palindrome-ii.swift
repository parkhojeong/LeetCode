class Solution {
    func validPalindrome(_ s: String) -> Bool {

        func isPalindrome(_ range: Range<String.Index>) -> Bool {
            var i = range.lowerBound
            var j = s.index(before: range.upperBound)
            while i < j {
                if s[i] != s[j] { return false }
                i = s.index(after: i)
                j = s.index(before: j)
            }
            return true
        }

        var left = s.startIndex
        var right = s.index(before: s.endIndex)

        while left < right {
            if s[left] == s[right] {
                left = s.index(after: left)
                right = s.index(before: right)
            } else {
                if isPalindrome(
                    (s.index(after: left))..<s.index(after: right)
                ) { return true }

                if isPalindrome(left..<right) { return true }

                return false
            }
        }
        return true
    }
}
