package az.atlacademy.lesson14;

import java.util.UUID;

public final class GenericApp {
    public static void main(String[] args) {
        Generic<String> resultGeneric = generateRandString();
        System.out.println(resultGeneric.getNum());
        System.out.println(resultGeneric.isEven());
        System.out.println(resultGeneric);
    }
    public static Generic<Integer> getnum(){
        int num = (int) (Math.random() * 101);
       boolean isEven = num % 2 ==0;
       return new Generic<>(num, isEven);
    }
    public static Generic<String>  generateRandString(){
        return new Generic<>(UUID.randomUUID().toString(),true);
    }
}
