package com.company;
import java.util.Random;


public class Sort {
    public static void compareSortAlgo(int size) {
        int start = 10; int end = 10000; double[] temp; long time;
        Random random = new Random();
        double[] testArray = random.doubles(size, start, end).toArray();
        temp = testArray.clone();
        time = System.currentTimeMillis();
        BubbleSort.sort(temp);
        System.out.println("time for bubble sort is " + (System.currentTimeMillis() - time) + "ms");
        temp = testArray.clone();
        time = System.currentTimeMillis();
        InsertSort.sort(temp);
        System.out.println("time for insert sort is " + (System.currentTimeMillis() - time) + "ms");
        temp = testArray.clone();
        time = System.currentTimeMillis();
        ShellSort.sort(temp);
        System.out.println("time for shell sort is " + (System.currentTimeMillis() - time) + "ms");
        temp = testArray.clone();
        time = System.currentTimeMillis();
        MergeSort.aux = temp.clone();
        MergeSort.sort(temp);
        System.out.println("time for merge sort is " + (System.currentTimeMillis() - time) + "ms");
        temp = testArray.clone();
        time = System.currentTimeMillis();

    }


    public static void main(String[] args) {
        int size  = 200000;
        compareSortAlgo(size);
    }

}
