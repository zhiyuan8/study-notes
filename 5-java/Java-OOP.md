# Java OOP (Inherience, Overloading, Phr)

*Local variables* − Variables defined inside methods.
*Instance variables* − Instance variables are variables within a class but outside any method.
*Class variables* − Class variables are variables declared within a class, outside any method, with the *static* keyword.

# 1. Class Grammar
state
field
instance variable
object / instance
static, public: A static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects.  
final: If you don't want other classes to inherit from a class, use the final keyword

```java
public class Main {
  int x;
  public Main(int x) { // Constructor with a parameter
    this.x = x;
  }
}
```

# 2. Overloading

```java
class name<T1,T2,...,Tn> {
	private T1 XXX;
}
```


# 3. Inheritence

```java
super()

```

# 4. Abstraction
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

An interface is a completely "abstract class" that is used to group related methods with empty bodies:

```java

// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}
class Pig implements Animal { // Pig "implements" the Animal interface
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}
```