
 class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

}

public class BinaryTree {

    static int idx = -1;

    public static Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;

    }

    public static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.data + "");
        inorder(node.right);
    }

    public static void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data + "");
    }

    public static void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + "");
        preorder(node.left);
        preorder(node.right);

    }

    public static int heightOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }

        int lHeight = heightOfBinaryTree(root.left);
        int rHeight = heightOfBinaryTree(root.right);

        return Math.max(lHeight, rHeight) + 1;

    }

    public static boolean SearchNode(Node root, int key) {
        if (root == null) {
            return false;

        }
        if (root.data == key) {
            return true;
        }

        boolean res1 = SearchNode(root.left, key);
        if (res1) {
            return true;
        }
        boolean res2 = SearchNode(root.right, key);
        return res2;

    }

    public static int countOfNodes(Node root){
        if(root==null){
            return 0;

        }
        int lc= countOfNodes(root.left);
        int rc= countOfNodes(root.right);
        return lc+rc+1;


    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;


        }
        int leftSum= sumOfNodes(root.left);
        int rightSum= sumOfNodes(root.right);
        return leftSum+rightSum+ root.data;
    }
    public static void main(String[] args) {
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();         
        Node root = tree.buildTree(nodes);

        System.out.println("Postorder:");
        postorder(root);

        System.out.println("Preorder:");
        preorder(root);

        System.out.println("Inorder:");
        inorder(root);

        System.out.println("Height of Binary Tree is :");
        System.out.println(heightOfBinaryTree(root));
        System.out.println("Total Nodes in tree is:"+ countOfNodes(root));
        System.out.println("Sum of Nodes in tree is:"+ sumOfNodes(root));

        int key = -19;

        if (SearchNode(root, key)) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }

}
