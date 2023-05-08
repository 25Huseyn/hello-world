package az.atlacademy.lesson15;

public class GenericApp {
    public static void main(String[] args) {
        Result<Integer> result1 = validateAndGet(null);
        System.out.println(result1);
        Result<Float> result = validateAndGet(34F);
        System.out.println(result);
        Result<String> result2 = validateAndGet("null");
        System.out.println(result2);
        Respons<String,Integer> commonResponse = get("common",23);
        System.out.println(commonResponse);
    }
    public static <T> Result<T> validateAndGet(T t){
    if (t == null){
        return new Result<>();
    }
    return new Result<>(t,t.getClass().getName());
    }
    public static <T, U> Respons<T, U> get(T t, U u) {
        return new Respons<>(t, u);
    }

}

