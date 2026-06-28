# LeetCode #79 - Word Search


## Approach

Used DFS + Backtracking approach.


The idea is to start searching from every cell.

For every cell:

- Match current character
- Mark it visited
- Explore four directions
- Restore the cell after searching


## Algorithm

1. Traverse every cell in the matrix.
2. Start DFS if character matches first letter.
3. Check four directions:

   - Up
   - Down
   - Left
   - Right


4. Temporarily mark visited cells.
5. Backtrack and restore original value.


## Concepts Used

- Depth First Search (DFS)
- Backtracking
- Matrix Traversal
- Recursion


## Backtracking Pattern

Choose

↓

Explore

↓

Undo Choice


## Time Complexity

O(m*n*4^L)


## Space Complexity

O(L)


## Pattern Learned

Matrix problems:

Think:

DFS + Backtracking