class Solution {
    func maximumUnits(_ boxTypes: [[Int]], _ truckSize: Int) -> Int {
        let sorted = boxTypes.sorted(by: {
            $0[1] > $1[1]
        })
        var left = truckSize
        var sum = 0
        
        sorted.forEach{
            var box = $0[0], unit = $0[1]
            while left > 0 {
                left -= 1
                box -= 1
                sum += unit

                if box == 0 {
                    break
                }
            }
        }

        return sum  
    }
}