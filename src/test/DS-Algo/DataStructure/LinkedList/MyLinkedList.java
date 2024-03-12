package DataStructure.LinkedList;

import lombok.Getter;

public class MyLinkedList {
    private Node head, tail;
    @Getter
    private int length;

    private static class Node {
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

    MyLinkedList() {

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
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
        System.out.println(value + " added to the List");
    }

    public void removeLastElement() {
        if (length == 0)
            return;

        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        // return temp;
    }

    public void preprend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void removeFirst() {
        if (length == 0) {
            return;
        }
        head = head.next;
        length--;
        if (length == 0) {
            tail = null;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int value, int index) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int value, int index) {
        if (index < 0 || index >= length)
            return false;
        if (index == 0) {
            preprend(value);
            return true;
        }
        if (index == length - 1) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }
}