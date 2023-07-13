package DS.Trees;

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
        
        System.out.println("done");
        System.out.println(tree.find(7));
        System.out.println(tree.find(11));

        System.out.println("Pre Order : ");
        tree.PreOrdertraversal();
        System.out.println("In Order : ");
        tree.InOrdertraversal();
        System.out.println("Post Order : ");
        tree.PostOrdertraversal();
        
        System.out.println("Height: " + tree.HeightOfTree());
        System.out.println("Maximum value in tree: " + tree.MaxOfBinaryTree());
        System.out.println("Maximum value: "+ tree.MaxOfBST());

    }
}
