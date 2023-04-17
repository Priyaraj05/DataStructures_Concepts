package DS.Trees;



public class Tree {

    private Node root;
    
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        Node(int value){
            this.value = value;
            rightChild = leftChild = null;
        }

        @Override
        public String toString() {
            return "Node="+value;
        }    
    }
    

    public void insert(int item) { // 5
        if (root == null)
            root = new Node(item);

        var current = root; //7
        while (true) { //7 4 6
            if(current.value < item){ //7>5 4<5 6>5
                if(current.rightChild != null) //6!=null
                    current = current.rightChild; //6
                
                current.rightChild = new Node(item); 
                break;
            }
            else{         //7>5 6>5
                if(current.leftChild != null) //4!=null 
                    current = current.leftChild;//4

                current.leftChild = new Node(item);//5 
                break;  
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
}
