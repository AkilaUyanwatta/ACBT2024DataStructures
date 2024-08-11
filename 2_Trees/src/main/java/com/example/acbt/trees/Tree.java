package com.example.acbt.trees;

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
}
