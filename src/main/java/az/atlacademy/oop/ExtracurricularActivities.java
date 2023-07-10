package az.atlacademy.oop;

public enum ExtracurricularActivities {
    Monday("go work"), Thuesday("go uni"), Wednesday("play chess"), Thursday("read book"), Friday("communicate"), Saturday("smile"), Sunday("run");
    private final String test;

    ExtracurricularActivities(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }
}
