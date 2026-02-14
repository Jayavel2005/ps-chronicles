package OOPs.Abstraction;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("My career is " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + " she is " + age + " years old");
    }
}
