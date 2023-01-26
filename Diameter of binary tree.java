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
    int max;
    int height(TreeNode node){
        if (node == null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        max = Math.max(left+right+1, max);
        return Math.max(left, right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null){
            return 0;
        }
        height(root);
        return max-1;
    }
}
