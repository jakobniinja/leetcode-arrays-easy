package Strings;

import java.util.ArrayList;
import java.util.List;

public class BinaryThreePath {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


    public static List<String> binaryThreePath(TreeNode root) {
        List<String> ans = new ArrayList<>();
        solve(root, ans, "");
        return ans;
    }

    private static void solve(TreeNode root, List<String> ans, String str) {
        if (root == null) return;
        if(root.left == null && root.right == null){
            ans.add(str + root.val);
            return;
        }
        solve(root.left, ans, str + root.val + "->");
        solve(root.right, ans, str + + root.val +  "-> ");
    }

    public static void main(String[] args) {
//        TreeNode root = new {1,2,3,null,5};
//        System.out.println(binaryThreePath(root));
    }
}
