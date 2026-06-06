# LeetCode #217 - Contains Duplicate

## Approach

Used HashSet to store previously seen numbers.

For every number:

- Check if it already exists in HashSet.
- If yes, return true.
- Otherwise store it in HashSet.
- If traversal completes, return false.

## Time Complexity

O(n)

## Space Complexity

O(n)