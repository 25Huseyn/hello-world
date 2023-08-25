package az.atlacademy.lesson14;

public class Box<E> {
    private E num;

    private boolean isEven;

    public Box(E num, boolean isEven) {
        this.num = num;
        this.isEven = isEven;
    }

    public E getNum() {
        return num;
    }

    public boolean isEven() {
        return isEven;
    }

    public void setEven(boolean even) {
        isEven = even;
    }

    public void setNum(E num) {
        this.num = num;
    }
}
