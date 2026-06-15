# LeetCode #128 - Longest Consecutive Sequence

## Approach

Used HashSet for O(1) lookup.

Steps:

1. Store all array elements in HashSet.
2. Traverse each number.
3. Check if the number is the beginning of a sequence.
4. Count consecutive numbers.
5. Update maximum sequence length.

## Key Observation

A number is a starting point only when:

(num - 1) does not exist in HashSet.

Example:

For:

1,2,3,4

Only 1 is the starting point because 0 does not exist.

## Why HashSet?

HashSet provides fast searching.

contains() operation takes approximately O(1) time.

It helps avoid sorting and reduces complexity.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Concepts Learned

- HashSet
- Array Traversal
- Consecutive Sequence Pattern
- Fast Lookup
- Optimization from O(n²) to O(n)