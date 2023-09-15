package AVLTrees;

public class AVLTree {

    private class AVLNode {
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }
    }

    private AVLNode root;
    
    //#region Insertion using recuresion (efficient way)
    public void insert(int value) {
        root = insert(root, value); 
    }

    private AVLNode insert(AVLNode root, int value) {

        if (root == null)
            return new AVLNode(value);
        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);
        System.out.println(root.value);
        return root;
    }
    //#endregion
}
