package com.example.acbt.trees;

public class Main {
    public static void main(String[] args) {
        Tree students = getStudentsTree();

        // //Adding Sathsarani
        // Tree sathsarani = new Tree("Sathsarani");
        // Tree saranga = students.getLeftNode().getRightNode();
        // saranga.setRightNode(sathsarani);

        // //Removing Ravindu
        // Tree lankani = students.getLeftNode();
        // lankani.setLeftNode(null);

        // System.out.println("");
        // System.out.println("*** In Order ***");
        // Tree.printInOrder(students);
        // System.out.println("");
        
        // System.out.println("*** Pre Order ***");
        // Tree.printPreOrder(students);
        // System.out.println("");

        // System.out.println("*** Post Order ***");
        // Tree.printPostOrder(students);
        // System.out.println("");

        // //Adding Sathsarani to Ravindu's right node
        // Tree sathsarani = new Tree("Sathsarani");
        // students.addNodeToRight("Saranga", sathsarani);
        // System.out.println("");

        // //Adding the right child of Nilushana
        // students.removeRightChild("Nilushana");
        // System.out.println("");
        // Tree.printLevelOrderTransversal(students);

        //Binary Search Tree
        //Creating a simple binary search tree using the getter
        // BinarySearchTree bst = getStartingBinarySearchTree();
        // bst.insert((float) 1.2);
        // bst.insert((float) 3.5);
        // // Searching 3
        // bst.search((float) 3);
        // // Deleting 3
        // bst.delete((float) 3);

        BinarySearchTree complexTree = getComplexBinarySearchTree();
        complexTree.delete((float) 40);
        System.out.println("");
    }

    private static BinarySearchTree getStartingBinarySearchTree(){
        
        BinarySearchTree one = new BinarySearchTree((float) 1);
        BinarySearchTree two = new BinarySearchTree((float) 2);
        BinarySearchTree three = new BinarySearchTree((float) 3);
        BinarySearchTree four = new BinarySearchTree((float) 4);
        BinarySearchTree five = new BinarySearchTree((float) 5);

        two.setLeftNode(one);
        two.setRightNode(four);

        four.setLeftNode(three);
        four.setRightNode(five);

        return two;
    }

    private static BinarySearchTree getComplexBinarySearchTree(){
        
        BinarySearchTree one = new BinarySearchTree((float) 10);
        BinarySearchTree two = new BinarySearchTree((float) 20);
        BinarySearchTree three = new BinarySearchTree((float) 30);
        BinarySearchTree four = new BinarySearchTree((float) 40);
        BinarySearchTree five = new BinarySearchTree((float) 50);

        two.setLeftNode(one);
        two.setRightNode(four);

        four.setLeftNode(three);
        four.setRightNode(five);

        three.setLeftNode(new BinarySearchTree((float)25));
        three.setRightNode(new BinarySearchTree((float)35));
        three.getRightNode().setLeftNode(new BinarySearchTree((float) 32));

        five.setLeftNode(new BinarySearchTree((float) 45));
        five.setRightNode(new BinarySearchTree((float) 55));

        return two;
    }

    private static Tree getStudentsTree() {
        Tree saud = new Tree("Saud");
        Tree lankani = new Tree("Lankani");
        Tree nilushana = new Tree("Nilushana");
        Tree ravindu = new Tree("Ravindu");
        Tree sranga = new Tree("Saranga");
        Tree shehan = new Tree("Shehan");

        saud.setLeftNode(lankani);
        saud.setRightNode(nilushana);

        lankani.setLeftNode(ravindu);
        lankani.setRightNode(sranga);

        nilushana.setRightNode(shehan);

        return saud;
    }
}