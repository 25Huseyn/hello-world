package az.atlacademy.oop;

public class DomesticCat extends Pet {
    @Override
    public void respond() {

    }

    @Override
    public void foul() {
        super.foul();
    }

    public DomesticCat(String nickname) {
        super(nickname);
    }
}
