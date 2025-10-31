"""
Problem: Maximum Profit Product Interval

You are given an array nums of length n, where nums[i] represents the price of a stock on day i.

You need to choose a contiguous interval of days [i, j] (i ≤ j) such that:

1. You buy on one day and sell on another day within this interval (like the "Best Time to Buy and Sell Stock").
2. You calculate the sum of all prices in the chosen interval (like "Maximum Subarray").
3. You find the product of all prices in the interval except the buying and selling days (like "Product of Array Except Self").
4. Intervals can overlap, but you want the maximum value of (selling price - buying price) * product_of_others_in_interval.
5. If intervals overlap, consider merging overlapping intervals first (like "Merge Intervals").

Return the maximum value achievable and the corresponding interval [i, j].
"""

class MaxProfitInterval:
    def __init__():
        prices = []