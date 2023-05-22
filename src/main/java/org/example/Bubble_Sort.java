package org.example;

public class Bubble_Sort {
    private int[] ans = new int[100000];
    private static int number = 0; //记录冒泡排序的轮数

    public Bubble_Sort(int n , int[] q) {
        for(int i=0; i<n; i++){ans[i] = q[i];}
        bubbleSort(n , ans);
    }

    public static void bubbleSort(int n , int[] array) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            number++;
        }
    }

    public int[] getAns()
    {
        return ans;
    }


}