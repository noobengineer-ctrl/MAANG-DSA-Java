# LeetCode #49 - Group Anagrams


## Approach

Used HashMap + Sorting Technique.


The main idea is:

Anagrams have the same characters.

If we sort the characters of an anagram, they produce the same key.


Example:

eat → aet

tea → aet

ate → aet


## Algorithm

1. Create a HashMap.
2. Convert each string into a character array.
3. Sort the characters.
4. Use the sorted string as a key.
5. Store the original string in the corresponding list.
6. Return all values of HashMap.


## HashMap Structure

Key:

Sorted String


Value:

List of Original Strings


Example:

aet → [eat, tea, ate]


## Concepts Used

- HashMap
- String Manipulation
- Sorting
- ArrayList


## Time Complexity

O(n * k log k)


## Space Complexity

O(n * k)


## Pattern Learned

Grouping similar elements:

Think:

HashMap + Unique Signature