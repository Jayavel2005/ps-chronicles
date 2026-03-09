public class Main {
    static int count = 0;
    
    public static void main(String[] args) {
        // print();
        // printNameNtimes("Jayavle", 0, 5);
        print1toN(5);
    }

    static void print(){
        if( count == 5){
            return;
        }
        System.out.println(count);
        count++;
        print();
    }

    static void printNameNtimes(String name,int count, int N){
        if (count == N) return;
        System.out.println(name);
        printNameNtimes(name, count+1, N);
    }

    static void print1toN(int n){
        if (n == 0) return;
        print1toN(n-1);
        System.out.println(n);
    }
}