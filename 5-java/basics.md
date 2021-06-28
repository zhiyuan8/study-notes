# Java Basics
refer documents: https://www.tutorialspoint.com/java/index.htm

Sun released the first public implementation as Java 1.0 in 1995. It promised Write Once, Run Anywhere (WORA), providing no-cost run-times on popular platforms.  

On 13 November, 2006, Sun released much of Java as free and open source software under the terms of the GNU General Public License (GPL).  

On 8 May, 2007, Sun finished the process, making all of Java's core code free and open-source, aside from a small portion of code to which Sun did not hold the copyright. 

Java supports:
*Polymorphism* −
*Inheritance* −
*Encapsulation* −
*Abstraction* −
*Object* − An object is an instance of a class.
*Class* − A class can be instantiated to be objects by new keyword.
*Instance Variables* − Each object has its unique set of instance variables. 
*Methods* − A method is function.
*Message Passing* −  

# 1. HelloWorld
Java program processing starts from the main() method which is a mandatory part of every Java program.
```java
public class HelloWorld {
	public static void main(String[] args){
		System.out.println("Hello World");
	}
}
```
In terminal. compile and run
```
javac HelloWorld.java  // HelloWorld.class is generated
java HelloWorld
```

Assign value in 1 line:
```java
int a = 4, b = a+1, c=b*b;
```
# 2. pass by value, always shallow copy
Java is always pass by value.  
When you pass a primitive it's a copy of the value, when you pass an object it's *a copy of the reference pointer*.  
BUT, if reference contains objects, then *the value of an object can be modified* in the method but not the entire object.  
for example: ```List<Integer>```


# 3 main
To add memeber class within 1 java.class file, 2 methods:  
1. static  
```java
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Data d = new Data(1,2);
	}
	public static class Data { // way 1: add static
		int x;
		int y;
		public Data(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
```
2. create an instance-level factory-method  
```java
import java.util.*;
public class test2 {
	public class Data {
		int x;
		int y;
		public Data(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	Data createData(int x, int y){
		return new Data(x,y);
	}
	public static void main(String[] args){
        test2 test = new test2(); // way 2: step 1, create an instance of own class
		Data data = test.createData(1,2); //  way 2: step 2, use method to create Data class
	}
}
```

# 4. wrapper class
Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.

| Primitive types | wrapper class |
| char | Character |
| byte | Byte |
| short | Short |
| int| Integer |
| long | Long |
| float | Float |
| double | Double |
| bool | Boolean |

*Autoboxing* : primitive to wrapper:
Method 1: *add*
```java
		int[] array = new int[] { 1, 2, 3 }; // use []
		List<Integer> arrayList = new ArrayList<>(); // use <>
		for (int a:array){
			arrayList.add(a);
		}
		System.out.println( Arrays.toString( ( arrayList.toArray() ) ) );
```

*unboxing* : wrapper to primitive
Method 1: *get*
```java
		int[] array2 = new int[3];
		for (int i=0; i<arrayList2.size(); i++){
			array[i] = arrayList.get(i);
		}
		System.out.println( Arrays.toString( ( array ) ) );
```

# 5. math & magic number

| method      | Description |
| ----------- | ----------- |
| double Math.pow(double a,double b) | use '(int)pow(i,2)' to convert return type |
| double Math.exp(double d) | e^d |
| Math.max, Math.min, Math.abs | max, min, abs |
| Integer.MAX_VALUE | 2^31 - 1 |
| Integer.MIN_VALUE | -2^31 |


# 6. Enums, do-while, for-each
## 6.1 Enums

## 6.2 do-while

## 6.3 for-each
