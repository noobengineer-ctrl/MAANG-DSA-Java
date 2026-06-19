# LeetCode 31 - Next Permutation


Concepts:

- Array Manipulation
- Two Pointer
- Greedy Approach


Observation:

Right side of permutation is usually in decreasing order.


Algorithm:

1. Find first index from right where:

   nums[i] < nums[i+1]


2. Find element just greater than nums[i].

3. Swap both elements.

4. Reverse remaining elements.


Edge Case:

If no breakpoint exists:

Array is highest permutation.

Reverse entire array.


Complexity:

Time:
O(n)

Space:
O(1)


Pattern:

Finding next arrangement/order

Think:

Greedy + Two Pointer