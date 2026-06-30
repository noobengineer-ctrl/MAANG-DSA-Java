# LeetCode #120 - Triangle


## Approach

Used Bottom-Up Dynamic Programming approach.


The idea is to calculate the minimum path sum from the bottom of the triangle.

For every element:

current value =
current value +
minimum(left child, right child)


## Algorithm

1. Start from the second last row.
2. Compare the two children below each element.
3. Add the smaller child value to the current value.
4. Continue moving upward.
5. The top element contains the minimum path sum.


## Example

Input:

[
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
]


Minimum Path:

2 → 3 → 5 → 1


Output:

11


## Concepts Used

- Dynamic Programming
- Bottom-Up DP
- Array/List Manipulation


## Time Complexity

O(n²)


## Space Complexity

O(1)


## Pattern Learned

For path optimization problems:

Think:

Bottom-Up Dynamic Programming