public class Main {

    //using recursion
    public static int factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //using a for loop
//    public static int factorial(int n) {
//        int val = 1;
//        for (int i = 1; i <= n; i++) {
//            val *= i;
//        }
//        return val;
//    }
    
    public static void main(String[] args) {
        int value = factorial(3);
        System.out.println("Factorial Value: "  + value);
    }
}
