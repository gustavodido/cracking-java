package datastructures;

import common.TreeNode;
import common.TypedExercise;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/ctci-is-binary-search-tree

@SuppressWarnings("SimplifiableIfStatement")
class TreesIsBinarySearchTree implements TypedExercise<TreeNode> {
    public void solve(TreeNode root) {
        boolean isBinarySearchTree = isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        out.println(isBinarySearchTree ? "Yes" : "No");
    }

    private boolean isBinarySearchTree(TreeNode treeNode, int minValue, int maxValue) {
        if (treeNode == null) {
            return true;
        }

        if (treeNode.data <= minValue || treeNode.data >= maxValue) {
            return false;
        }

        return isBinarySearchTree(treeNode.left, minValue, treeNode.data) &&
                isBinarySearchTree(treeNode.right, treeNode.data, maxValue);
    }
}
