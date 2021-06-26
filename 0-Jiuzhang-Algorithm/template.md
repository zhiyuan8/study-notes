# 1 Time complexity
| time complexity | Method |
| ----------- | ----------- |
| O(logn) | binary search |
| O(sqrt(n)) | find the prime factors of n (Grover's algorithm) |
| O(n) | scan(two pointer)， tree |
| O(nlogn) | sort, binary search tree |
| O(n^2) | dp |
| O(n^3) | dp |
| O(2^n) | combination |
| O(n!) | permutation |

# 1 binary search


# 2 two pointers in same direction


# 3 two pointers in different direction


# 4 BFS (LinkedList + HashSet)
queue (FIFO) + Hashset  

*graph*

*2D matrix*

``` java
Queue <Integer> que = new LinkedList<>(Arrays.asList(n*x+y));
Set<Integer> visited = new HashSet<>(Arrays.asList(n*x+y));
final int[][] DIRECTION = {{0,-1},{0,1},{1,0},{-1,0}};
while(!que.isEmpty()){
    int size = que.size();
    for (int i=0; i<size; i++){ // pop. queue, FIFO 
        int top = que.poll();
        int row = top / n;
        int col = top % n;
        // do something for top
        for (int[] dir:DIRECTION){
            int row2 = row + dir[0];
            int col2 = col + dir[1];
            if (row2 < m && row2 >=0 && col2 < n && col2 >=0 && image[row2][col2] =='1'){
                int top2 = row2*n + col2;
                if ( !visited.contains(top2) ){
                    que.add(top2);
                    visited.add(top2);
                }
            }
        }
    }
}
```




# 5 DFS
