package OOPs.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human jayavel = new Human("Jayavel", 21, "male", 100000, false);
        Human rahul = new Human("Rahul", 23, "Male", 200000, true);
        Human aprit = new Human("Arpit", 20,"Male", 2000, false);
        System.out.println(jayavel.population);

        fun();

    }
    static void fun (){
        System.out.println("This is from fun");
        new Main().message();
    }
    void message(){
        System.out.println("Jayvel");
    }
}
