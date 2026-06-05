# LeetCode #121 - Best Time to Buy and Sell Stock

## Approach

Used two variables:

* `minPrice` to store the lowest stock price seen so far.
* `maxProfit` to store the highest profit found so far.

For every price:

* Update `minPrice` if a lower price is found.
* Calculate profit = current price - minPrice.
* Update `maxProfit` if the current profit is greater.

## Time Complexity

O(n)

## Space Complexity

O(1)
