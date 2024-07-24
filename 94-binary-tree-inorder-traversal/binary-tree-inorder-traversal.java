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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        if(root==null) return in;
        Stack <TreeNode> st = new Stack <TreeNode>();
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root = root.left;
            }

            root = st.pop();
            in.add(root.val);
            root = root.right;
        }
        return in;
    }
}