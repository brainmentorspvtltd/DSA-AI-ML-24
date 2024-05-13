public class Fibo {

    static int fibo(int num){
        // Base Case
        if(num<=1){
            return num;
        }
        // Small Problem 
        int term1 = fibo(num-1);
        int term2 = fibo(num-2);
        return term1 + term2;
    }
    public static void main(String[] args) {
        int result = fibo(50);
        System.out.println(result);
    }
}
