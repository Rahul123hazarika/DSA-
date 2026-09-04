## String :
String is a sequence of of character. 

```
"hello"
```
This string contains 5 characters:
```
Index:      0   1   2   3   4
Character:  h   e   l   l   o
```
A string can contain:
```
Letters
Digits
Spaces
Symbols
Special characters
```
## String Concatenation :
String concatenation in Java is the operation of joining two or more strings together to form a brand-new string.
```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName; 
System.out.println(fullName); // Output: John Doe
```
## Comparison of Pattern Matching Algorithms

| **Algorithm**   | **Time Complexity** | **Best For**                                  |
| --------------- | ------------------- | --------------------------------------------- |
| **Naive**       | `O(nm)`             | Small inputs                                  |
| **KMP**         | `O(n + m)`          | Deterministic exact matching                  |
| **Rabin-Karp**  | Expected `O(n + m)` | Hashing and matching many patterns/substrings |
| **Z Algorithm** | `O(n + m)`          | Prefix-heavy matching                         |

## String Operations Complexity
| **Operation**                  | **Time Complexity** |
| ------------------------------ | ------------------- |
| Access character by index      | O(1)                |
| Traverse string                | O(n)                |
| Compare two strings            | O(n)                |
| Search substring naively       | O(n × m)             |
| Create substring               | O(k)                |
| Concatenate strings repeatedly | O(n²)               |
| Convert string to list         | O(n)                |
| Sort characters                | O(n log n)          |

