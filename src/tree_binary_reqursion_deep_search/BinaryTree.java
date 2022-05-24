package tree_binary_reqursion_deep_search;

public class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public int sum() {
        int sum = value;
        if (left != null) {
            sum += left.sum();
        }
        if (right != null) {
            sum += right.sum();
        }
        return sum;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }
}
