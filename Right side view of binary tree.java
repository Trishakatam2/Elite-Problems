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
    List <Integer> list = new ArrayList<> ();
    int res;
    int height(TreeNode node){
        if (node == null){
            return 0;
        }
        return Math.max(height(node.left) , height(node.right)) + 1;
    }
    int add_values(TreeNode node, int level){
        if (node == null){
            return res;
        }
        if (level == 0){
            res = node.val;
        }
        else{
            add_values(node.left, level-1);
            add_values(node.right, level-1);
        }
        return res;
    }
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null){
            return list;
        }
        int h = height(root);
        for (int i=0;i<h;i++){
            add_values(root, i);
            list.add(res);
        }
        return list;
    }
}
