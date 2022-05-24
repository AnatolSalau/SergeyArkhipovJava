package tree_binary_iteration_deep_search;


import tree_binary_reqursion_deep_search.BinaryTree;

public class SummingTreeValuesRecursion {
    public static int sumRecursion(BinaryTree rootTree) {
        int sum = rootTree.getValue();
        if (rootTree.getLeft() != null) {
            sum += rootTree.getLeft().sum();
        }
        if (rootTree.getRight() != null) {
            sum += rootTree.getRight().sum();
        }
        return sum;
    }
}
