package az.atlacademy.lesson11;

public enum User {
    deleted(3),block(6),inuse(5);
    private final int usercount;
    User(int usercount) {
        this.usercount = usercount;
    }

    public static void main(String[] args) {
        System.out.println(deleted.usercount);
        System.out.println(block);
        System.out.println(inuse);
    }
}
