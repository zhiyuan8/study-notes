# 1. Character
Char is a primitive data type which has no methods. char.equals() cannot work!

| Character.function() |  Usage |
| ------ | ------ |
| bool Character.isDigit(char c) | check digit |
| bool Character.isLetter(char c) | check letter |
| bool isLetterOrDigit(char c) | check letter or digit |
| bool Character.isUpperCase(char c) | check upper |
| char Character.toUpperCase(char c) | to upper |
| bool Character.isLowerCase(char c) | check lower |
| char Character.toLowerCase(char c) | to lower |
| String Character.toString(char c) | to String |

# 2. String property

字符串可以和任意类型+



```java
String s = "abc"
bool a = true;
s += a; // get "abctrue" 
int age = 18;
System.out.println("I am " + age + 1 + "years old"); // I am 181 years old
```

# 2. String methods
String is object type, can use equals() and have methods.  

| Method |  Usage |
| ------ | ------ |
| toCharArray() | change to CharArray, applied in for-each loop |
| int charAt(int index) | get char at index |
| int length() | size() or length cannot work! |
| indexOf(int ch) | |
|lastIndexOf(int ch) | |