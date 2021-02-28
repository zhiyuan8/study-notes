# Java Basics


# 1. Basics
library
```java
import java.util.*
```

constant, 'final' means readonly field
```java
final int NUMROLLS = 1000000;
```

Math library
```java
Math.random(); Math.sqrt(); Math.max(); Math.abs();
```

Random library
```java
Random rand = new Random();
int die = rand.nextInt(6)+1;
```

Comparison, use 'equals'!
```java
String a = "123";
String b = "123";
if (a == b){...} // WRONG! 
if (a.equals(b)){...} // CORRECT!
```

enum
```java
enum Level { LOW, MEDIUM, HIGH }
Level x = Level.Low;
System.out.println(x); // prints 'LOW'
```

# 2. Arrays
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
System.out.println(Arrays.toString(arr)); // for print, get "[1, 1, 1, 1]"
```

# 3. List
```java
Collection<Type> name = new Collection<Type>(); // same initialization

–boolean add(E o)
–boolean contains(Object o)
–boolean remove(Object o)
–boolean isEmpty()
–int size()
–Iterator<E> iterator()
```

Iterator methods:
```java
Iterator<String> itr = myFriends.iterator();
```


hasNext() returns true if there are more elements to examine
next() returns the next element from the collection
remove() removes the last value returned by next()


### 3.1 ArrayList
The ArrayList class is a resizable array.



When you declare an ArrayList object, you should use the List interface as the datatype instead of ArrayList
```java
List<String> aList = new ArrayList<String>(); // allow you to change to a LinkedList implementation in the future by changing a single line of code!
ArrayList<String> aList = new ArrayList<String>(); // not recommend
```

### 3.2 LinkedList



### 4. Set

HashSet

TreeSet

LinkedHashSet




### 5. Map

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
