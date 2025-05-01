
# What if there are **duplicate elements** stored at different indices in the array? Our previous logic only gave us the **first element** it could find and handed that to us.
# In this version, we will modify the search to return **all indices** where the element occurs.

## Approach:

- **Linear Search:**  
  We loop through the entire array to find all occurrences of the target element. Every time we find a match, we store the index.
  
  - We check each element starting from the beginning and continue till the end.
  - When we find a match, we **store all indices** of occurrences of the target value and print them.

## Features:
- Handles **duplicate values** in the array and returns **all indices** where the element appears.
- Implements a **basic linear search algorithm** to traverse the array.
