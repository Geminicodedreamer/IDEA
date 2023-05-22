package get.lesson;

import java.util.*;

public class Main {
    static TreeMap<String , Double> map = new TreeMap<>();

    public static void main(String[] args) {
        map.put("数学" , 5.9);
        map.put("应用" , 3.8);
        map.put("高级"  , 6.0);
        for(Map.Entry<String , Double> it : map.entrySet() )
        {
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }
}
