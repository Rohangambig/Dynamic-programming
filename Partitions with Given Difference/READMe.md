## Explanation 
Given an array arr[], partition it into two subsets(possibly empty) such that each element must belong to only one subset. Let the sum of the elements of these two subsets be sum1 and sum2. Given a difference d, count the number of partitions in which sum1 is greater than or equal to sum2 and the difference between sum1 and sum2 is equal to d. 

- 1 <= arr.size() <= 50
- 0 <= d  <= 50
- 0 <= arr[i] <= 6

--Input: arr[] =  [5, 2, 6, 4], d = 3
--Output: 1
--Explanation: There is only one possible partition of this array. Partition : {6, 4}, {5, 2}. The subset difference between subset sum is: (6 + 4) - (5 + 2) = 3.