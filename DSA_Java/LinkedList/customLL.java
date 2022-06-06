public class customLL {

    private Node head;
    private Node tail;
    private int size;
    customLL(){
        this.size = 0;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    // insert element at the beginning of LinkedList
    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public int deleteFirst(){
        if(head == null){
            System.out.println("Linked list is empty");
            return -1;
        }
        int value = head.data;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return value;
    }
    // insert at the end of the Linked List in O(1) time
    // benefit of maintaining a tail variable
    public void insertLast(int val){
        Node newNode = new Node(val);
        size++;
        if(head == null){
            head = newNode;
            tail = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node temp = get(size-1);
        int val = tail.data;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }
    // traverse till a particular node at an index and return the reference to that node
    public Node get(int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public int deleteatIndex(int idx){
        if(idx==0){
            return deleteFirst();
        }
        if(idx==size-1){
            return deleteLast();
        }
        Node temp = get(idx);
        int val  = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }
    public void insertatIndex(int val, int idx){
        if(idx == 0){
            insertFirst(val);
            return;
        }
        if(idx == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node newNode  = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public void displayLL(){
        Node temp = head;
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    // return the reference to a node containing a certain value
    public Node find(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data == val){
                return temp;
            }
                temp = temp.next;
        }
        return null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        customLL list  = new customLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.displayLL();
        System.out.println(list.getSize());
        list.insertatIndex(100, 3);
        list.displayLL();
        System.out.println(list.getSize());
        list.insertatIndex(200, 6);
        list.displayLL();
        System.out.println(list.getSize());
        list.insertatIndex(500, 1);
        list.displayLL();
        System.out.println(list.getSize());
        System.out.println("Delete from first");
        System.out.println(list.deleteFirst());
        list.displayLL();
        System.out.println(list.getSize());
        System.out.println(list.deleteFirst());
        list.displayLL();
        System.out.println(list.getSize());


        System.out.println("Delete from last");
        System.out.println(list.deleteLast());
        list.displayLL();
        System.out.println(list.getSize());
        System.out.println(list.deleteLast());
        list.displayLL();
        System.out.println(list.getSize());
        System.out.println("Delete at index");
        System.out.println(list.deleteatIndex(2));
        list.displayLL();
        System.out.println(list.deleteatIndex(5));
        list.displayLL();
    }
}
