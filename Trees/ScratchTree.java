

import java.security.Provider;
import java.util.ArrayList;

public class ScratchTree {

    private Node root;

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }
//#region insert node
    public void insert(int item) {
        var node = new Node(item);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (item > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            } else {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
        }
    }
    //#endregion

//#region find node
public boolean find(int value) {
    if (root == null)
        throw new IllegalStateException();

    var current = root;
    while (current != null) {
        if (current.value == value)
            return true;
        else if (current.value < value)
            current = current.rightChild;
        else if (current.value > value)
            current = current.leftChild;
    }
    return false;
}
//#endregion

//#region Traversal

    // overload to pass the private parameter -  root
    public void PreOrdertraversal() {
        PreOrdertraversal(root);
    }

    /*         7
     *   4          9
     * 1    6    8      10
    */
    private void PreOrdertraversal(Node root) {
        // root left right
        if (root == null)
            return; // end of recursion
        System.out.println(root.value);
        PreOrdertraversal(root.leftChild);
        PreOrdertraversal(root.rightChild);
    }

    public void InOrdertraversal() {
        InOrdertraversal(root);
    }

    private void InOrdertraversal(Node root) {
        // Left root right
        if (root == null)
            return;

        InOrdertraversal(root.leftChild);
        System.out.println(root.value);
        InOrdertraversal(root.rightChild);

    }

    public void PostOrdertraversal() {
        PostOrdertraversal(root);
    }

    private void PostOrdertraversal(Node root) {
        // Left right root
        if (root == null)
            return;

        PostOrdertraversal(root.leftChild);
        PostOrdertraversal(root.rightChild);
        System.out.println(root.value);

    }
    //#endregion
    
//#region height of the tree
    public int HeightOfTree() {
        int height = HeightOfTree(root);
        return height;
    }

    private int HeightOfTree(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(HeightOfTree(root.leftChild),
                HeightOfTree(root.rightChild));
    }
    //#endregion
    
//#region Find max value
    // To find a maximum value in the Binary Search Tree-> O(log N)

    public int MaxOfBST() {
        return MaxOfBST(root);
    }

    private int MaxOfBST(Node root) {
        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last.value;
    }

    // To find a maximum value in the Binary Tree-> O(N)

    public int MaxOfBinaryTree() {
        return MaxOfBinaryTree(root);
    }

    private int MaxOfBinaryTree(Node root) {
        if (isLeaf(root))
            return root.value;

        var leftMax = MaxOfBinaryTree(root.leftChild);
        var rightMax = MaxOfBinaryTree(root.rightChild);
        return Math.max(Math.max(leftMax, rightMax), root.value);
    }
    //#endregion
   
    public boolean isLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }

//#region Find if two trees are equal

    /* Tree Equality Checking  ----- O(N)
     * Checks if two given trees are same and identical
     * Uses pre-order traversal
     * example 
     * Tree 1 :               Tree 2: 
     *     1                        1  
     *   /   \                    /   \
     *  2     3                  2     1
     * Order - [1,2,3]         Order -[1,2,1]
     * They are not equal
     */
    public boolean EqualityCheck(ScratchTree other) {
        if (other == null)
            throw new NullPointerException();
        return EqualityCheck(root, other.root);
    }

    private boolean EqualityCheck(Node firstRoot, Node secondRoot) {
        if (firstRoot == null && secondRoot == null)
            return true;

        if (firstRoot != null && secondRoot != null) {
            return (firstRoot.value == secondRoot.value)
                    && (EqualityCheck(firstRoot.leftChild, secondRoot.leftChild))
                    && (EqualityCheck(firstRoot.rightChild, secondRoot.rightChild));
        }

        return false;
    }
    //#endregion

//#region Find if given tree is BST

    public boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean isBST(Node root, int min, int max) {
        if(root == null)
           return true;
        if(root.value< min || root.value > max)
            return false;
        return isBST(root.leftChild, min, root.value - 1)
            && isBST(root.rightChild, root.value + 1, max);
    }
    //#endregion

//#region Get all the nodes at k distance from root

    public ArrayList<Integer> NodesAt_K_Distance(int distance) {
        ArrayList<Integer> list = new ArrayList<>();
        NodesAt_K_Distance(root, distance, list);
        return list;
    }
    
    private void NodesAt_K_Distance(Node root, int distance, ArrayList<Integer> list) {
        if (root == null)
            return;
        if (distance == 0) {
            list.add(root.value);
            return;        
        }
        
        NodesAt_K_Distance(root.leftChild, --distance, list);
        NodesAt_K_Distance(root.rightChild, distance, list);
    }
    //#endregion


}
