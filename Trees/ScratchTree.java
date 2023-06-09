package DS.Trees;

import java.security.Provider;

public class ScratchTree {

    private Node root;
    
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        Node(int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node="+value;
        }    
    }
    

    public void insert(int item) { 
        var node = new Node(item);

        if (root == null){
            root = node;
            return;
        }
            

        var current = root; 
        while (true) { 
            if(item > current.value){ 
                if(current.rightChild == null){ 
                    current.rightChild = node; 
                    break;
                }
                current = current.rightChild;
            }
            else{         
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;     
            }
        }
    }
    

    public boolean find(int value) {
        if(root == null)
            throw new IllegalStateException();
        
        var current = root;
        while(current != null){
            if(current.value == value)
                return true;
            else if(current.value < value)
                current = current.rightChild;
            else if(current.value > value)
                current = current.leftChild;
        }
        return false;
    }

    // overload to pass the private parameter -  root
    public void PreOrdertraversal(){
        PreOrdertraversal(root);
    }
    
    /*         7
     *   4          9
     * 1    6    8      10
    */
    private void PreOrdertraversal(Node root){
        // root left right
        if(root == null)
            return; // end of recursion
        System.out.println(root.value);
        PreOrdertraversal(root.leftChild);
        PreOrdertraversal(root.rightChild);
    }

    public void InOrdertraversal(){
        InOrdertraversal(root);
    }
    private void InOrdertraversal(Node root){
        // Left root right
        if(root == null)
            return;

        InOrdertraversal(root.leftChild);  
        System.out.println(root.value);
        InOrdertraversal(root.rightChild);
        
    }

    public void PostOrdertraversal(){
        PostOrdertraversal(root);
    }
    private void PostOrdertraversal(Node root){
        // Left right root
        if(root == null)
            return;

        PostOrdertraversal(root.leftChild);  
        PostOrdertraversal(root.rightChild);
        System.out.println(root.value);
        
    }

    // height of the tree
    public int HeightOfTree(){
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
    // To find a maximum value in the Binary Search Tree-> O(log N)

    public int MaxOfBST() {
        return MaxOfBST(root);
    }

    private int MaxOfBST(Node root) {
        var current = root;
        var last = current;
        while(current!= null){
            last = current;
            current = current.leftChild;
        }
        return last;
    }
    
    
    // To find a maximum value in the Binary Tree-> O(N)

    public int MaxOfBinaryTree() {
        return MaxOfBinaryTree(root);
    }

    private int MaxOfBinaryTree(Node root) {
        if(isLeaf(root))
            return root.value;

        var leftMax = MaxOfBinaryTree(root.leftChild);
        var rightMax = MaxOfBinaryTree(root.rightChild);
        return Math.max(Math.max(leftMax, rightMax),root.value);
    }

    public boolean isLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }
}
