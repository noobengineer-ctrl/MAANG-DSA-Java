# LeetCode 118 - Pascal's Triangle

## Problem Statement

Given an integer `numRows`, return the first `numRows` of Pascal's triangle.

In Pascal's Triangle:
- Each row starts and ends with `1`.
- Each middle element is the sum of the two numbers directly above it.


---

## Approach

1. Create an empty list to store the triangle.
2. Generate each row one by one.
3. Initialize every row with `1`.
4. Calculate middle elements using the previous row:
5. Add the generated row to the triangle.
