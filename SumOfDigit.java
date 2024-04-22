public class SumOfDigit {
    // Sum - Stack Fall
    static int sumOfDigit(int num){
        // Base Case
        if(num ==0){
            return 0;
        }
        // Small Problem + Put in Recursion
        int sum = sumOfDigit(num/10);
        sum = sum + num % 10;
        return sum;
    }
    // Sum - Stack Build
    static void sumOfDigit(int num, int sum){
        // 2. Base Case
        if(num ==0){
            System.out.println(sum);
            return ; 
        }
        // Write Your Code Here
        // 1. Small Problem Identify Put in Recursion
        // 3. Logic 
        int digit = num % 10; 
        sum = sum + digit;
        sumOfDigit(num/10, sum);
    }
    public static void main(String[] args) {
       // sumOfDigit(123, 0);
       System.out.println(sumOfDigit(123));
    }
}
