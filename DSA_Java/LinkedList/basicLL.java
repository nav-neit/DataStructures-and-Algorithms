public class basicLL {
    Node head;
    private int size;
    basicLL(){
        this.size = 0;
    }
    // A node class
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
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
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }

        Node seclast = head;
        Node last = head.next;
        size--;
        if(last==null){
            head = null;
            return;
        }
        while(last.next!=null){
            last = last.next;
            seclast = seclast.next;
        }
        seclast.next = null;
    }
    public int getSize(){
        return size;
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
        list.deleteFirst();
        list.printlist();
        list.deleteLast();
        list.printlist();
        System.out.println(list.getSize());
    }
}
