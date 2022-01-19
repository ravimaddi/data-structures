package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
  int key;
  Node left, right;

  public Node(int item) {
    key = item;
    left = right = null;
  }
}

class BinaryTree {
  Node root;

  public BinaryTree() {
    root = null;
  }

  public void Inorder(Node node) {
    if (node == null) {
      return;
    }
    Inorder(node.left);
    System.out.print(node.key + "->");
    Inorder(node.right);
  }

  public void Preorder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.key + "->");
    Preorder(node.left);
    Preorder(node.right);
  }

  public void Postorder(Node node) {
    if (node == null) {
      return;
    }
    Postorder(node.left);
    Postorder(node.right);
    System.out.print(node.key + "->");
  }

  public int height(Node node) {
    if (node == null) {
      return 0;
    }
    return 1 + Math.max(height(node.left), height(node.right));
  }
  
  public int size(Node node) {
    if (node == null) {
      return 0;
    }
    return 1 + size(node.left) + size(node.right);
  }
   
  public void printKNode(Node node,int k) {
    if (node == null) {
      return;
    }
    if (k == 0) {
      System.out.print(node.key + " ");
    } else {
      printKNode(node.left, k - 1);
      printKNode(node.right, k-1);
    }

  }

  public void levelOrder(Node node) {
    if (node == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    q.add(null);
    while (q.size() > 1) {
      Node curr = q.poll();
      if (curr != null) {
        System.out.print(curr.key + " ");
      } else {
        System.out.print("\n");
        q.add(null);
        continue;
      }
      if (curr.left != null) {
        q.add(curr.left);
      }
      if (curr.right != null) {
        q.add(curr.right);
      }
    }
  }
  
  public void levelOrderLine(Node node) {
    if (node == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    while (!q.isEmpty()) {
      int s = q.size();
      for (int i = 0; i < s; i++) {
        Node curr = q.poll();
        System.out.print(curr.key + " ");
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }
      System.out.print("\n");
    }
  }
  
  public void leftView(Node node) {
    if (node == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    while (!q.isEmpty()) {
      int s = q.size();
      for (int i = 0; i < s; i++) {
        Node curr = q.poll();
        if (i == 0) {
          System.out.print(curr.key + " ");
        }
        if (curr.left != null) {
          q.add(curr.left);
        }
        if (curr.right != null) {
          q.add(curr.right);
        }
      }
      System.out.print("\n");
    }
  }

  static int maxLevel = 0;
  public void helper(Node node, int level) {
    if (node == null) {
      return;
    }
    if (maxLevel < level) {
      System.out.println(node.key);
      maxLevel = level;
    }
    helper(node.left, level + 1);
    helper(node.right, level+1);
  }
  public void leftViewRecu(Node node) {
    helper(node, 1);
  }
  public int maximumNode(Node node) {
    if (node == null) {
      return Integer.MIN_VALUE;
    }
    return Math.max(node.key, Math.max(maximumNode(node.left), maximumNode(node.right)));
  }
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(10);
    tree.root.left = new Node(20);
    tree.root.right = new Node(30);
    tree.root.left.left = new Node(40);
    tree.root.left.right = new Node(50);
    tree.root.right.left = new Node(60);
    tree.root.right.right = new Node(70);
    tree.Inorder(tree.root);
    System.out.println("\n");
    tree.Preorder(tree.root);
    System.out.println("\n");
    tree.Postorder(tree.root);
    System.out.println("\n");
    System.out.println(tree.height(tree.root));
    System.out.println("\n");
    System.out.println(tree.size(tree.root));
    System.out.println("\n");
    tree.printKNode(tree.root, 2);
    System.out.println("\n");
    tree.levelOrder(tree.root);
    System.out.println("\n");
    tree.levelOrderLine(tree.root);
    System.out.println("\n");
    System.out.println(tree.maximumNode(tree.root));
    System.out.println("\n");
    tree.leftView(tree.root);
    System.out.println("\n");
    tree.leftViewRecu(tree.root);
  }
}
