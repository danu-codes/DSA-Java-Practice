# DSA Java Practice

Data Structures & Algorithms practice programs written in Java using Apache NetBeans.

## How to run

**NetBeans:** `File → Open Project`, pick any project folder, then press Run.

**Command line:**
```bash
cd Sorting/HeapSort
javac -d out $(find src -name "*.java")
java -cp out heapsort.HeapSort
```

## Projects

### Searching & Sorting
| Project | Description |
|---|---|
| [BinarySearch](Searching/BinarySearch) | Iterative binary search |
| [SortingAlgorithms](Sorting/SortingAlgorithms) | Bubble, selection and insertion sort |
| [HeapSort](Sorting/HeapSort) | Heap sort with user input |

### Stacks & Queues
| Project | Description |
|---|---|
| [StackUsingArray](Stacks/StackUsingArray) | String stack using an array |
| [GenericStack](Stacks/GenericStack) | Generic stack `GenericStack<T>` |
| [StackUsingLinkedList](Stacks/StackUsingLinkedList) | Int stack on a linked list |
| [ReverseArrayUsingStack](Stacks/ReverseArrayUsingStack) | Reverse an array with a stack |
| [BalancedParenthesesCheck](Stacks/BalancedParenthesesCheck) | Check `()`, `[]`, `{}` balance |
| [PostfixEvaluation](Stacks/PostfixEvaluation) | Evaluate postfix expressions |
| [CircularQueueUsingArray](Queues/CircularQueueUsingArray) | Circular queue using an array |

### Linked Lists, Trees & Recursion
| Project | Description |
|---|---|
| [SinglyLinkedList](LinkedLists/SinglyLinkedList) | Insert / delete at a position |
| [BinaryTreeTraversal](Trees/BinaryTreeTraversal) | Pre-, in-, post- and reverse-post-order |
| [Recursion](Recursion/Recursion) | Factorial and recursive array fill |

### Java Concepts & OOP Labs
| Project | Description |
|---|---|
| [ComparableExample](JavaConcepts/ComparableExample) | Natural ordering with `Comparable` |
| [ComparatorExample](JavaConcepts/ComparatorExample) | Custom ordering with `Comparator` |
| [Composition](JavaConcepts/Composition) | "Has-a" relationship |
| [Point2DAndComplex](OOPLabs/Point2DAndComplex) | Interfaces, 2D point transforms, complex numbers |
| [DragonCurve](OOPLabs/DragonCurve) | Swing dragon-curve drawing |