package OOPs.StaticExample;

public class Human {
    String name;
    int age;
    String gender;
    long salary;
    boolean isMarried;

    static long population = 0;

    public Human(String name, int age, String gender, long salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.isMarried = isMarried;

        Human.population++;
    }
}
