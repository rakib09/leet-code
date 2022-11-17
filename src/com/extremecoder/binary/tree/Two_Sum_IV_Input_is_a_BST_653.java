package com.extremecoder.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Two_Sum_IV_Input_is_a_BST_653 {

//    public boolean findTarget(TreeNode root, int k) {
//
//    }

    public static void main(String[] args) {
        TreeNode node = prepare(new Integer[]{10, 5, 13, 2, 7, 11, 15, null, 3, 6, 8, null, 12, 13, null});
        System.out.print(node.toString());
    }

    private static TreeNode prepare(Integer[] inputs) {
        if (inputs.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(inputs[0]);
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        for (int i = 1; i < inputs.length; i++) {
            TreeNode node = treeNodeQueue.peek();
            if (node.left == null) {
                node.left = new TreeNode(inputs[i]);
                if (inputs[i] != null) {
                    treeNodeQueue.add(node.left);
                }
            } else if (node.right == null) {
                node.right = new TreeNode(inputs[i]);
                if (inputs[i] != null) {
                    treeNodeQueue.add(node.right);
                }
                treeNodeQueue.remove();
            }
        }
        return root;
    }
}
