package az.atlacademy.repetition.rawType;

import az.atlacademy.lesson14.Box;

public class Util {
    public static <K, V> boolean compare(Pair<K, V>p1,Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue());
    }
    Pair<Integer, String> p1 = new Pair<>(1, "apple");
    Pair<Integer, String> p2 = new Pair<>(2, "pear");
    boolean same = Util.compare(p1, p2);

}




