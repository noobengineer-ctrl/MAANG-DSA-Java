# LeetCode #347 - Top K Frequent Elements

## Approach

Used HashMap + Min Heap.

Steps:

1. Count frequency of each number using HashMap.
2. Store numbers with their frequencies in a Min Heap.
3. Maintain heap size equal to k.
4. Remove the smallest frequency element whenever heap size exceeds k.
5. Remaining elements are the top k frequent elements.

## Key Concept

HashMap:

Stores:

Number → Frequency


Min Heap:

Keeps the smallest frequency at the top.

When size exceeds k, remove the least frequent element.

## Why Min Heap?

We only need top k elements, not complete sorting.

Heap reduces complexity from sorting O(n log n) to O(n log k).

## Data Structures Used

- HashMap
- PriorityQueue (Min Heap)

## Time Complexity

O(n log k)

## Space Complexity

O(n)

## Concepts Learned

- Frequency Counting
- HashMap
- Heap
- PriorityQueue
- Top K Pattern