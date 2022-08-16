package Pratik;

import java.util.Scanner;

public class HeapSort {
    int[] heap = new int[20];
    int n;
    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter the value of n :");
        n = sc.nextInt();
        System.out.println("Enter the values of array :");
        for (int i = 1; i <= n; i++) {
            heap[i] = sc.nextInt();
        }
    }

    public void display() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public void create() {
        heap[0] = n;
        for (int i = n / 2; i >= 1; i--) {
            downAdj(i);
        }
    }

    public void downAdj(int i) {
        int j, t;
        while (i * 2 <= heap[0]) {
            j = i * 2;
            if (j + 1 <= heap[0] && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[i] < heap[j]) {
                t = heap[i];
                heap[i] = heap[j];
                heap[j] = t;
                i = j;
            } else {
                break;
            }
        }
    }

    public void heapSort() {
        int last = heap[0];
        if (heap[0] >= 1) {
            int t = heap[1];
            heap[1] = heap[last];
            heap[last] = t;
            heap[0]--;
            downAdj(1);
        }
    }

    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        obj.accept();
        System.out.println("Array before sorting ");
        obj.display();
        obj.create();
        obj.heapSort();
        System.out.println("Array after sorting ");
        obj.display();
    }
}
