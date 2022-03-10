package com.company;
//in ia you could use this to link to different rooms in the game
public class Node {
    private int value;
    private Node next;

    public Node(int v) {
        value = v;
        //null by default but good to initialise it anyway for readability
        next = null;
    }
    public void setNext(Node n) {
        next = n;
    }
    public Node getNext() {
        return next;
    }
    public void display() {
        System.out.println(value);
    }
    //appends to a new node with the value n to the end of the list.
    public void add(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            pointer = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    //This method adds the value of the last node in the list
    public void getLast(Node head, Object x) {
        Node return = head;

        if(head = null) {
            return new Node(x, null);
        }
        while((head.getNext != null)) {
            head =  head.next;
        }
        head.next = new Node(x,null);
        return return;
    }

    //TODO implement addFirst method
    //I called this method push instead of addFirst. Adds a new node with value N at the start of this list.
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
    }

}