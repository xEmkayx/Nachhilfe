package Januar.Mon30;
public class Fibonacci {
    public static void main(String[] args) {
        int maxZahl = 10;
        for (int i = 0; i < 10; i++){
            System.out.print(getFibonacciFolge(i) + ", ");
        }
    }

    public static int getFibonacciFolge(int zahl) {
//        System.out.println(zahl);
        if (zahl == 0){
            return 0;
        }
        else if (zahl == 1 || zahl == 2){
            return 1;
        }
        return getFibonacciFolge(zahl - 1) + getFibonacciFolge(zahl - 2);
    }
}