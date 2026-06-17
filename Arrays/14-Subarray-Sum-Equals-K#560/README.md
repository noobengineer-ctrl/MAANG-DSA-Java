# LeetCode #560 - Subarray Sum Equals K

## Approach

Used Prefix Sum + HashMap.

Steps:

1. Maintain a running prefix sum.
2. Store prefix sums with their frequencies in HashMap.
3. For every prefix sum, check:

   currentSum - k

4. If this value exists in HashMap, a valid subarray is found.
5. Add its frequency to the answer.
6. Store current prefix sum.


## Key Formula

Required Prefix Sum = Current Prefix Sum - k


## Why HashMap?

HashMap provides O(1) lookup.

It helps quickly check whether a required prefix sum has appeared before.


## Data Structures Used

- HashMap
- Prefix Sum


## Time Complexity

O(n)


## Space Complexity

O(n)


## Concepts Learned

- Prefix Sum
- HashMap Frequency Counting
- Subarray Pattern
- Optimized Array Traversal