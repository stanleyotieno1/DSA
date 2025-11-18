
class Node{
    int data;
    Node next;

    Node(int new_int){
        this.data = new_int;
        this.next = null;

    }
}
public class Main{
    public static void main (String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        traverselList(head);

    }

    public static void traverselList(Node head){
        while(head.next != null){
            System.out.println(head.data);
            if (head.next != null){
                head = head.next;
            }
        }
    }

}