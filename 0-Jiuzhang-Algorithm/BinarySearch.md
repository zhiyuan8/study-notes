# 1 binary search template:
```
start + 1 < end
int mid = start + (end-start)/2
A[mid] == < >
A[start] A[end]? target
```

Explanation:
(1)	While (start+1 < end), 不用start <=end, 为了在while loop只剩下两个循环的时候停下来，因为有的二分法没法停在只剩下1个element，需要在最后一个循环处做一些处理。此外，对于【1,1】,target=1情况，如果要返回last index of target，start < end 会出现死循环。
(2)	int mid = start + (end-start)/2
(3)	
a.	A[mid] == target, return mid
b.	A[mid] < target, start = mid + 1
c.	A[mid] > target, end = mid - 1
(4)	增加一个最后一个循环的判断
a.	If A[start] == target, return start
b.	If A[end] == target, return end
c.	Return -1
