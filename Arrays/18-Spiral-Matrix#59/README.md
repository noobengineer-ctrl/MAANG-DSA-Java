# LeetCode 59 - Spiral Matrix II


Concepts:

- 2D Array
- Matrix Traversal
- Simulation


Approach:

Maintain four boundaries:

top
bottom
left
right


Traversal order:

1. Left → Right
2. Top → Bottom
3. Right → Left
4. Bottom → Top


After every traversal:

top++
right--
bottom--
left++


Complexity:

Time:
O(n²)

Space:
O(1)


Pattern:

Matrix traversal problems

Think:

Boundary Manipulation