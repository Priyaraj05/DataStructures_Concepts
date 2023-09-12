

public class TreeMain {
    public static void main(String[] args) {
        ScratchTree tree = new ScratchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        
        // System.out.println("done");
        // System.out.println(tree.find(7));
        // System.out.println(tree.find(11));

        // System.out.println("Pre Order : ");
        // tree.PreOrdertraversal();
        // System.out.println("In Order : ");
        // tree.InOrdertraversal();
        // System.out.println("Post Order : ");
        // tree.PostOrdertraversal();
        
        System.out.println("Height: " + tree.HeightOfTree());
        System.out.println("Maximum value in tree: " + tree.MaxOfBinaryTree());
        System.out.println("Maximum value: " + tree.MaxOfBST());

        ScratchTree tree2 = new ScratchTree();
        tree2.insert(7);
        tree2.insert(5);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(16);
        tree2.insert(8);
        tree2.insert(10);
        
        if(tree.EqualityCheck(tree2)) 
            System.out.println("they are equal");
        else
            System.out.println("they are not equal");

        System.out.println(tree.isBST());
        System.out.println("Nodes: "+ tree.NodesAt_K_Distance(2));
    }
}
