//----------------------------------------------------------------
// ArrayStack.java       by Dale/Joyce/Weems             Chapter 3
//
// Implements BoundedStackInterface using an array to hold the 
// stack elements.
//
// Two constructors are provided: one that creates an array of a 
// default size and one that allows the calling program to 
// specify the size.
//----------------------------------------------------------------

//package ch03.stacks;
import java.util.*;

public class ArrayStack<T> {
    protected final int DEFCAP = 100; // default capacity
    protected T[] stack;              // holds stack elements
    protected int topIndex = -1;      // index of top element in stack
    protected int size = 0;

    public ArrayStack() {
      stack = (T[]) new Object[DEFCAP];
    }

    public ArrayStack(int maxSize) {
      stack = (T[]) new Object[maxSize];
    }
    //If stack is full, throws StackOverflowException. Else places element at the top of this stack.
    public void push(T element) throws StackOverflowException {      
        if (isFull()) {
            throw new StackOverflowException("Push attempted on a full stack.");
        } else {
            topIndex++;
            size++;
            stack[topIndex] = element;
        }
    }
    // Throws StackUnderflowException if this stack is empty, else removes top element from this stack.
    public void pop() throws StackUnderflowException {                  
        if (isEmpty()){
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        } else {
            stack[topIndex] = null;
            topIndex--;
            size--;
        }
    }
    // Throws StackUnderflowException if this stack is empty otherwise returns top element from this stack.
    public T top() throws StackUnderflowException {   
        T topOfStack = null;      
        if (isEmpty()){
            throw new StackUnderflowException("Top attempted on an empty stack."); 
        } else {
            topOfStack = stack[topIndex];
        }
        return topOfStack;
    }
    //Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty() {              
      if (topIndex == -1) 
        return true;
      else
        return false;
    }
    //Returns true if this stack is full, otherwise returns false.
    public boolean isFull() {              
      if (topIndex == (stack.length - 1)) 
        return true;
      else
        return false;
    }
    //returns size of stack
    public int size() {
      return size;
    }
}