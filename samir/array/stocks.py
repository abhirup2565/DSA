import math
def stocks():
    prices = [7,1,5,3,6,4]
    high = [0] * len(prices)
    high[-1] = prices[-1] 

    # Build array of maximum prices to the right
    for i in range(len(prices)-2, -1, -1):
        high[i] = max(prices[i], high[i+1])

    max_profit = 0
    for i in range(len(prices)):
        profit = high[i] - prices[i]
        max_profit = max(max_profit, profit)

    print(max_profit)

stocks()