package trees;

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
  }
}
