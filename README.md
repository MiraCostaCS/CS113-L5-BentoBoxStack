# Lab #5 - Implementing a BentoBox Class Using a Stack (Escalation Style)

## Lab Overview
In this lab, you will design a class called `BentoBox` that models a real-world food container. This class will store multiple `Food` items using the stack data structure, which follows a **Last-In, First-Out (LIFO)** behavior — just like how the last item placed in a box is the first to come out.

To build this, you will use your own custom stack implementation: `LinkedListStack`, which is based on Java’s `LinkedList`.

By the end of this lab, you will have practiced creating classes, managing collections, and applying fundamental stack operations.

## Learning Goals
By the end of this lab, you will:
*   Understand how stacks work and how they behave in LIFO order.
*   Practice creating custom data structures.
*   Learn how to model real-world objects in code.
*   Gain experience with interfaces and generics.

## Part 1: Building the `BentoBox` Class

### Step 1: Declare the `BentoBox` Class
*   Define a public class named `BentoBox`.
*   Import any other required classes, such as `LinkedListStack` and `Food`.
    
### Step 2: Declare an Instance Variable
*  Inside the `BentoBox` class, define a private instance variable: `private LinkedListStack foodItems;`
*  This stack will act as the internal container that holds `Food` objects.

### Step 3: Create the Constructor
*   Define a default constructor for the `BentoBox` class.
*   Inside the constructor, initialize the stack: `foodItems = new LinkedListStack<>();`

This ensures each `BentoBox` starts empty and ready to be filled with food.

### Step 4: Implement the `addFood(Food food)` Method
This method should:
*   Accept a `Food` object as a parameter.
*   Use `push(food)` to add it to the top of the stack.
*   Print a confirmation message, for example: `Sushi has been added to the Bento Box.`

_Note:_ Because a stack is LIFO, the newest food item will always be on top.

### Step 5: Implement the `removeFood()` Method
This method should:
*   Check if the stack is empty using `isEmpty()`.
*   If not empty:
  *   Use `pop()` to remove.
  *   Print a message indicating which item was removed.
  *   Return the popped item.
*   If empty:
  *   Print: `The Bento Box is empty. Nothing to remove.`
  *   Return `null`.

This simulates removing the last item added to the BentoBox.

### Step 6: Implement the `peekFood()` Method
This method should:
*   Check if the stack is empty.
*   If not empty, return the top item using `peek()` (without removing it).
*   If empty, print a message and return `null`.

This is like checking the top layer of the `BentoBox` without taking anything out.

### Step 7: Implement the `isEmpty()` Method
This method should return the result of `foodItems.isEmpty()`.

It tells you whether your `BentoBox` currently contains any food.

### Step 8: Implement the `getFoodCount()` Method
This method should:
*   Return the number of items currently in the stack using `foodItems.size()`.
*   If the `LinkedListStack` class does not already have a `size()` method, implement it.

### Step 9: Implement the `displayItems()` Method
This method should:
*   First check if the `BentoBox` is empty.
*   If empty, print: `The Bento Box is empty.`
*   If not empty, print: `Bento Box contents:  +---------------------+`
  *   Loop through each food item using a for-each loop.
  *   For each item, call the `display()` method from the `Food` class to print a formatted view.
  *   Add a separator line after each food for readability.
    

## Part 2: Creating the `LinkedListStack` Class

### Purpose
The `LinkedListStack` class implements a generic stack using Java’s built-in `LinkedList`. It supports standard stack operations:
*   `push()`
*   `pop()`
*   `peek()`
*   `isEmpty()`
*   `size()` (optional but recommended)

### Step 1: Declare the Class
`   public class LinkedListStack implements StackInterface   `

### Step 2: Add Instance Variable
`   private LinkedList stack;   `

### Step 3: Create the Constructor
Initialize the stack to an empty `LinkedList` inside the default constructor.

### Step 4: Implement the Methods
*   `isEmpty()`: Return `true` if the stack is empty, otherwise `false`.
*   `peek()`: Return the top element without removing it (use `getFirst()`).
*   `pop()`: Remove and return the top element (use `removeFirst()`).
*   `push(E obj)`: Add an element to the top of the stack (use `addFirst(obj)`).
*   `size()` (optional but recommended): Return the number of elements in the stack.

## Part 3: Defining the `StackInterface`
### Purpose
This interface ensures that any class implementing a stack must include the four basic stack operations.

### Step 1: Declare the Interface
`   public interface StackInterface   `

### Step 2: Declare the Methods
Inside the interface, declare the following method signatures (no bodies):
```java
boolean isEmpty();
E peek();
E pop();
E push(E obj);
```

## Wrap-Up and Testing
Once all classes are implemented:
*   Test your `BentoBox` by:
  *   Creating a new instance.
  *   Adding several `Food` items.
  *   Using all the methods (`add`, `remove`, `peek`, `isEmpty`, `getFoodCount`, `displayItems`).
*   Ensure proper error handling and user-friendly outputs.
