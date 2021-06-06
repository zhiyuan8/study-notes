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
 
# 2. pass by value
Java is always pass by value.  
When you pass a primitive it's a copy of the value, when you pass an object it's *a copy of the reference pointer*.  
BUT, if reference contains objects, then *the value of an object can be modified* in the method but not the entire object.  

# 2. Enums, do-while, for-each
## 2.1 Enums

## 2.1 Enums

