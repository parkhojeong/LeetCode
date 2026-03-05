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
    public List<Integer> preorder(Node root) {
        if(root == null) {
            return new ArrayList<>();
        }
        return dfs(root);
    }

    List<Integer> dfs(Node node) {
        List<Integer> arr = new ArrayList<>();

        arr.add(node.val);
        for(int i = 0; i < node.children.size(); i++){
            arr.addAll(dfs(node.children.get(i)));
        }
        return arr;
    }
}