class LinkedList {
	Node head; 

    static class Node {
      int data;
      Node next;

      Node(int d) {
        data = d;
      }
    }

    public void printList() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
      System.out.print("\n");
    }

    public void addNodeAtFront(int new_data) {
      Node n = new Node(new_data);
      n.next = head;
      head = n;
    }
    
    public void addNodeAfterGivenNode(Node prev_Node, int new_data) {
      if (prev_Node == null) {
        System.out.println("Prev Node can not be null");
      }
      Node n = new Node(new_data);
      n.next = prev_Node.next;
      prev_Node.next = n;
    }

    public void addNodeAtTheEnd(int new_data) {
      Node new_Node = new Node(new_data);
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = new_Node;
      new_Node.next = null;
    }

    public void deleteNode(int data) {
      Node temp = head;
      Node prev_Node = null;
      while (temp != null && temp.data != data) {
        prev_Node = temp;
        temp = temp.next;

      }
      if (temp == null) {
        System.out.println("Given element not found");
      } else {
        prev_Node.next = temp.next;
      }
    }

    public void deleteNodeAtPosition(int position) {
      int count = 0;
      Node temp = head;
      if (head == null)
        return;
      if (position == 0) {
        head = temp.next;
        return;
      }
      while (temp != null && (count < position - 1)) {
        temp = temp.next;
        count++;
      }
      if (temp == null) {
        System.out.println("Given position is out of list range");
      }
      temp.next = temp.next.next;
    }

    public void deleteList()
    {
      head = null;
    }
    
    public int lengthOfListIterative() {
      int count = 0;
      Node temp = head;
      while (temp != null) {
        temp = temp.next;
        count++;
      }
      return count;
    }

    public int getCountRec(Node node) {
      if (node == null) {
        return 0;
      }
      return 1 + getCountRec(node.next);
    }

    public int getCount() {
      return getCountRec(head);
    }

    public void reverseList() {
      Node prev = null;
      Node curr = head;
      Node next = null;

      while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      head = prev;
    }

    // public Node reverseListRec() {
    //   if (head == null || head.next == null) {
    //     return head; 
    //   }
    // }
     
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.head = new Node(1);
      Node second = new Node(2);
      Node third= new Node(3);
      Node fourth= new Node(4);
      Node fifth = new Node(5);
      list.head.next=second;
      second.next=third;
      third.next=fourth;
      fourth.next = fifth;
      list.printList();
      list.addNodeAtFront(0);
      list.printList();
      list.addNodeAfterGivenNode(third, -3);
      list.printList();
      list.addNodeAtTheEnd(6);
      list.printList();
      list.deleteNode(-3);
      list.printList();
      list.deleteNodeAtPosition(3);
      list.printList();
      //list.deleteList();
      //list.printList();
      System.out.println(list.lengthOfListIterative());
      System.out.println(list.getCount());
      list.reverseList();
      list.printList();
  }
}
