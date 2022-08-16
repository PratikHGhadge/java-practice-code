public class Main {

    public static void main(String[] args) {
        lL list = new lL();
        lL list1 = new lL();
        list1.incertLast(1);
        list1.incertLast(3);
        list1.incertLast(5);
        list1.incertLast(7);
        list.incertLast(2);
        list.incertLast(4);
        list.incertLast(6);
        list.incertLast(8);
        list.incertLast(9);
//        list.incert(100, 3);
//        list.insertRec(12,2);
//        System.out.println(list.deletFirst());
        lL ans = lL.merge(list, list1);
        ans.display();
//        list.display();
//        list.removeDuplicates();
//        list.display();
    }
}
