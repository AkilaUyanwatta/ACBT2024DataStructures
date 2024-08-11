package com.example;

import java.util.List;
import java.util.ArrayList;

public class Node {
    String data = "";
    // Next node
    Node nextNode = null;

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNodeValue) {
        this.nextNode = nextNodeValue;
    }

    public Node(String dataValue) {
        this.data = dataValue;
    }

    public void removeNode(String dataValue) {
        // Finding the Previous Node
        Node previousNode = null;
        Node currentNode = this;
        while (previousNode == null) {
            Node nextNode = currentNode.getNextNode();
            if (nextNode.data.equals(dataValue)) {
                // Found the value
                previousNode = currentNode;
            } else {
                currentNode = currentNode.getNextNode();
            }
        }
        // Now the previous node is correct
        Node removedNode = previousNode.getNextNode();
        // Set the next node of removedNode as the next node of
        // previous node
        previousNode.setNextNode(removedNode.getNextNode());
    }

    public void removeTail() {
        // Finding the a node in which the next node
        // does not have a next node
        Node currentNode = this;
        while (true) {
            Node nextNode = currentNode.getNextNode();
            if (nextNode.getNextNode() == null) {
                // Found the value
                currentNode.setNextNode(null);
                break;
            } else {
                currentNode = currentNode.getNextNode();
            }
        }
    }

    public void removeHead() {
        Node head = this;
        Node secondNode = head.getNextNode();

        this.data = secondNode.data;
        this.setNextNode(secondNode.getNextNode());
    }

    public void insertNode(String targetData, Node insertingNode) {
        Node currentNode = this;
        while (true) {
            // Comparing the data of the current node
            // with the targetData input
            if (currentNode.data.equals(targetData)) {
                // Target Node Found.
                // Inset the insertingNode after current Node
                insertingNode.setNextNode(currentNode.getNextNode());
                currentNode.setNextNode(insertingNode);
                break;
            } else if (currentNode.getNextNode() == null) {
                System.out.println("Warning: Target data not found in any of the nodes");
                break;
            } else {
                // Setting the next node as the current node
                currentNode = currentNode.getNextNode();
            }
        }
    }

    public void insertNodeAfterTail(Node insertingNode) {
        //Checking if the linked list has a cycle
        if(this.isThereACycle()){
            System.out.println("The current linked list has a cycle.");
            System.out.println("Cannot execute insertNodeAfterTail function");
            return;
        }
        //Execute the logic if there is no cycle
        Node currentNode = this;
        while (true) {
            if (currentNode.getNextNode() == null) {
                //We are at the tail
                currentNode.setNextNode(insertingNode);
                break;
            } else {
                // We are not at the tail
                currentNode = currentNode.getNextNode();
            }
        }
    }

    public void insertBeforeHead(Node newHead) {
        //Making a copy of the current linked list
        Node copyOfList = new Node(this.data);
        copyOfList.setNextNode(this.getNextNode());

        //Setting the value of head
        this.data = newHead.data;
        this.setNextNode(copyOfList);
    }

    // Will return true if the linked list has a cycle
    public Boolean isThereACycle() {
        List<Node> previousNodes = new ArrayList<>();
        Node currentNode = this;
        while (currentNode.getNextNode() != null) {
            if (previousNodes.contains(currentNode)) {
                return true;
            } else {
                previousNodes.add(currentNode);
                currentNode = currentNode.getNextNode();
            }
        }
        return false;
    }

    public Node getReversedList() {
        Node nextNode = null;
        Node previousNode = null;
        Node currentNode = this;
        while (currentNode != null) {
            if(previousNode == null){
                previousNode = new Node(currentNode.data);
            }
            else{
                nextNode = new Node(currentNode.data);
                nextNode.setNextNode(previousNode);
                previousNode = nextNode;
            }
            currentNode = currentNode.getNextNode();
        }
        return nextNode;
    }
}
