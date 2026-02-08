package OOPs.StaticExample;

public class StaticInt {
   static int a = 4;
   static int b;
   static {
       System.out.println("I am from static block");
       b = a * 5;

   }

    public static void main(String[] args) {
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}
