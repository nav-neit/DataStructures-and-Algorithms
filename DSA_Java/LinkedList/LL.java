public class LL {
    Node head;
    private int size;
    LL(){
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
    public void add(int ele){
        Node newNode = new Node(ele);
        if(head == null){
            head = newNode;
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
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.println();
    }
    public int getIndex(int d){
        Node temp = head;
        for(int i = 1; i<=size;i++){
            if(temp.data==d){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(10);
        list.printLL();
        System.out.println(list.getIndex(1));
    }
}
