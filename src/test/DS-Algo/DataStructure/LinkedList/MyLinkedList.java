package DataStructure.LinkedList;

import lombok.Getter;

public class MyLinkedList {
    private Node head, tail;
    @Getter
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    MyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    MyLinkedList(){

    }
    public int getHeadValue() {
        return head.value;
    }

    public int getTailValue() {
        return tail.value;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("List Member Value -> " + temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        System.out.println(value + " added to the List");
    }

    public Node removeLastElement(){
        if(length==0)
            return null;

        Node temp=head;
        Node pre=head;

        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
}
