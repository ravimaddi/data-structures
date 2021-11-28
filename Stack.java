public class Stack { //stack implementation using array.
  int capacity;
  int[] arr;
  int top;

  Stack(int c) {
    capacity = c;
    arr = new int[capacity];
    top = -1;
  }

  public boolean push(int d) {
    if (top >= capacity) {
      return false;
    }
    arr[++top] = d;
    return true;
  }

  public int pop() {
    if (top < 0) {
      return -1;
    }
    return arr[top--];
  }

  public int size() {
    return top + 1;
  }

  public int peek() {
    return arr[top];

  }

  public boolean isEmpty() {
    return top == -1;
  }

  public static void main(String[] args) {
    Stack s = new Stack(10);
    System.out.println(s.push(1));
    System.out.println(s.push(2));
    System.out.println(s.push(3));
    System.out.println(s.push(4));
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.size());
    System.out.println(s.peek());
   


  }
}


 
