package az.atlacademy.lesson14;

import java.util.UUID;

public final class GenericApp {
    public static void main(String[] args) {
        Box<String> resultGeneric = getNumString();
        System.out.println(resultGeneric.getNum());
        System.out.println(resultGeneric.isEven());
        System.out.println(resultGeneric);

        Box<Double> resultGeneric1 = getNumDouble();
        System.out.println(resultGeneric1.getNum());
        System.out.println(resultGeneric1.isEven());
        System.out.println(resultGeneric1);

        Box<Integer> resultGeneric2 = getnumInteger();
        System.out.println(resultGeneric2.getNum());
        System.out.println(resultGeneric2.isEven());
        System.out.println(resultGeneric2);
    }

    public static Box<Integer> getnumInteger() {
        int num = (int) (Math.random() * 101);
        boolean isEven = num % 2 == 0;
        return new Box<>(num, isEven);
    }

    public static Box<Double> getNumDouble() {
        double num = (double) (Math.random() * 101);
        boolean isEven = num % 2 == 0;
        return new Box<>(num, isEven);
    }

    public static Box<String> getNumString() {
        return new Box<>(UUID.randomUUID().toString(), true);
    }
}
