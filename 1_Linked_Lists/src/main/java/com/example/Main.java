package com.example;

public class Main {
    public static void main(String[] args) {
        // Node linkedList = getLinkedList();
        // linkedList.removeNode("Afra");
        // linkedList.removeTail();
        // linkedList.removeHead();

        // Node saudNode = new Node("Saud");
        // linkedList.insertNode("Nethmii", saudNode);
        // linkedList.insertNodeAfterTail(saudNode);

        //Inserting to the head
        // Node ravinduNode = new Node("Ravindu");
        // linkedList.insertBeforeHead(ravinduNode);

        //Finding a cycle
        // Node linkedListWithACycle = getLinkedListWithACycle();
        // Boolean cycleFlag = linkedListWithACycle.isThereACycle();

        Node linkedList = getLinkedList();
        Node reversedList = linkedList.getReversedList();
        System.out.println("");
    }

    
    public static Node getLinkedListWithDuplicateNames(){
        Node nodeOne = new Node("Saajith");
        Node nodeTwo = new Node("Nethmi");
        Node nodeThree = new Node("Afra");
        Node nodeFour = new Node("Hamdam");
        Node nodeFive = new Node("Nethmi");

        nodeFour.setNextNode(nodeFive);
        nodeThree.setNextNode(nodeFour);
        nodeTwo.setNextNode(nodeThree);
        nodeOne.setNextNode(nodeTwo);
        return nodeOne;
    }

    public static Node getLinkedList(){
        Node nodeOne = new Node("Saajith");
        Node nodeTwo = new Node("Nethmi");
        Node nodeThree = new Node("Afra");
        Node nodeFour = new Node("Hamdam");
        Node nodeFive = new Node("Sathsarani");

        nodeFour.setNextNode(nodeFive);
        nodeThree.setNextNode(nodeFour);
        nodeTwo.setNextNode(nodeThree);
        nodeOne.setNextNode(nodeTwo);
        return nodeOne;
    }

    public static Node getLinkedListWithACycle(){
        Node nodeOne = new Node("Saajith");
        Node nodeTwo = new Node("Nethmi");
        Node nodeThree = new Node("Afra");
        Node nodeFour = new Node("Hamdam");
        Node nodeFive = new Node("Sathsarani");

        nodeFour.setNextNode(nodeTwo);
        nodeThree.setNextNode(nodeFour);
        nodeTwo.setNextNode(nodeThree);
        nodeOne.setNextNode(nodeTwo);
        return nodeOne;
    }

}