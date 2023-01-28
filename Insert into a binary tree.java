class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null){
            root = node;
            return root;
        }
        TreeNode curr = root;
        TreeNode parent = null;
        while(curr != null){
            parent = curr;
            if (val < curr.val){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
        if (val < parent.val){
            parent.left = node;
        }
        else{
            parent.right = node;
        }
        return root;
    }
}
