public class PalindromeNumber {

    static boolean palindromeNumber2(int num , int reverse, 
    int org){
        // % / Power
        if(num==0){
            
            return org == reverse;
        }
        // % / Power
        // Small Problem
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        return palindromeNumber2(num/10, reverse, org);
    }

    static void palindromeNumber(int num , int reverse, 
    int org){
        // Base Case
        if(num==0){
            System.out.println(reverse==org
            ?"Palindrome Number":"Not Palindrome Number");
            return ;
        }
        // % / Power
        // Small Problem
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        palindromeNumber(num/10, reverse, org);

    }
    public static void main(String[] args) {
        boolean r = palindromeNumber2(151, 0, 151);
        System.out.println(r?"Palindrome ":"Not Palindrome");
    }
}
