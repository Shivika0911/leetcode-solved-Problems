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
class Solution{  int sum=0;
        public  int sumLeft(TreeNode root,char ch)
        {
            if(root==null)
            return sum;

            if(root.left==null && root.right==null && ch=='l')
            {
                sum+=root.val;
               
            }
            sumLeft(root.left,'l');
            sumLeft(root.right,'r');
            return sum;
            
        }
        public int sumOfLeftLeaves(TreeNode root) {
    return sumLeft(root,'r');
        }
              }
               
               
        
        
