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

