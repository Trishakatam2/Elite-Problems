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
    int max_sum = Integer.MIN_VALUE;
    int sum(TreeNode node){
        if (node == null){
            return 0;
        }
        int left = Math.max(0, sum(node.left));
        int right = Math.max(0, sum(node.right));
        max_sum = Math.max(max_sum, node.val + left + right);
        return Math.max(left,right) + node.val;
    }
    public int maxPathSum(TreeNode root) {
        if (root == null){
            return 0;
        }
        sum(root);
        return max_sum;
    }
}
