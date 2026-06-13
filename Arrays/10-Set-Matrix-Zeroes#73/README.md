# LeetCode #73 - Set Matrix Zeroes

## Approach

Used Boolean Arrays to store the rows and columns which contain zero.

Steps:

1. Traverse the matrix.
2. Whenever a zero is found:
   - Mark its row.
   - Mark its column.
3. Traverse the matrix again.
4. Convert all marked rows and columns into zero.

## Key Concept

First Mark, Then Modify.

We cannot directly modify the matrix while finding zeros because newly created zeros can affect the result.

## Data Structure Used

Boolean Array

Used because we only need to store whether a row or column contains zero.

## Time Complexity

O(m*n)

## Space Complexity

O(m+n)

## Concepts Learned

- 2D Array
- Matrix Traversal
- Boolean Array
- Marking Technique
- In-place Algorithm