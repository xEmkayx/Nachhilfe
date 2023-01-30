package Januar.Mon30;
public class Fibonacci {
    public static void main(String[] args) {
        getFibonacciFolge(5);
    }

    // 0, 1, 1, 2, 3, 5, 8

    public static int getFibonacciFolge(int zahl) {
        System.out.printf(zahl);
        if (zahl == 0){
            return 0;
        }
        else if (zahl == 1 || zahl == 2){
            return 1;
        }
        return getFibonacciFolge(zahl - 1) + getFibonacciFolge(zahl - 2);
    }
}