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
    List <List<Integer>> list = new ArrayList<>();
    int height(TreeNode node){
        if (node == null){
            return 0;
        }
        return Math.max(height(node.left) , height(node.right)) + 1;
    }
    List add_values(TreeNode node, int level, List res){
        if (node == null){
            return res;
        }
        if (level == 0){
            res.add(node.val);
        }
        else{
            add_values(node.left, level-1, res);
            add_values(node.right, level-1, res);
        }
        return res;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null){
                return list;
            }
            int h = height(root);
            for (int i=0;i<h;i++){
                List <Integer> res = new ArrayList<>();
                add_values(root, i, res);
                list.add(res);
            }
            return list;
    }
}
