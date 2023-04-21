package DS.Trees;



public class Tree {

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
            if(item > current.value  ){ 
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

    // overload to pass the private parameter root
    public void PreOrdertraversal(){
        PreOrdertraversal(root);
    }
    private void PreOrdertraversal(Node root){
        // root left right
        if(root == null)
            return; // end of recursion
        System.out.println(root.value);
        PreOrdertraversal(root.leftChild);
        PreOrdertraversal(root.rightChild);
    }
}
