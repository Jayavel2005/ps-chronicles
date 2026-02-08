package OOPs.StaticExample;

public class InnerClassExample {
    static class Inner {
        String name;

        Inner(String name) {
            this.name = name;
        }

        void message() {
            System.out.println("hello I am from inner");
        }
    }

    public static void main(String[] args) {
//        Inner inner = new Inner();
//        InnerClassExample main = new InnerClassExample();
        Inner inner = new Inner("Jayavel");
        Inner inner2 = new Inner("Rahul");
        inner.message();
        System.out.println(inner.name);
        System.out.println(inner2.name);
    }
}
