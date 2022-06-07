public class CircularLL {
    private Node head;
    private Node tail;
    CircularLL(){
        head = null;
        tail = null;
    }
    private class Node{
        private int data;
        private Node next;
        Node(int val){
            this.data = val;
        }
    }
    public void insert(int val){
        Node newNode = new Node(val);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void deleteitem(int d){
        if(head==null){
            System.out.println("Circular Linked List is empty");
            return;
        }
        if(head.data == d){
            head = head.next;
            tail.next = head;
            return;
        }
        Node temp1 = head;
        Node temp2 = head.next;
        while(temp2!=head){
            if(temp2.data == d){
                break;
            }
            temp1 = temp1.next;
            temp2  = temp2.next;
        }
        if(temp2== head){
            System.out.println("Item not present in Circular Linked List");
            return;
        }
        temp1.next = temp2.next;
    }
    public void displayCLL(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("->");
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.displayCLL();
        list.deleteitem(20);
        list.displayCLL();
    }
}
