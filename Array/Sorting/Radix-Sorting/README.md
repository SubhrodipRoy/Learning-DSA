# Radix Sort

In this program, we first take an array (or list) as input from the user.

We then perform the following operations:

- **Radix Sort:**  
  The program sorts the array using the **Radix Sort** technique. This is a non-comparative integer sorting algorithm that sorts numbers by processing individual digits. It starts from the least significant digit (LSD) and moves to the most significant digit (MSD), using a stable sort (like Counting Sort) at each digit level.

  The programs provided here implement the **Radix Sort** algorithm for **ascending order**. In each digit-place sorting step, we extract the digit at the current place and group numbers accordingly, preserving relative order.

  To sort in **descending order**, one would reverse the grouping order (i.e., sort 9 to 0 instead of 0 to 9) at each digit level.

This logic is implemented in **C**, **Java**, and **Python** in this folder.
