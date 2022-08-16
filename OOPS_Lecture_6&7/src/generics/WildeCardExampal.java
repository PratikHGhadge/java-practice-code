package generics;

import java.util.Arrays;
import java.util.List;

public class WildeCardExampal<T extends Number> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildeCardExampal() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
        // do somthingc
    }

    public void add(T num) {
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }


    private void resize() {
        Object[] temp = new Object[data.length * 2];
        // copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) (data[size--]);
        return removed;
    }

    public T get(int index) {
        return (T) (data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        CustomGenericArraylist list = new CustomGenericArraylist();
////        list.add(3);
////        list.add(5);
////        list.add(9);
//
//        for (int i = 0; i < 14; i++) {
//            list.add(2*i);
//        }
//        System.out.println(list);
//
//        ArrayList list2 = new ArrayList<>();
//        list2.add(34);
//        list2.add("Pratik");

        WildeCardExampal<Integer> list3 = new WildeCardExampal<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);


    }
}
