package tree_binary_reqursion_deep_search;

public class Main {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(20,
                new BinaryTree(7, new BinaryTree(
                        4,  null,
                                new BinaryTree(6,null, null)),
                        new BinaryTree(9,null,null)
                        ),
                new BinaryTree(35, new BinaryTree(31,
                                                    new BinaryTree(28,null,null),
                                                   null),
                        new BinaryTree(40,new BinaryTree(38,null,null),
                                                   new BinaryTree(52,null,null))
            )
        );

        System.out.println("Summ all tree's items:" + root.sum());
    }

}
