public class PrintDigits {
    static void printDigit(int num){
        // Base Case
        if(num ==0){
            return;
        }
        
        // small problem + Recursion
        printDigit(num/10); // make number small
        // Stack Fall
       
        System.out.println(num % 10);
    }
    public static void main(String[] args) {
        printDigit(12345);
    }
}
