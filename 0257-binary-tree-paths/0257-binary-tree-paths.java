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
    public List<String> binaryTreePaths(TreeNode root) {
         List<String> res = new ArrayList<>();
        List<Integer> curPath = new ArrayList<>();
        helper(root, curPath, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> curPath, List<String> res) {
        if (root == null) {
            return;
        }
        curPath.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder pathStr = new StringBuilder();
            for (int i = 0; i < curPath.size(); i++) {
                pathStr.append(curPath.get(i));
                if (i < curPath.size() - 1) {
                    pathStr.append("->");
                }
            }
            res.add(pathStr.toString());
        }
        else {
            helper(root.left, curPath, res);
            helper(root.right, curPath, res);
        }
        curPath.remove(curPath.size() - 1);
        
    }
}