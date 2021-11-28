public class StackUsingLl {

 Node head;
 int size;
  
 StackUsingLl() {
   head = null;
   size = 0;
 }
  static class Node {
    int data;
    Node next;
    Node(int d) {
      data = d;
    }
  }
  
  public boolean push(int x) {
    Node temp = new Node(x);
    temp.next = head;
    head = temp;
    size += 1;
    return true;
  }
  
  public int pop() {
    int temp = head.data;
    head = head.next;
    size -= 1;
    return temp;
  }
  
  public int peek() {
    return head.data;
  }
  
  public int size() {
    return size;
  }
  
  public boolean isEmpty() {
    return size == 0;
  }
  public static void main(String[] args) {
    StackUsingLl s=new StackUsingLl();
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
