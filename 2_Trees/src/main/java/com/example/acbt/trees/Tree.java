package com.example.acbt.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private String data = "";
    private Tree leftNode = null;
    private Tree rightNode = null;

    public Tree(String inputData) {
        setData(inputData);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Tree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Tree leftNode) {
        this.leftNode = leftNode;
    }

    public Tree getRightNode() {
        return rightNode;
    }

    public void setRightNode(Tree rightNode) {
        this.rightNode = rightNode;
    }

    public static void printInOrder(Tree tree) {
        // Terminating condition
        if (tree == null) {
            return;
        }
        // Searching the left sub tree
        printInOrder(tree.getLeftNode());
        // Printing the root of the given sub tree
        System.out.println(tree.getData());
        // Searching the right sub tree
        printInOrder(tree.getRightNode());
    }

    public static void printPreOrder(Tree tree) {
        // Terminating condition
        if (tree == null) {
            return;
        }
        // Printing the root of the given sub tree
        System.out.println(tree.getData());
        // Searching the left sub tree
        printPreOrder(tree.getLeftNode());
        // Searching the right sub tree
        printPreOrder(tree.getRightNode());
    }

    public static void printPostOrder(Tree tree) {
        // Terminating condition
        if (tree == null) {
            return;
        }

        // Searching the left sub tree
        printPostOrder(tree.getLeftNode());
        // Searching the right sub tree
        printPostOrder(tree.getRightNode());
        // Printing the root of the given sub tree
        System.out.println(tree.getData());
    }

    public void addNodeToRight(String targetData, Tree child) {
        Tree tree = this;

        if (tree.getData().equals(targetData)) {
            tree.setRightNode(child);
            return;
        } else {
            // Searching the left sub tree
            if (tree.getLeftNode() != null) {
                tree.getLeftNode().addNodeToRight(targetData, child);
            }

            // Searching the right sub tree
            if (tree.getRightNode() != null) {
                tree.getRightNode().addNodeToRight(targetData, child);
            }
        }
    }

    public void removeRightChild(String targetData) {
        Tree tree = this;

        if (tree.getData().equals(targetData)) {
            tree.setRightNode(null);
            return;
        } else {
            // Searching the left sub tree
            if (tree.getLeftNode() != null) {
                tree.getLeftNode().removeRightChild(targetData);
            }

            // Searching the right sub tree
            if (tree.getRightNode() != null) {
                tree.getRightNode().removeRightChild(targetData);
            }
        }
    }

    public static void printLevelOrderTransversal(Tree tree){
        Queue<Tree> transversingQueue = new LinkedList<>();
        transversingQueue.add(tree);
        while (transversingQueue.size() > 0) {
            Tree currentNode = transversingQueue.poll();
            System.out.println(currentNode.getData());
            //Add the left child of the current node to the queue
            if (currentNode.getLeftNode() != null) {
                transversingQueue.add(currentNode.getLeftNode());
            }
            //Add the right child of the current node to the queue
            if (currentNode.getRightNode() != null) {
                transversingQueue.add(currentNode.getRightNode());
            }
        }
    }
}
