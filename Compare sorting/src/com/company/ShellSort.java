package com.company;
import java.util.Arrays;

public class ShellSort {

    static void exchange(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(double[] a) {
        int n = a.length;
        int h = 1;
        while (h < n/3) h= 3*h + 1;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                // insert h sort
                double keyValue = a[i];
                int j = i - h;
                while (j >= 0 && a[j] > keyValue) {
                    a[j + h] = a[j];
                    j -= h;
                }
                a[j + h] = keyValue;
            }
            h = h/3;
        }
    }

    public static void main(String[] args) {
        double[] a = {1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

}
