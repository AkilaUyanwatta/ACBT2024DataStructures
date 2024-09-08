package com.example.acbt.trees;

import java.util.ArrayList;

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

    public static ArrayList<Float> getInOrderList(BinarySearchTree node){
        //Create an empty list
        ArrayList<Float> inOrderList = new ArrayList<>();

        //Do the in order transversal

        //Transversing the left subtree
        if (node.getLeftNode() != null) {
            inOrderList.addAll(getInOrderList(node.getLeftNode()));
        }
        //Visiting the node
        inOrderList.add(node.getData());
        //Transvwrsing the right subtree
        if (node.getRightNode() != null) {
            inOrderList.addAll(getInOrderList(node.getRightNode()));
        }

        //Return the result
        return inOrderList;
    }

    //Will return true if the node is a leaf
    public static boolean isLeaf(BinarySearchTree node) {
        if(node.getLeftNode() == null && node.getRightNode() == null ){       
            return true;
        }
        return false;
    }

    // Will return true if the node has only one child
    public static boolean hasOnlyOneChild(BinarySearchTree node) {
        if(node.getLeftNode() == null && node.getRightNode() != null) {
            return true;
        } else if (node.getLeftNode() != null && node.getRightNode() == null) {
            return true;
        }
        return false;
    }

    // Will return the only child
    public static BinarySearchTree getTheOnlyChild(BinarySearchTree node) {
        if(node.getLeftNode() == null && node.getRightNode() != null) {
            return node.getRightNode();
        } else if (node.getLeftNode() != null && node.getRightNode() == null) {
            return node.getLeftNode();
        }
        System.out.println("Error: the given node has more than one child or do not have any children");
        return null;
    }

    public void insert(float insertingNumber) {
        Float currentData = this.getData();
        if(insertingNumber < currentData){
            //Checking the to the left child
            if(this.getLeftNode() == null) {
                //Found the appropriate position
                BinarySearchTree newNode = new BinarySearchTree(insertingNumber);
                this.setLeftNode(newNode);
            } else {
                //Calling the insert function on the left node
                //(Moving the to the left child)
                this.getLeftNode().insert(insertingNumber);
            }
        } else if (insertingNumber > currentData){
            //Check the right child
            if(this.getRightNode() == null) {
                //Found the appropriate node
                BinarySearchTree newNode = new BinarySearchTree(insertingNumber);
                this.setRightNode(newNode);
            } else {
                //Keep executing the insert method on the right sub tree
                this.getRightNode().insert(insertingNumber);
            }
        } else {
            System.out.println("Inserting a data value which is already in the BST is not allowed");
        }
    }

    public void delete(float deletingValue) {
        float currentData = this.getData();
        float searchingValue = deletingValue;
        if (searchingValue < currentData) {
            // Move to the left sub tree
            if (this.getLeftNode() != null) {
                if (this.getLeftNode().getData() == searchingValue) {
                    //Delete Logic
                    BinarySearchTree mathcingNode = this.getLeftNode();
                    if(isLeaf(mathcingNode)){
                        //Deleting the node
                        this.setLeftNode(null);
                    } else if (hasOnlyOneChild(mathcingNode)) {
                        //Setting the only child of the matching child as the child of the current root
                        BinarySearchTree childOfTheMatchingNode = getTheOnlyChild(mathcingNode);
                        this.setLeftNode(childOfTheMatchingNode);
                    } else {
                        ArrayList<Float> inOrderList = getInOrderList(mathcingNode);
                        System.out.println(inOrderList);
                    }

                } else {
                    this.getLeftNode().search(searchingValue);
                }
            } else {
                System.out.println("The data is not in the graph");
            }
        } else if (searchingValue > currentData) {
            // Move to the right sub tree
            if (this.getRightNode() != null) {
                if (this.getRightNode().getData() == searchingValue) {
                    //Delete
                    BinarySearchTree mathcingNode = this.getRightNode();
                    if(isLeaf(mathcingNode)){
                        this.setRightNode(null);
                    } else if (hasOnlyOneChild(mathcingNode)) {
                        //Setting the only child of the matching child as the child of the current root
                        BinarySearchTree childOfTheMatchingNode = getTheOnlyChild(mathcingNode);
                        this.setRightNode(childOfTheMatchingNode);
                    } else {
                        ArrayList<Float> inOrderList = getInOrderList(mathcingNode);
                        System.out.println(inOrderList);
                    }
                } else{
                    this.getRightNode().search(searchingValue);
                }
            } else {
                System.out.println("The data is not in the graph");
            }
        } else {
            System.out.println("Unreachable");
        }
        
    }

    public void search(float searchingValue) {
        Float currentData = this.getData();
        if (searchingValue < currentData) {
            // Move to the left sub tree
            if (this.getLeftNode() != null) {
                this.getLeftNode().search(searchingValue);
            } else {
                System.out.println("The data is not in the graph");
            }
        } else if (searchingValue > currentData) {
            // Move to the right sub tree
            if (this.getRightNode() != null) {
                this.getRightNode().search(searchingValue);
            } else {
                System.out.println("The data is not in the graph");
            }
        } else {
            System.out.println("The data is in the graph");
        }
    }
    
}
