package generics.Compring;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Student Pratik = new Student(23, 89.76f);
        Student Rahul = new Student(5, 99.76f);
        Student arpit = new Student(2, 95.76f);
        Student karan = new Student(13, 77.76f);
        Student sachin = new Student(9, 96.76f);

        Student[] list =  {Pratik, Rahul , arpit, karan, sachin};



        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if (Pratik.compareTo(Rahul) < 0){
//            System.out.println("Rahul has more marks");
//        }
    }
}
