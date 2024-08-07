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
class BSTIterator {
        Queue<Integer> list;
        public BSTIterator(TreeNode root) {
            list = new LinkedList<>();
            traverseBST(root, list);
        }

        public int next() {
            return list.poll();
        }

        public boolean hasNext() {
            return !list.isEmpty();
        }
        
        private void traverseBST(TreeNode node, Queue<Integer> list) {
            if (node == null) return;
            
            traverseBST(node.left, list);
            list.add(node.val);
            traverseBST(node.right, list);
        }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */