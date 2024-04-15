public class EvenOddPosSum {
    public static void main(String[] args) {
        int position = 0; // Position Count
        int num = 8765;
        int evenSum = 0;
        int oddSum = 0;
        while(num!=0){
        // extract digit from the number (Last Digit)
        int digit = num % 10;
        position++; // position = position + 1
        if(position%2==0){
            evenSum = evenSum + digit;
        }
        else{
            oddSum = oddSum + digit;
        } 
        num = num / 10; //make number small
    }
    System.out.println("Even Sum "+evenSum);
    System.out.println("Odd Sum "+oddSum);
    }
}
