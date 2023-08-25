package az.atlacademy.lesson17_p2;

public class Worker implements Comparable<Worker> {
    private String name;
    private String duty;
    private int id;
    private int age;
    private double salary;

    public Worker(String name, String duty, int id, int age, double salary) {
        this.name = name;
        this.duty = duty;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{name='%s', duty='%s', id=%d, age=%d, salary=%s}".formatted(name, duty, id, age, salary);
    }

    @Override
    public int compareTo(Worker that) {
        return Integer.compare(that.getAge(), this.getAge());
    }
}
