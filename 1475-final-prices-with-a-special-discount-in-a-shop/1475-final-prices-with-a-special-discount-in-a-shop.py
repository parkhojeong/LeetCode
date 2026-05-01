class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        result: List[int] = []
        for i in range(len(prices)):
            discoutedPrice = prices[i]
            for j in range(i + 1, len(prices)):
                if prices[j] <= prices[i]:
                    discoutedPrice = prices[i] - prices[j]
                    break

            result.append(discoutedPrice)

        return result
