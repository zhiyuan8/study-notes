# 1 ArrayList
The ArrayList class is a resizable array. ArrayList in Java can be seen as similar to vector in C++.  
When you declare an ArrayList object, you should use the List interface as the datatype instead of ArrayList.  

*Initialization* : (1) Arrays.asList (2) List.of (3) add (4) another collection

| method      | Description |
| ----------- | ----------- |
|int it.size() | return length |
|int it.indexOf(E element) | return 1st occurence of element,  -1 if this list does not contain the element. |
|int it.lastIndexOf(E element) | return last occurence of element |
|void it.get(int index) | index |
|void it.set(int index, E element) | set |
|boolean it.isEmpty() | check size == 0|
|boolean it.add(E o) | append to last |
|boolean it.addAll(Collections<E> o) | append collection to last |
|boolean it.addAll(int index, Collection c)| append from index |
|boolean it.containsAll(Collection c) | check collection c|
|boolean it.remove(Object o) | delete object o|
|void removeRange(int fromIndex,int toIndex) | remove index [fromIndex, toIndex) |
|boolean it.removeAll(Collection c) | remove all occurence of c |
|boolean it.retainAll(Collection c)| Retains only the elements in this list that are contained in the specified collection |
|boolean it.removeIf(Predicate<? super E> filter)| Removes all of the elements of this collection that satisfy the given predicate |
|void it.replaceAll(String regex, String replacement) | replace regrex by replacement, used in String commonly |

```java
// Way 1: List<Type> obj = new ArrayList<>(Arrays.asList(A, B, ...));
List<Double> list = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));

// Way 2: 
List<Double> listTemp = new ArrayList<>();
listTemp.add(1.0);
listTemp.add(2.0);

// way 3: List<Type> obj = new ArrayList<>(List.of(A, B, ...));
List<Double> gfg = new ArrayList<>(List.of(1.0, 2.0, 3.0));

// way 4: use another collection
List<Double> list3 = new ArrayList<>(list);
System.out.println("create from another list, list3 = " + Arrays.toString(list3.toArray()));

// removeIf example
list.removeIf(n -> (n % 3 == 0));

// binarySearch
int idx = Collections.binarySearch(list,5.0);
System.out.println( "Binary Search 5.0, idx = " + idx);
```

Iterator methods:  
```java
Iterator<String> itr = myFriends.iterator();
```
| method      | Description |
| ----------- | ----------- |
|boolean it.hasNext() | returns true if there are more elements to examine |
|int it.next() | returns the next element from the collection |
|void it.remove() | removes the last value returned by next() |

``` java
List<int> nums = new ArrayList<int>(Arrays.asList(1,2,3,4,5,6,7,8));
Iterator<String> it = nums.iterator(); // Get the iterator
while(it.hasNext()) { // hasNext() & next()
		System.out.println(it.next());
}
```

# 2 Linkedlist



# 3 Vector