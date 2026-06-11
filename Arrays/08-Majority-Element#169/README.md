# LeetCode #169 - Majority Element

## Approach

Used Boyer-Moore Voting Algorithm.

- Maintain a candidate and count.
- If count becomes 0, choose current element as candidate.
- If current element matches candidate, increment count.
- Otherwise decrement count.
- Final candidate is the majority element.

## Key Idea

Different elements cancel each other out.

Since the majority element appears more than n/2 times,
it survives all cancellations.

## Time Complexity

O(n)

## Space Complexity

O(1)