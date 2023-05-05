package az.atlacademy.lesson14;

public  class Generic<E> {
    private  E num;

    private boolean isEven;

    public Generic(E num, boolean isEven) {
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
