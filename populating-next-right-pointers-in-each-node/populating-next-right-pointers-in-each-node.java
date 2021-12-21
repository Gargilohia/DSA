/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null)
            return root;
        
        LinkedList<Node> nodeQueue = new LinkedList<>();
        LinkedList<Integer> depthQueue = new LinkedList<>();
        
        if(root!=null){
            nodeQueue.offer(root);
            depthQueue.offer(1);
        }
        
        while(nodeQueue.peek()!= null){
            Node topNode = nodeQueue.poll();
            int depth = depthQueue.poll();
            
            if(depthQueue.peek()==null){
                topNode.next = null;
            }
            else if(depthQueue.peek()>depth){
                topNode.next = null;
            } else{
                topNode.next= nodeQueue.peek();
            }
            
            if(topNode.left!=null){
                nodeQueue.offer(topNode.left);
                depthQueue.offer(depth + 1);
            }
             if(topNode.right!=null){
                nodeQueue.offer(topNode.right);
                depthQueue.offer(depth + 1);
            }
        }
        
        
        return root;    
    }
}