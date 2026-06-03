# LeetCode #1 - Two Sum

## Approach

Used HashMap to store number and index.

For every number:
- Find complement = target - nums[i]
- Check if complement exists in HashMap
- Return indices if found

## Time Complexity

O(n)

## Space Complexity

O(n)