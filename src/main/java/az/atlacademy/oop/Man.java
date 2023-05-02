package az.atlacademy.oop;

public class Man extends Human implements RepairCar {
    @Override
    public void repairCar() {

    }

    @Override
    public void greetpet(Pet pet) {
        super.greetpet(pet);
    }
}
