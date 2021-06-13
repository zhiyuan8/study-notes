# 1 ArrayList
The ArrayList class is a resizable array. ArrayList in Java can be seen as similar to vector in C++.  
When you declare an ArrayList object, you should use the List interface as the datatype instead of ArrayList.  

*Initialization* : (1) Arrays.asList (2) List.of (3) add (4) another collection

| method      | Description |
| ----------- | ----------- |
|int it.indexOf(E element) | return 1st occurence of element,  -1 if this list does not contain the element. |
|int it.lastIndexOf(E element) | return last occurence of element |
|void it.get(int index) | index |
|void it.set(int index, E element) | set |
|boolean it.addAll(int index, Collection c)| append from index |
|void removeRange(int fromIndex,int toIndex) | remove index [fromIndex, toIndex) |
|boolean removeAll(Collection c) | remove all occurence of c |
|boolean retainAll(Collection c)| Retains only the elements in this list that are contained in the specified collection |
|boolean removeIf(Predicate<? super E> filter)| Removes all of the elements of this collection that satisfy the given predicate |
|void replaceAll(String regex, String replacement) | replace regrex by replacement, used in String commonly |
|int Collections.binarySearch(Collection c, int index) | return index of the search key, if it is contained in the array; otherwise, (-(insertion point) – 1). Note, array must be sorted! |

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

# 2 Linkedlist



# 3 Vector