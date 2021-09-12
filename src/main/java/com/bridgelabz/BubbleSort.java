package com.bridgelabz;

public class BubbleSort {
    public static void main(String args[]) {
        BubbleSort sort = new BubbleSort();
        int arraynum[] = { 10, 5, 17, 100, 958, 54};
        sort.bubbleSort(arraynum);
        System.out.println("Sorted array is : ");
        sort.printArray(arraynum);
    }
    public void bubbleSort(int arraynum[]) {
        int n = arraynum.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arraynum [j] > arraynum [j + 1]) {
                    int temp = arraynum [j];
                    arraynum [j] = arraynum [j + 1];
                    arraynum [j + 1] = temp;
                }
    }
    public void printArray(int arraynum[]) {
        int n = arraynum .length;
        for (int i = 0; i < n; ++i)
            System.out.print(arraynum [i] + " ");
        System.out.println();
    }
}
