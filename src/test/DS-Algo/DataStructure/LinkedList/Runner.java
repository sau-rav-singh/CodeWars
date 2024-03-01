package DataStructure.LinkedList;

public class Runner {

    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList(10);
        printListHeadTail(linkedList);
        linkedList.printList();
        linkedList.append(4);
        printListHeadTail(linkedList);
        linkedList.printList();
        System.out.println("-------------");
        MyLinkedList linkedList1=new MyLinkedList();
        linkedList1.append(4);
        linkedList1.append(40);
        printListHeadTail(linkedList1);
        linkedList1.printList();

    }

    public static void printListHeadTail(MyLinkedList linkedList){
        System.out.println("Head is at "+linkedList.getHeadValue());
        System.out.println("Tail is at "+linkedList.getTailValue());
        System.out.println("Length of List is "+linkedList.getLength());
    }
}
