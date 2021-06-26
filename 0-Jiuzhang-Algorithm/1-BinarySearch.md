# 1 binary search template:
```
start + 1 < end
int mid = start + (end-start)/2
A[mid] == < >
A[start] A[end]? target
```
Explanation:
(1) 问清楚：  
[1] sorted?  
[2] If not found, return nearest or return -1?  
[3]duplicated element, return 1st or last element?  
(2)	不用start <= end, 为了在while  loop只剩下两个循环的时候停下来，因为有的二分法没法停在只剩下1个element   
(3)	start = mid + 1; end = mid - 1   

# 2 related challenging problem
Leetcode:
| No | Problem | Notes |
| ----------- | ----------- | ----------- |
| 658 | Find K Closest Elements | first last <= index; two pointer |
| 154 | Find Minimum in Rotated Sorted Array II | When there are duplicates, move start until A[start] < A[end] , compare A[mid] with A[end], worse case O(n) |
| 1095 | Find in Mountain Array | Find index of peak first by compare with value with index + 1, then binary search the 2 halves.  |
| 74 | Search a 2D Matrix | binary search 1st column to find which row to start with, then scan that row |
| 240 | Search a 2D Matrix II | not binary search, scan from left bottom to top right |
| 302 | Smallest Rectangle Enclosing Black Pixels | Way 1: BFS and save max/min row and col index Way 2: Binary search columns, check if mid column has any 1, to find left & right most column. Do same for row. O(nlogm + mlogn) |


