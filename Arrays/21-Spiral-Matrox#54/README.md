# LeetCode #54 - Spiral Matrix


## Approach

Used Boundary Traversal Technique.


The matrix is traversed layer by layer using four boundaries:

- top
- bottom
- left
- right


## Algorithm

1. Initialize four boundaries.
2. Traverse:

   Left → Right

   Top → Bottom

   Right → Left

   Bottom → Top


3. Shrink the boundary after every traversal.
4. Continue until all elements are visited.


## Concepts Used

- 2D Array
- Matrix Traversal
- Simulation
- Boundary Manipulation


## Edge Cases

- Single row matrix
- Single column matrix
- Empty matrix


## Time Complexity

O(m*n)


## Space Complexity

O(1)


## Pattern Learned

Matrix problems:

Think:

Boundary Traversal