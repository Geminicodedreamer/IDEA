package wyb.homework;

public class get {
    public static void main(String[] args) throws InterruptedException {
        redbag hongbao1 = new redbag();
        person person1 = new person();
        person person2 = new person();

        person1.start();
        person2.start();
        person1.join();
        person2.join();

    }
}
