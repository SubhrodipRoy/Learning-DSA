# 🧮 Find Pairs with a Given Difference

## 📝 Problem Statement

Given an array of integers and a positive integer x, the task is to find all **pairs of distinct elements** in the array such that the difference between the elements in each pair is x.
---

## 💡 Example

**Input:**

Array: **1 5 3 4 2 9**  
x = `2`

**Output:**

The elements of the array are: 1 5 3 4 2 9 
The following pairs of elements give us a difference of 2:  
(1, 3); (5, 3); (3, 1); (4, 2);

---

## ✅ Solution Logic

To solve this, we:

1. Accept the size and elements of the array from the user.  
2. Take the target difference **x** as input.  
3. Use two loops:  
   - Outer loop selects one element at a time.  
   - Inner loop checks it against every element that comes **after** it.  
4. For every pair **(a, b)**, calculate **|a - b|**.  
5. If the result equals `x`, we print that pair.

This approach ensures:
- Each pair is checked only once.  
- We don’t repeat or reverse duplicates.  
- The logic stays simple and understandable for beginners.

---

## 📂 Implementations

This logic has been implemented in:

- **C** – `pair_difference_finder.c`
- **Java** – `PairDifferenceFinder.java`
- **Python** – `pair_difference_finder.py`
