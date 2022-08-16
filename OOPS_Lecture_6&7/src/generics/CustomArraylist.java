package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isfull()){
            resize();
        }
        data[size++] = num;
    }


    private void resize() {
        int[] temp = new int[data.length*2];
        // copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[size--];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
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
        CustomArraylist list = new CustomArraylist();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);

        ArrayList list2 = new ArrayList<>();
        list2.add(34);
        list2.add("Pratik");

    }
}
