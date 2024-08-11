package com.example.acbt.trees;

public class Main {
    public static void main(String[] args) {
        Tree students = getStudentsTree();

        //Adding Sathsarani
        Tree sathsarani = new Tree("Sathsarani");
        Tree saranga = students.getLeftNode().getRightNode();
        saranga.setRightNode(sathsarani);

        //Removing Ravindu
        Tree lankani = students.getLeftNode();
        lankani.setLeftNode(null);

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