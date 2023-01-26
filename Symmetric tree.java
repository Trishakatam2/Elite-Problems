/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean isequal(TreeNode ls, TreeNode rs){
        if (ls == null && rs == null){
            return true;
        }
        if (ls == null || rs == null || ls.val != rs.val){
            return false;
        }
        return isequal(ls.left, rs.right) && isequal(ls.right, rs.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isequal(root.left, root.right);
    }
}
