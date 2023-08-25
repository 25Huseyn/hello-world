package az.atlacademy.lesson10;

import az.atlacademy.lesson9.Rectangle;

public class CarApp {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Mercedes mercedes = new Mercedes();

        call(mercedes);
        call(bmw);
        Car bmwx6 = new Bmw();
        Car bmwM5 = new Bmw();
        Car c250 = new Mercedes();
        Car c244 = new Mercedes();
        call((Car) (bmwx6));
        call((Car) (bmwM5));
        System.out.println(bmwx6 instanceof Car);
        System.out.println(bmwx6 instanceof Object);
    }

    private static void call(Car car) {
        car.print();
    }

}
