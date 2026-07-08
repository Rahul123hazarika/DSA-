#                                             LINKED LIST
A linked list is a linear data structure made of nodes.
Each node usually contains two things:
```
1. data/value
2. pointer/reference to the next node
```
Example:
```
10 → 20 → 30 → 40 → None
```
### what is node ?
A node is the basic building block of a linked list.
In a singly linked list, each node has:
```
Node:
+-------+------+
| value | next |
+-------+------+
|  23   |  o---|---->
+-------+------+
```
### Linked List vs Array
| Feature              | Array                  | Linked List                          |
|----------------------|------------------------|--------------------------------------|
| Memory               | Continuous             | Non-continuous                       |
| Access by index      | O(1)                   | O(n)                                 |
| Insert at beginning  | O(n)                   | O(1)                                 |
| Delete at beginning  | O(n)                   | O(1)                                 |
| Extra memory         | Less                   | More (because of pointers)           |
| Cache friendly       | Yes                    | Usually no                           |
----------------------------------------------------------------------------------------

## Types of Linked List
### 1.Singly Linked List
Each node points only to the next node.
```
10 → 20 → 30 → None
```
Node contains:
```
value
next
```
## 2.Doubly Linked List
Each node points to both previous and next nodes.
```None ← 10 ⇄ 20 ⇄ 30 → None```
Node contains:
```
value
prev
next
```
### 3. Circular Linked List
The last node points back to the first node.
```
10 → 20 → 30
↑         ↓
← ← ← ← ←
```
There is no None at the end.
Circular linked lists are useful in round-robin style problems.
## Linked List Operations
### Traversal:
Traversal means visiting each node one by one.
[Click here to view linkedlist traversal code ](DSA/LinkedList/LinkedListTraveral.java)
