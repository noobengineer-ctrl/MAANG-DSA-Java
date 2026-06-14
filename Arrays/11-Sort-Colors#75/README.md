# LeetCode #75 - Sort Colors

## Approach

Used Dutch National Flag Algorithm.

Maintained three pointers:

- low → position for next 0
- mid → current element being checked
- high → position for next 2

## Algorithm

If nums[mid] == 0:

- Swap low and mid
- Increase low and mid

If nums[mid] == 1:

- Move mid forward

If nums[mid] == 2:

- Swap mid and high
- Decrease high

## Key Concept

Divide the array into three parts:

0s | 1s | Unknown | 2s

The unknown section keeps reducing until the array is sorted.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Concepts Learned

- Two Pointer Technique
- Dutch National Flag Algorithm
- In-place Sorting
- Array Manipulation