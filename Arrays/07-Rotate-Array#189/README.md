# LeetCode #189 - Rotate Array

## Approach

Used Reversal Algorithm.

- Reduce unnecessary rotations using k % n.
- Reverse the entire array.
- Reverse the first k elements.
- Reverse the remaining elements.

## Key Idea

Reverse entire array → Reverse first k elements → Reverse remaining elements.

## Time Complexity

O(n)

## Space Complexity

O(1)