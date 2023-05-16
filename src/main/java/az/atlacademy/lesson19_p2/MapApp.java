package az.atlacademy.lesson19_p2;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MapApp {
    public static void main(String[] args) {
        HashMap<String, Queue<String>> map = new LinkedHashMap<>();
        Queue<String> DonarLand = new LinkedList<>();
        Queue<String> McDonalds = new LinkedList<>();
        Queue<String> KFC = new LinkedList<>();
        DonarLand.add("Donar");
        map.put("12as334",DonarLand);
        McDonalds.add("BigMac");
        map.put("46fg454gs",McDonalds);
        KFC.add("ChickenBurger");
        map.put("5dgs567",KFC);

    }

}
