package heapSort;

import java.util.*;

public class heapSort {
    int[] heap = new int[20];
    int n;

    public static void main(String[] args) {
        heapSort obj = new heapSort();
        obj.accept();
        System.out.print("Data before sort :");
        obj.display();
        obj.heapCreate();
        obj.heapSort();
        System.out.print("Sorted Data :");
        obj.display();
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.print("Enter elements of array");
        for (int i = 1; i <= n; i++) {
            heap[i] = sc.nextInt();
        }


    }

    public void display() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public void heapCreate() {
        heap[0] = n;
        for (int i = n / 2; i >= 1; i--) {
            downAdj(i);
        }
    }

    public void downAdj(int i) {
        int j, t;
        while (2 * i <= heap[0]) {
            j = 2 * i;
            if (j + 1 < heap[0] && heap[j + 1] > heap[j]) {
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
        int t, last;
        heap[0] = n;
        while (heap[0] > 1) {
            last = heap[0];
            t = heap[last];
            heap[last] = heap[1];
            heap[1] = t;

            heap[0]--;
            downAdj(1);
        }
    }
}