package org.example;

public class check {
    private static long startTime;
    private static long endTime;

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            Randomnumber data = new Randomnumber();
            startTime = System.currentTimeMillis();
            Quick_sort ans1 = new Quick_sort(data.getN(), data.getA());
            endTime = System.currentTimeMillis();
            long quick_sort_time = endTime - startTime;
            startTime = System.currentTimeMillis();
            Merge_sort ans2 = new Merge_sort(data.getN(), data.getA());
            endTime = System.currentTimeMillis();
            long merge_sort_time = endTime - startTime;
            startTime = System.currentTimeMillis();
            Bubble_Sort ans3 = new Bubble_Sort(data.getN(), data.getA());
            endTime = System.currentTimeMillis();
            long bubble_sort_time = endTime - startTime;
            boolean flag = true;
            int[] res1 = ans1.getAns();
            int[] res2 = ans2.getAns();
            int[] res3 = ans3.getAns();
            for (int j = 0; j < data.getN(); j++) {
//                System.out.printf("%d %d\n" , res1[j] , res2[j]);
                if (res1[j] != res2[j] || res3[j] != res2[j] || res3[j] != res1[j]) {
                    flag = false;
                    break;
                }
            }
            System.out.printf("Test #%d : ", i);
            if (flag)
                System.out.print("Accept Quick_sort :\t " + quick_sort_time + " ms Merge_sort :\t " + merge_sort_time + " ms Bubble_sort : \t" + bubble_sort_time + " ms \n");
            else System.out.println("Wrong Answer");
        }

    }
}