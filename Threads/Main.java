public class Main {
    public static void main(String[] args) {
       Thread t2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + Thread.currentThread().getName() + " - " + i);
            }
       });
       t2.start();
    }
}