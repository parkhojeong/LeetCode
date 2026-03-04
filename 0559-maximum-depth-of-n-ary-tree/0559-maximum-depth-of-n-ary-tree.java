/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        return dfs(root, 1);
    }

    int dfs(Node node, int depth) {
        if(node.children.isEmpty()){
            return depth;
        }

        int max = 0;
        for(int i = 0; i < node.children.size(); i++){
            int res = dfs(node.children.get(i), depth + 1);
            max = Math.max(max, res);
        }

        return max;
    }
}