package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
  public static int maxWidth(Node root) {
    Queue<Node> q = new LinkedList<>();
    int max = Integer.MIN_VALUE;
    q.add(root);
    while (!q.isEmpty()) {
      int size = q.size();
      if (size >= max) {
        max = size;
      }
      for (int i = 0; i < size; i++) {
        Node curr = q.poll();
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }
    }
    return max;
  }
  public static void main(String[] args) {
    Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);
    	root.right.left=new Node(60);
      System.out.print(maxWidth(root));
  }
}
