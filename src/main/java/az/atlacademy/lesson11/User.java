package az.atlacademy.lesson11;

public enum User {
    Deleted(3), Block(6), Inuse(5);
    private final int usercount;

    User(int usercount) {
        this.usercount = usercount;
    }

    public static void main(String[] args) {
        System.out.println(Deleted.usercount);
        System.out.println(Block);
        System.out.println(Inuse);
    }
}
