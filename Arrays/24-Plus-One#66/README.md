# LeetCode #66 - Plus One


## Approach

Used Array Traversal with Carry Handling.


The main idea:

Addition starts from the last digit.

If the digit is less than 9:
- Increase it by 1
- Return the array


If the digit is 9:
- Make it 0
- Continue the carry to the previous digit


## Algorithm

1. Start traversing from the last index.
2. Add 1 to the digit.
3. If digit is less than 9, return.
4. If digit is 9, replace it with 0.
5. If all digits become 0, create a new array with an extra digit.


## Example

Input:

[9,9,9]


Output:

[1,0,0,0]


## Concepts Used

- Array Traversal
- Carry Propagation
- Mathematical Logic


## Time Complexity

O(n)


## Space Complexity

O(1)

(Extra space only when all digits are 9)


## Pattern Learned

For addition problems:

Think:

Process digits from right to left.