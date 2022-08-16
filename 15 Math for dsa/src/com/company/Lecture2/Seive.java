package com.company.Lecture2;

public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        sive(n, primes);
    }

    static void sive(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        System.out.print("Prime numbers under " + n + " are :");
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
