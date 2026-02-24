class Solution {
    func findContentChildren(_ g: [Int], _ s: [Int]) -> Int {
        let sortedG = g.sorted()
        let sortedS = s.sorted()
        var sIdx = 0
        var count = 0
        for (i, value) in sortedG.enumerated() {
            while sIdx < sortedS.count {
                if value <= sortedS[sIdx]{
                    count += 1
                    sIdx += 1
                    break
                }

                sIdx += 1
            }
        }
        return count
    }
}