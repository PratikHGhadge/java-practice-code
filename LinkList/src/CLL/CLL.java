package CLL;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            }while (node!=head);
        }
    }

    public void delete(int val){
        Node node  = head;
        if (node == null){
            return;
        }
        if (node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }


    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(553);
        list.insert(43);
        list.insert(3);
        list.delete(553);
        list.display();
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
