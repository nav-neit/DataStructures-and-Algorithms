public class DoublyLL {
    private Node head;
    private int size;
    DoublyLL(){
        size=0;
    }
    private class Node{
        private int data;
        private Node next;
        private Node prev;
        Node(int d){
            size++;
            this.data = d;
            this.next = null;
            this.prev = null;
        }
    }
    public void insertFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void insertatIndex(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index == size){
          insertLast(val);
          return;
        }
        Node temp = head;
        for(int i =1;i<index;i++){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    // get reference to a node
    public Node get(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data==val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void insertAfter(int after, int val){
        Node ref = get(after);
        if(ref!=null){
            Node newNode = new Node(val);
            newNode.next = ref.next;
            ref.next = newNode;
            newNode.prev = ref;
            if(newNode.next!=null) {
                // we might be on the last node which dosen't have a next node
                newNode.next.prev = newNode;
            }
            return;
        }
        System.out.println("There is no such node with value" + after);
        return;
    }
    public void displayDll(){
        Node temp = head;
        System.out.print("null");
        while(temp!=null){
            System.out.print("<-" + temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    // display the doubly linked list in reverse
    public void displaydllReverse(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        System.out.print("null");
        while(temp!=null){
            System.out.print("<-" + temp.data + "->");
            temp = temp.prev;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.displayDll();
        list.displaydllReverse();
        System.out.println("insert at last");
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.displayDll();
        System.out.println("Insert at index");
        list.insertatIndex(100,3);
        list.displayDll();
        list.insertatIndex(200,5);
        list.displayDll();
        list.insertatIndex(300,2);
        list.displayDll();
        System.out.println("Insert after");
        list.insertAfter(300, 12);
        list.insertAfter(30, 13);
        list.insertAfter(5, 14);
        list.displayDll();
    }
}
