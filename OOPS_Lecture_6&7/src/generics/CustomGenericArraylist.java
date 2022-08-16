package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArraylist<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArraylist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isfull()){
            resize();
        }
        data[size++] = num;
    }


    private void resize() {
        Object[] temp = new Object[data.length*2];
        // copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[size--]);
        return removed;
    }

    public T get(int index){
        return (T) (data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
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

        CustomGenericArraylist<Integer> list3 = new CustomGenericArraylist<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2*i);
        }

        System.out.println(list3);


    }
}
