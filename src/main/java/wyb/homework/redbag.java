package wyb.homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Double.valueOf;

public class redbag {
    private double money;
    private int number;
    private static final ReentrantLock lock = new ReentrantLock();
    public static ArrayList<Double> list;
    public redbag()
    {
        System.out.print("Money puts in : ");
        Scanner sc = new Scanner(System.in);
        send_money_in(sc.nextDouble());
        System.out.print("\nThe number of the redbag :");
        init_number(sc.nextInt());
        each_bag();
    }
    public void send_money_in(double _money)
    {
        money = _money;
    }
    public void init_number(int _number)
    {
        number = _number;
    }
    public int get_number()
    {
        return list.size();
    }
    public  void each_bag()
    {
        ArrayList<Double> list = new ArrayList<Double>();
        while(number > 1)
        {
            Double get  = valueOf(Math.random() * money);
            money -= get;
            list.add(get);
        }
        list.add(money);
    }





}
