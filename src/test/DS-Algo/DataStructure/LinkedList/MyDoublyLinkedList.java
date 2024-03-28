package DataStructure.LinkedList;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node{
        int value;
        Node next,prev;
        Node(int value){
            this.value=value;
        }
    }
    public MyDoublyLinkedList(int value){
        Node newNode= new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
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
}
