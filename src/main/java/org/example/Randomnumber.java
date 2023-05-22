package org.example;

import java.util.Random;

public class Randomnumber {
    private Random random = new Random();
    private int n;
    private int[] a = new int[100000];
    public Randomnumber(){
        n = random.nextInt(100000) + 1;
        for(int i = 0 ; i < n ; i ++)
        {
            a[i] = random.nextInt(100001);
        }
    }

    public int getN()
    {
        return n;
    }
    public int[] getA()
    {
        return a;
    }

}
