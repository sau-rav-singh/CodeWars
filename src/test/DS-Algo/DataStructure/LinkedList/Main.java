package DataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList=new LinkedList(10);
        myList.append(20);
        System.out.println("Head is "+myList.getHead().value);
        System.out.println("Tail is "+myList.getTail().value);
        System.out.println("Length is "+myList.getLength());
        boolean setResult=myList.set(30,1);
        System.out.println("Set Result is "+setResult);
        boolean insertResult=myList.insert(40,2);
        System.out.println("insertResult is "+insertResult);
        System.out.println(myList.remove(0).value);
        myList.printList();
    }
}
