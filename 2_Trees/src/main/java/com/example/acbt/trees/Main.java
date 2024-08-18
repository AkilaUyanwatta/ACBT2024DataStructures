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
        System.out.println("*** In Order ***");
        Tree.printInOrder(students);
        System.out.println("");
        
        System.out.println("*** Pre Order ***");
        Tree.printPreOrder(students);
        System.out.println("");

        System.out.println("*** Post Order ***");
        Tree.printPostOrder(students);
        System.out.println("");

        //Adding Sathsarani to Ravindu's right node
        Tree sathsarani = new Tree("Sathsarani");
        students.addNodeToRight("Saranga", sathsarani);
        System.out.println("");

        //Adding the right child of Nilushana
        students.removeRightChild("Nilushana");
        System.out.println("");
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