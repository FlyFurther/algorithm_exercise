package com.hq.exercise_8_30;

import apple.laf.JRSUIUtils;

import javax.sound.midi.Sequence;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by hq on 17/8/30.
 */
public class TreeToString {

    public static void main(String[] args) {
        TreeNode t = arrayToTreeNode(new Integer[]{1, 3, 5, 2, 8, 9});
        System.out.println(tree2Str(t));
    }

    public String treeToString(TreeNode t) {
        if (t == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        Stack<TreeNode> stack = new Stack();
        stack.push(t);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) {
                sb.append("()");
            } else {
                sb.append(node.val + "(");
                stack.push(node.right);
                stack.push(node.left);
            }

        }
        return null;
    }

    public static String tree2Str(TreeNode t) {
        if (t == null) {
            return "";
        }
        if (t.left == null && t.right == null) {
            return t.val + "";
        }
        if(t.right != null) {
            return t.val + "("+ tree2Str(t.left) + ")" + "(" + tree2Str(t.right) + ")";
        } else {
            return t.val + "(" + tree2Str(t.left) + ")";
        }
    }


    public static TreeNode arrayToTreeNode(Integer[] vals) {
        if (Objects.isNull(vals) || vals.length <= 0) {
            return null;
        }
        TreeNode treeNode = null;
        treeNode = bulidNode(treeNode, 0, vals);
        return treeNode;
    }

    public static TreeNode bulidNode(TreeNode rootNode, int i, Integer[] vals) {
        if (i >= vals.length) {
            return null;
        }
        //1.封装当前节点数据
        rootNode = integerToTreeNode(vals[i]);
        if (rootNode == null) {
            return null;
        }
        //2.封装左节点数据
        rootNode.left = bulidNode(rootNode.left, i*2+1, vals);
        //3.封装右节点数据
        rootNode.right = bulidNode(rootNode.right, i*2+2, vals);
        return rootNode;
    }

    public static TreeNode integerToTreeNode(Integer val) {
        TreeNode treeNode = null;
        if (val != null) {
            treeNode = new TreeNode(val);
        }
        return treeNode;
    }

   static class TreeNode {
        Integer val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
