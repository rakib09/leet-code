package com.extremecoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Inorder_Traversal_94 {

     // Definition for a binary tree node.
     public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> treeNodes = new Stack<>();
        List<Integer> results = new ArrayList<>();

        while (!treeNodes.empty() || root != null) {
            while (root != null) {
                treeNodes.push(root);
                root = root.left;
            }
            root = treeNodes.pop();
            results.add(root.val);
            root = root.right;
        }
        return results;
    }

    public static void main(String[] args) {
         TreeNode treeNode3 = new TreeNode(3,null, null );
         TreeNode treeNode2 = new TreeNode(2, treeNode3, null);
         TreeNode treeNode = new TreeNode(1, null, treeNode2);
        System.out.println(Arrays.toString(inorderTraversal(treeNode).toArray()));

        TreeNode t11 = new TreeNode(11,null, null );
        TreeNode t9 = new TreeNode(9, t11, null);
        TreeNode t10 = new TreeNode(10, null, null);
        TreeNode t8 = new TreeNode(8, null, null);
        TreeNode t4 = new TreeNode(4, null, t8);
        TreeNode t5 = new TreeNode(5, t9, t10);
        TreeNode t2 = new TreeNode(2, t4, t5);
        TreeNode t6 = new TreeNode(6, null, null);
        TreeNode t7 = new TreeNode(7, null, null);
        TreeNode t3 = new TreeNode(3, t6, t7);
        TreeNode t1 = new TreeNode(1, t2, t3);
        System.out.println(Arrays.toString(inorderTraversal(t1).toArray()));
    }
}
