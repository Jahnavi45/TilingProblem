# Tiling Problem
## Problem Statement
The problem is to calculate the number of ways to fill a *2 x n* floor with *1 x 2* tiles. The task is to compute how many distinct ways you can arrange these tiles to cover the floor completely.

This is a well-known problem in dynamic programming. The challenge is to break the problem into subproblems and utilize the previously computed results to solve the larger problem efficiently.

## Solution Approach
1. *Dynamic Programming* is used to solve the problem.
2. Let dp[i] represent the number of ways to fill a *2 x i* floor.
3. The recurrence relation is:
   - dp[i] = dp[i-1] + dp[i-2]
     - If we place a vertical tile, the problem reduces to a *2 x (i-1)* floor.
     - If we place two horizontal tiles, the problem reduces to a *2 x (i-2)* floor.
4. The solution involves populating a DP array and using the recurrence relation to compute the number of ways to fill the floor of size *2 x n*.

## Features
- User-friendly: The program allows the user to enter the size of the floor.
- Efficient: Uses dynamic programming to calculate the number of ways in *O(n)* time complexity.
- Simple Input/Output: The user enters the size of the floor, and the program outputs the number of ways to fill the floor.

## How to Run the Program
1. Clone or download the repository.
2. Compile the Java file:
   ```bash
   javac TilingProblem.java
