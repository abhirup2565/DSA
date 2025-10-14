import math
def stocks():
    prices = [7,1,5,3,6,4]
    high = [prices[len(prices)-1]]*len(prices)

    for price in range(len(prices)-2,0,-1):
        high[price] = max(prices[price],high[price+1])

    max_profit = -math.inf
    for price in range(len(prices)):
        profit = high[price]-prices[price]
        max_profit = max(max_profit,profit)

    print(max_profit)

stocks()