# LeetCode #238 - Product of Array Except Self

## Approach

Used Prefix and Suffix Product concept.

For every index:

- Store product of all elements on the left side.
- Traverse from right side while maintaining a running right product.
- Multiply left product and right product to get final answer.

## Time Complexity

O(n)

## Space Complexity

O(1)