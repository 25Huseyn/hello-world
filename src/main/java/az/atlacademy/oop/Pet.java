package az.atlacademy.oop;

public class Pet {
    private int age;

    private String species;

    private String nickname;

    private int tricklevel;

    private String[] habits;


    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("'Hello, owner. I am -" + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public String getSpecies() {
        return species;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String toString() {
        return "dog{nickname='" + nickname + "', age=" + age + ", tricklevel=" + tricklevel + ",habits=[" + habits + "]}";
    }

    public Pet(int age, String species, String nickname, int tricklevel, String[] habits) {
        this.age = age;
        this.species = species;
        this.nickname = nickname;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public Pet() {

    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }
}
