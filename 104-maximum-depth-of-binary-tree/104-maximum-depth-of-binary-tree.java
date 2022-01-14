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
    public int maxDepth(TreeNode root) {
        int count = 0;
        if(root == null)
            return 0;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            count++;
             LinkedList<TreeNode> list= new LinkedList<>();
            while(!stack.isEmpty())
            {
                TreeNode node = stack.pop();
                list.add(node);
            }
            while(!list.isEmpty()){
                TreeNode node = list.pollLast();
                if(node.left!=null)
                    stack.push(node.left);
                if(node.right!=null)
                    stack.push(node.right);
            }
        }
        return count;
    }
}