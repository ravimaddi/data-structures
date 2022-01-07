package LinkedList;
public class ReverseList {
  Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
    }
  }

  public void printList(Node list) {
    Node temp = list;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.print("\n");
  }

  public Node reverseList(Node list) {
    Node curr = list;
    Node prev = null;
    Node next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    list = prev;
    return list;
  }

  public boolean compare(Node first, Node second){
    while (first != null && second != null) {
      if (first.data == second.data) {
        first = first.next;
        second = second.next;
      } else {
        return false;
      }
    }
    return true;
  }
    
  public boolean checkPalindrome() {
    Node prev_slow = null;
    Node prev = head;
    Node fast = head;
    Node mid = null;
    Node secondList = null;
    if (head == null || head.next == null) {
      return true;
    }
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      prev_slow = prev;
      prev = prev.next;
    }
    if (fast != null) {
      mid = prev;
      prev = prev.next;
    }
    secondList = prev;
    prev_slow.next = null;
    printList(head);

    secondList = reverseList(secondList);
    printList(secondList);
    boolean res = compare(head, secondList);
    secondList = reverseList(secondList);
    if (mid != null) {
      prev_slow.next = mid;
      mid.next = secondList;
    } else {
      prev_slow.next = secondList;
    }
    return res;

  }
  
  public void removeDuplicates() {
    Node temp = head;
    Node curr = head;
    while (temp != null) {
      temp = temp.next;
      while (temp != null && temp.data == curr.data) {
        temp = temp.next;
      }
      curr.next = temp;
      curr = temp;
    }
  }
  
  public void removeDupUnSorted() {
    if (head == null || head.next == null) {
      return;
    }
    Node curr = head;
    while (curr != null) {
      Node temp = curr;
      while (temp.next != null) {
        if (temp.next.data == curr.data) {
          temp.next = temp.next.next;
        } else {
          temp = temp.next;
        }
      }
      curr = curr.next;
    }

  }

  public void swap(Node a, Node b) {
    Node temp = a;
    a = b;
    b = temp;
  }


  public void swapTwoNodes(int a, int b) {
    if (a == b) {
      return;
    }
    if (head == null) {
      return;
    }
    Node x = null, y = null;
    Node temp=head;
    while (temp.next != null) {
      if (temp.next.data == a) {
        x = temp;
      } else if (temp.next.data == b) {
        y = temp;
      }
      temp = temp.next;
    }
      
    if (x != null && y != null) {
      Node temp1 = x.next;
      x.next = y.next;
      y.next = temp1;
      temp1 = x.next.next;
      x.next.next = y.next.next;
      y.next.next = temp1;
    }
    
  }




  public static void main(String[] args) {
    ReverseList list = new ReverseList();
    list.head = new Node(0);
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    list.head.next = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    list.printList(list.head);
    //list.removeDuplicates();
    
    list.removeDupUnSorted();
    list.swapTwoNodes(2, 4);
    list.printList(list.head);
    //System.out.println(list.checkPalindrome());
  }
}
