# Frog jump with K distances

A frog wants to climb a staircase with n steps. Given an integer array heights, where heights[i] contains the height of the ith step, and an integer k.

To jump from the ith step to the jth step, the frog requires abs(heights[i] - heights[j]) energy, where abs() denotes the absolute difference. The frog can jump from the ith step to any step in the range [i + 1, i + k], provided it exists. Return the minimum amount of energy required by the frog to go from the 0th step to the (n-1)th step.

---
# Explanation
Input: heights = [10, 5, 20, 0, 15], k = 2
Output: 15

Explanation:
    0th step -> 2nd step, cost = abs(10 - 20) = 10
    2nd step -> 4th step, cost = abs(20 - 15) = 5
    Total cost = 10 + 5 = 15.

---

Question link : https://takeuforward.org/plus/dsa/problems/frog-jump-with-k-distances

--- 

This problem has been solved by four technique

- Recursion
- Memoization
- Tabulation