package datastructures;

import common.Node;
import common.TypedExercise;

import static java.lang.System.out;

@SuppressWarnings("SimplifiableIfStatement")
class TreesIsBinarySearchTree implements TypedExercise<Node> {
    public void solve(Node root) {
        boolean isBinarySearchTree = isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        out.println(isBinarySearchTree ? "Yes" : "No");
    }

    private boolean isBinarySearchTree(Node node, int minValue, int maxValue) {
        if (node == null) {
            return true;
        }

        if (node.data <= minValue || node.data >= maxValue) {
            return false;
        }

        return isBinarySearchTree(node.left, minValue, node.data) &&
                isBinarySearchTree(node.right, node.data, maxValue);
    }
}
