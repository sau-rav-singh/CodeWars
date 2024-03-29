package DataStructure.LinkedList;

import lombok.Getter;

public class MyLinkedList {
    private Node head, tail;
    @Getter
    private int length;

    public static class Node {
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
        }
        tail = newNode;
        length++;
        System.out.println(value + " added to the List");
    }

    public Node removeLastElement() {
        if (length == 0)
            return null;

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
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node removedNode = head;
        head = head.next;
        removedNode.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }

        return removedNode;
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
            prepend(value);
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

    public Node remove(int index) {
        if (index < 0 || index >= length)
            return null;
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLastElement();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode() {
        if (head == null) {
            return null;
        }
        Node hare = head;
        Node tortoise = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return tortoise;
    }

    public boolean hasLoop(){
        if(head==null)
            return false;
        Node fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public Node findKthFromEnd(int k) {
        if (head == null || k <= 0) {
            return null;
        }
        Node fastPtr = head;
        Node slowPtr = head;

        // Move fastPtr k steps ahead
        for (int i = 0; i < k; i++) {
            if (fastPtr == null) {
                return null; // Less than k nodes in the list
            }
            fastPtr = fastPtr.next;
        }

        // Move both pointers simultaneously until fastPtr reaches the end
        while (fastPtr != null) {
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }

        return slowPtr;
    }
}
