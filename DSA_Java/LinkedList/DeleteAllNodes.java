import java.util.Scanner;

public class DeleteAllNodes {
    Node head;
    private int size;
    DeleteAllNodes(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
            size++;
        }
    }
    public void add(int d){
        Node newNode = new Node(d);
        if(head==null){
            head =newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printLL(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteall(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        while(head!=null && head.data>25){
            size--;
            head = head.next;
        }
    }
    public static void main(String[] args) {
        DeleteAllNodes list = new DeleteAllNodes();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.add(ele);
        }
        list.printLL();
        list.deleteall();
        list.printLL();
    }
}
