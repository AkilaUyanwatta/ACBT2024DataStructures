package com.example.acbt.trees;

public class BinarySearchTree {
    Float data = null;
    BinarySearchTree leftNode = null;
    BinarySearchTree rightNode = null;

    public BinarySearchTree(Float inputData){
        this.data = inputData;
    }

    public Float getData() {
        return data;
    }
    public void setData(Float data) {
        this.data = data;
    }
    public BinarySearchTree getLeftNode() {
        return leftNode;
    }
    public void setLeftNode(BinarySearchTree leftNode) {
        this.leftNode = leftNode;
    }
    public BinarySearchTree getRightNode() {
        return rightNode;
    }
    public void setRightNode(BinarySearchTree rightNode) {
        this.rightNode = rightNode;
    }

    public void insert(float insertingNumber) {
        BinarySearchTree bst = this;
        // TODO Auto-generated method stub
    }
    
}
