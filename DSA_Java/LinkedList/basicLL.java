import java.util.*;

public class basicLL {
    Node head;
    // A node class
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // Add element in inital position
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add element in last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        basicLL list = new basicLL();

        list.addFirst("Navaneeth");
        list.addFirst("I am");
        list.addFirst("hello");
        list.printlist();
        list.addLast("P R");
        list.addLast(" B-Tech EPH");
        list.printlist();
    }
}
