package DS.Trees;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(1);
        tree.insert(8);
        System.out.println("done");
        System.out.println(tree.find(7));
        System.out.println(tree.find(1));
        System.out.println(tree.find(8));
        System.out.println(tree.find(9));
    }
}
