# LeetCode #136 - Single Number


## Approach

Used XOR Bit Manipulation approach.


The main idea:

Every number appears twice except one number.

Using XOR:

a ^ a = 0

a ^ 0 = a


Duplicate numbers cancel each other, and the remaining number is the answer.


## Algorithm

1. Initialize result as 0.
2. Traverse every element in the array.
3. Apply XOR with result.
4. Return the final result.


## Example

Input:

[4,1,2,1,2]


Process:

4 ^ 1 ^ 2 ^ 1 ^ 2


Pairs cancel:

1 ^ 1 = 0

2 ^ 2 = 0


Answer:

4


## Concepts Used

- Arrays
- Bit Manipulation
- XOR Operation


## Time Complexity

O(n)


## Space Complexity

O(1)


## Pattern Learned

Finding unique elements:

Think:

XOR