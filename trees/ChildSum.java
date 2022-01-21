package trees;


public class ChildSum {
  
  public static boolean cSum(Node node) {
    if (node == null) {
      return true;
    }
    if (node.left == null && node.right == null) {
      return true;
    }
    int sum = 0;
    if (node.left != null) {
      sum += node.left.key;
    }
    if (node.right != null) {
      sum += node.right.key;
    }
    return sum == node.key && cSum(node.left) && cSum(node.right);
  }

  public static void main(String[] args) {
    Node tree = new Node(20);
    tree.left = new Node(8);
    tree.right = new Node(12);
    // tree.left.left = new Node();
    // tree.left.right = new Node(50);
    tree.right.left = new Node(3);
    tree.right.right = new Node(9);
    System.out.print(ChildSum.cSum(tree));
  }

}
