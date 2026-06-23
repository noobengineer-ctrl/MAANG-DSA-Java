# LeetCode #78 - Subsets


## Approach

Used Backtracking / Recursion approach.


The main idea:

For every element, we have two choices:

1. Include the element
2. Exclude the element


Every possible choice creates a new subset.


## Algorithm

1. Create a result list.
2. Maintain a temporary list for current subset.
3. Start recursion from index 0.
4. Add current subset to result.
5. Pick an element.
6. Explore further choices.
7. Remove the element to backtrack.


## Example

Input:

nums = [1,2,3]


Output:

[
[],
[1],
[2],
[3],
[1,2],
[1,3],
[2,3],
[1,2,3]
]


## Concepts Used

- Recursion
- Backtracking
- Decision Tree
- ArrayList


## Backtracking Pattern

Choose

↓

Explore

↓

Undo Choice


## Time Complexity

O(n * 2^n)


## Space Complexity

O(n)


## Pattern Learned

Generating all combinations:

Think:

Backtracking