package wyb.homework;

import java.util.concurrent.locks.ReentrantLock;

public class person extends Thread {
    private double wallet ;
    private static final ReentrantLock lock = new ReentrantLock();
    private  static redbag hongbao;
    public void get_redbag(redbag _hongbao) {
        hongbao = _hongbao;
    }
    public void get_money()
    {
        if(hongbao.get_number() != 0) {
            int n = (int) Math.random() * hongbao.get_number();
            System.out.println(this.getName() + " gets a redbag of " + hongbao.list.get(n));
            hongbao.list.remove(n);
        }
        else System.out.println("Sorry , you come too late , there's no extra bag");
    }
    @Override
    public void run()
    {
        lock.lock();
        try
        {
            get_money();
        }
        finally {
            lock.unlock();
        }
    }
}
