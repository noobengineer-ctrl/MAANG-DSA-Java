# LeetCode #53 - Maximum Subarray

## Approach

Used Kadane's Algorithm.

For every element:

- Add the current element to the running sum.
- Update the maximum sum found so far.
- If the running sum becomes negative, reset it to 0.
- Continue until the end of the array.

## Key Idea

A negative running sum cannot help future subarrays.

If the current sum becomes negative, it is better to start a new subarray.

## Time Complexity

O(n)

## Space Complexity

O(1)