# LeetCode #4 - Median of Two Sorted Arrays

## Approach

Used Binary Search Partition Algorithm.

The goal is to divide both sorted arrays into two parts:

Left Part | Right Part


The correct partition satisfies:

Maximum(left side) <= Minimum(right side)


## Algorithm

1. Always apply binary search on the smaller array.
2. Find partition positions in both arrays.
3. Check whether the partition is valid.
4. If valid, calculate median.
5. Otherwise adjust binary search range.


## Key Concept

Binary search is used to find the correct partition instead of merging arrays.

Merging arrays would take:

O(m+n)

But this approach takes:

O(log(min(m,n)))


## Data Structures Used

- Arrays
- Binary Search


## Time Complexity

O(log(min(m,n)))


## Space Complexity

O(1)


## Concepts Learned

- Binary Search on Sorted Arrays
- Partition Technique
- Boundary Handling
- Median Calculation