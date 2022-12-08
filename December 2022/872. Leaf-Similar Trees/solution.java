// Asked on: 08-12-2022
// Language: Java

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> leaf1 = new ArrayList<>();
        ArrayList<Integer> leaf2 = new ArrayList<>();

        computeLeaf(leaf1, root1);
        computeLeaf(leaf2, root2);

        if(leaf1.equals(leaf2)){
            return true;
        }
        return false;
    }

    public void computeLeaf(ArrayList<Integer> leaf, TreeNode root){
        if(root.right == null && root.left == null){
            leaf.add(root.val);
            return;
        }

        if(root.right!=null){
            computeLeaf(leaf, root.right);
        }
        if(root.left!=null){
            computeLeaf(leaf, root.left);
        }

        return;
    }
}
