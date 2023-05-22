package library;

import java.util.*;

public class Item {
    private String code;
    private static TreeSet<String> unique = new TreeSet<>();
    private String title;
    private int year;
    boolean availability;

    public Item()
    {
        setCode();
        setTitle();
        setYear();
        availability = true;
    }
    private void setCode()
    {
            Random random = new Random();
            String _code = random.toString().substring(17);
            if(!unique.contains(_code)) {
                code = _code;
                unique.add(_code);
            }else
            {
                setCode();
            }
    }

    private void setTitle()
    {
        System.out.println("请输入书名 : ");
        String _title = new Scanner(System.in).next();
        title  = _title;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailability() {
        return availability;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    private void setYear(){
        System.out.println("请输入年份");
        int _year = new Scanner(System.in).nextInt();
        year = _year;
    }
    public void borrow()
    {
        availability = false;
    }
    public  void give_back()
    {
        availability = true;
    }
}
