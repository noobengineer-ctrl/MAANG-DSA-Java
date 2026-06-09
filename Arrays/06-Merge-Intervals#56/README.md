# LeetCode #56 - Merge Intervals

## Approach

Used Sorting + Interval Merging.

- Sort intervals based on starting value.
- Compare current interval with next interval.
- If they overlap, merge them.
- Otherwise, add current interval to the result and start a new interval.

## Key Idea

Two intervals overlap if:

nextStart <= currentEnd

## Time Complexity

O(n log n)

## Space Complexity

O(n)