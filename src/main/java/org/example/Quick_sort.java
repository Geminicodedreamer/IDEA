package org.example;

import java.util.Scanner;

public class Quick_sort {
    private int[] ans = new int[100000];
    public Quick_sort(int n , int[] q){
        for(int i=0; i<n; i++){ans[i] = q[i];}
        quickSort(ans, 0, n-1);

    }
    public int[] getAns()
    {
        return ans;
    }
    public static void quickSort(int[] q, int l, int r){
        if(l >= r) return;
        int x = q[l + r >> 1], i = l - 1, j = r + 1;
        while(i < j){
            while( q[++i] < x );
            while( q[--j] > x) ;
            if(i < j){
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }
        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }
}
