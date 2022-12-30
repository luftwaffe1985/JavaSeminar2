package Seminar2;

public class symmetricTree {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return symmetric(root.left, root.right);
        }
    }

    public boolean symmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null || left.val != right.val) {
            return false;
        } else {
            return symmetric(left.left, right.right) && symmetric(left.right, right.left);
        }
    }
}
