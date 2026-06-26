# LeetCode 64 - Minimum Path Sum


Concepts:

- Dynamic Programming
- 2D Grid
- State Transition


Observation:

Every cell depends on:

Top cell
+
Left cell


Formula:

current value =
current value +
min(top,left)


Approach:

1. Traverse grid.
2. Maintain minimum cost at every cell.
3. First row:
   Only left possible.

4. First column:
   Only top possible.

5. Other cells:
   Choose minimum of top and left.


Complexity:

Time:
O(m*n)

Space:
O(1)


Pattern:

Grid DP

Think:

Store best answer at every state