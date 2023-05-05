package az.atlacademy.lesson15;

public class Result <T >{
    private T data;

   private String classname;

    public Result(T data, String classname) {
        this.data = data;
        this.classname = classname;
    }
    public  Result() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
