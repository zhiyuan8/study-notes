# Java data structure
https://www.javatpoint.com/data-structure-tutorial
https://www.educative.io/courses/data-structures-coding-interviews-java
https://www.educative.io/path/ace-java-coding-interview


Data structure can be classified as:  
*Linear data structure* :  Arrays, Linked list, Stacks, and Queues. In these data structures, one element is connected to only one another element in a linear form.  
*Non-linear data structure* :  trees and graphs.  When one element is connected to the 'n' number of elements known as a non-linear data structure.  

Another way to classify is:  
*Static data structure*: It is a type of data structure where the size is allocated at the compile time. Therefore, the maximum size is fixed.  
*Dynamic data structure*: It is a type of data structure where the size is allocated at the run time. Therefore, the maximum size is flexible.  

![data struture classification](/5-java/ds0.jpg)

Basic operations: Searching, Sorting, Insertion, Updation, Deletion.  

*Interface* − These are abstract data types that represent collections.
*Classes* − These are the concrete implementations of the collection interfaces. In essence, they are reusable data structures.

![all data struture](/5-java/ds1.png)

# 1 Array
Array is linear data structure which stores fixed number of similar elements.  
```java
import java.util.Arrays
```
| field      | Description |
| ----------- | ----------- |
| array.length | for Array |
| ArrayList.size() | for ArrayList |

| method      | Description |
| ----------- | ----------- |
| int Arrays.binarySearch(Object[] a, Object key)      | return index of the search key, if it is contained in the array; otherwise, (-(insertion point) – 1). Note, array must be sorted! |
| boolean Arrays.equals(Object[] a, Object[] a2)  | same as "a==a2", reference comparison, must be same object.  |
| bool arr.equals(Object[] a2) | value comparison, but must be same precison. float and double comparison will return false. |
| void Arrays.fill(Object[] a, Object val) | fill |
| void Arrays.sort(Object[] a) | sort |
| int[] Arrays.copyOf(int[] original, int newLength) | copy the specified array, truncating or padding with false |
| int[] Arrays.copyOfRange(int[] original, int from, int to) | copy the specified array with index [from, to), to is not included|
| Arrays.toString() | System.out.println(Arrays.toString(Arr)); |

create array, array length is fixed, must have []
```java
import java.util.Arrays;
int[] arr2 = new int[10];
int[][][] box = new int[3][5][2]; // multi-dimensional
System.out.println(arr2.length); // do not use length()
int[] x = {32, 17, 3, -21};
int[] y = {32, 17, 3, -21}; 

Point[] coordinate = new Point[3]; // step 1: create static array of objects
for (int i=0; i<coordinate.length; i++) { // another ways is for (int x:coordinate) {}
coordinate[i] = new Point(0, 0); // step 2: initialization
}

boolean isEqual = Arrays.equals(x,y); // Arrays.equals(arr1,arr2)
Arrays.sort(x);	// Arrays.equals(arr1), inplace
int pos = Arrays.binarySearch(x,10); // Arrays.binarySearch(arr1,key), < 0 if not found
Arrays.fill(x,1); // Arrays.fill(arr1, val)
System.out.println(Arrays.toString(arr)); // for print, get "[1.0, 1.0, 1.0]"

double[] fArrCopy = Arrays.copyOfRange(fArr,0,3);
System.out.println("fArrCopy = " + Arrays.toString(fArrCopy)); // for print, get "[1.0]"
```

# 2. The Collection Interface
![Collection Interface](/5-java/Collection_hierarchy.png)

| method      | Description |
| ----------- | ----------- |
| collections.sort(List<T> list) | sort ArrayList |
| collections.sort(List<T> list, Comparator<? super T> c) | *Collections.reverseOrder()* |
|int Collections.binarySearch(Collection c, int index) | return index of the search key, if it is contained in the array; otherwise, (-(insertion point) – 1). Note, array must be sorted! |
| collections.reverse(List<T> list) | reverse |
| collections.swap | swap |
| collections.fill | fill |
|collections.min(List<T> list, Comparator<? super T> c) | min |
|collections.max(List<T> list, Comparator<? super T> c) | max |

collection sort example:  
```java
    public class MyClass {
    /* To be able to access them from your static methods they need to be static member variables */
    public static class Data { // start with upper letter!
        public int x;
        public int y;
        public Data(int X, int Y){
            this.x = X;
            this.y = Y;
        }
    }
    public static class DataCompare implements Comparator<Data> { // comparator
    public int compare(Data a, Data b){
        return a.x * a.y - b.x * b.y ; // compare according to x*y
        }
    }
    public static void main(String args[]) {
      List<Integer> lst = new ArrayList<>(Arrays.asList(1,3,2,5,4));
      Collections.sort(lst,Collections.reverseOrder());
      System.out.println(Arrays.toString(lst.toArray()));
      
      List<Data> lst2 = new ArrayList<>();
      lst2.add(new Data(10,5));
      lst2.add(new Data(1,10));
      lst2.add(new Data(5,8));
      Collections.sort(lst2, new DataCompare() );
      lst2.sort((source, target) -> {return (- source.x + source.y);}); // lambda function to sort by -x+y
    }
}
```

## 2.1 List interface
Elements have a specific order, and duplicate elements are allowed. Elements can be placed in a specific position.  
1. java.util.ArrayList  
2. java.util.LinkedList  

```java
public interface List<E> extends Collection<E>
```
This extends Collection and an instance of List stores an ordered collection of elements.  

```java
List a1 = new ArrayList();
List l1 = new LinkedList();
```

## 2.2 Stack interface
Stacks are created using java.util.Stack. 


## 2.3 Queue
1. java.util.LinkedList  
2. java.util.PriorityQueue  
2. java.util.ArrayDeque  

| Function | description |
| ----- | ----- |
| boolean add(E e) | Inserts the specified element into this queue |
| Type peek() | Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. |
| Type poll() | Retrieves and removes the head of this queue, or returns null if this queue is empty. |

# 2.4 Set
This extends Collection to handle sets, which must contain unique elements.  

```java
Set<Integer> set = new HashSet<Integer>();
```


# 2.5 Double-ended queue (deque) interfaces


Set interfaces


Map interfaces








### 4. Set

HashSet

TreeSet

LinkedHashSet




# 3. The Map Interface

HashMap
When you declare a HashMap object, you should use the Map interface as the datatype instead of HashMap
```java
Map<String,Integer> myMap = new HashMap<String,Integer>(); // allow you to change to a TreeMap implementation in the future by changing a single line of code!
HashMap<String,Integer> myMap = new HashMap<String,Integer>(); // not recommend
```


```java
put
get 
containsKey
```

TreeMap

LinkedHashMap



Exception Handling
