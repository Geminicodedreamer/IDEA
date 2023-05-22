package get.lesson;

import java.util.Scanner;

public class public_has {
    private int code;
    private int idx = 0;
    private String name;

    public public_has()
    {
        code = ++ idx;
        setName();
    }

    public void setName() {
        System.out.println("姓名 : ");
        this.name = new Scanner(System.in).nextLine();
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
