# LeetCode #33 - Search in Rotated Sorted Array


## Approach

Used Modified Binary Search.


The array is sorted but rotated.

The key observation:

At every step, one half of the array is always sorted.


## Algorithm

1. Find the middle element.
2. If nums[mid] == target, return mid.
3. Check which half is sorted.
4. Determine whether target exists in that sorted half.
5. Search the correct half.


## Example

Input:

nums = [4,5,6,7,0,1,2]

target = 0


Output:

4


## Concepts Used

- Binary Search
- Rotated Sorted Array
- Divide and Conquer


## Key Observation

Normal binary search works on completely sorted arrays.

For rotated arrays:

One side is always sorted.

Use that sorted half to decide direction.


## Time Complexity

O(log n)


## Space Complexity

O(1)


## Pattern Learned

Sorted Array Searching:

Modified Binary Search