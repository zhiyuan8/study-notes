# 1 heap space (global)
When an *object* is created, it is always created in Heap and has global access. That means all objects can be referenced from anywhere in the application.  
new出来的对象，存储在堆空间（heap space）上   
```java
List<Integer> intList = new ArrayList<Integer>();
```
*Garbage collection* works to free memory by clearing any by objects without any references in the methods. These are objects that are no longer being used. Clearing them ensures they don’t take up space in the Heap.  
Young-generation, old-generation helps prioritize objects for garbage collection by dividing Java Heap Space into two generations.  

# 2 stack space (temporary)
This is the *temporary memory* where variable values are stored when their *methods* are invoked. After the method is finished, the memory containing those values is cleared to make room for new methods.  

# 3 key differences
<ol>
<li> Java Heap Space is used throughout the application, but Stack is only used for the method — or methods — currently running. </li>
<li> The Heap Space contains all objects are created, but Stack contains any reference to those objects. </li>
<li>Objects stored in the Heap can be accessed throughout the application. Primitive local variables are only accessed the Stack Memory blocks that contain their methods. </li>
<li> Memory allocation in the Heap Space is accessed through a complex, young-generation, old-generation system. Stack is accessed through a last-in, first-out (LIFO) memory allocation system. </li>
<li> Heap Space exists as long as the application runs and is larger than Stack, which is temporary, but faster. </li>