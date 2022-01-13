package Strings;


public class Tree2Str {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static String tree2Str(TreeNode root) {
        if (root == null) return "";

        if (root.left == null && root.right == null)
            return String.valueOf(root.val);
        else if (root.left != null && root.right == null)
            return root.val + "(" + tree2Str(root.left) + ")";
        else if (root.left != null && root.right != null)
            return root.val + "(" + tree2Str(root.left) + ")" + "(" + tree2Str(root.right) + ")";
        else
            return root.val + "()" + "(" + tree2Str(root.right) + ")";
    }
}
