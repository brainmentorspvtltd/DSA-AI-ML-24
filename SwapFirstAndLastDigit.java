public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        int num = 7843;
        int copy = num;
        int count = 0;
        int lastDigit = num % 10;
        while(copy!=0){
            copy = copy / 10;
            count++;
        }
        int power = (int)Math.pow(10 , count - 1);
        int firstDigit = num / power;
        int mid = num /10;
        mid = mid % (int)Math.pow(10 , count - 2);
        int result = lastDigit * power + mid * 10 + firstDigit;
        System.out.println(result);
    }
}
