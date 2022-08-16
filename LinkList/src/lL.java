public class lL {
    private Node head;
    private Node tail;

    private int size;
    public lL(){
        this.size=0;
    }

    public void incerFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail = head;
        }
        size+=1;
    }

    public void incertLast(int val){
        if (tail==null){
            incerFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void incert(int val, int index){
        if (index==0){
            incerFirst(val);
            return;
        }
        if (index==size){
            incertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next=node;
        size++;
    }

    public int deletFirst(){
        int valu = head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return valu;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    public Node insertRec(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }














    // Questions
    public void removeDuplicates(){
        Node node = head;
        while (node.next!=null){
            if (node.value == node.next.value && node.next!=null){
                node.next = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static lL merge(lL first, lL second){
        Node f = first.head;
        Node s = second.head;
        lL ans = new lL();
        while (f!=null && s!=null){
            if (f.value < s.value){
                ans.incertLast(f.value);
                f=f.next;
            }else {
                ans.incertLast(s.value);
                s=s.next;
            }
        }
        while (f!=null){
            ans.incertLast(f.value);
            f=f.next;
        }
        while (s!=null){
            ans.incertLast(s.value);
            s = s.next;
        }

        return ans;
    }
}