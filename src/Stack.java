import java.util.ArrayList;

/**
 * Class below is the stack class. It's used to maintain an arrays of stack.
 * 
 * @author Azky Mubarack
 */

public class Stack {
  int top = -1;
  static final int max = 150;
  char[] stak = new char[max];


  public void push(char i) {
    if (top > max) {
      System.out.println("Stack if full");
    } else {
      stak[++top] = i;
      System.out.println("Pushed to stack " + i);
    }
  }

  public char pop() {

    if (!isEmpty()) {
      System.out.println("Popped from stack: " + stak[top]);
      return stak[top--];
    } else {
      System.out.println("Stack is empty");
      return 0;
    }


  }

  public boolean isEmpty() {

    if (top < 0) {
      System.out.println("stack is empty");
      return true;
    } else {
      return false;
    }
  }

  public char stackTop() {
    return stak[top];
  }


}
