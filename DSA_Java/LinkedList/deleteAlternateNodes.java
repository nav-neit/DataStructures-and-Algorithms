public class deleteAlternateNodes {
    private Node head = null;
    private class Node{
        private int data;
        private Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public void add(int d){
        Node newNode = new Node(d);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void displayll(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void deleteAlternate (){
        if(head==null || head.next==null){
            return;
        }
        Node temp = head;
        while(temp!=null && temp.next!=null){
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        deleteAlternateNodes list = new deleteAlternateNodes();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.displayll();
        list.deleteAlternate();
        list.displayll();
    }
}
