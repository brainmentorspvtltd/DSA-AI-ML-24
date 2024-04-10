public class Loop {
 public static void main(String[] args) {
    int num = 123;
    int sum = 0;
    // put this code inside a loop
    while(num!=0){
    // get the digit
    int digit  = num % 10;
    sum = sum + digit; // store the digit
    num = num /10; // make number small
    }
    System.out.println(sum);
        // for(int i = 1;i<=10; i++){
        // System.out.println("Amit");
        // }
 }   
}
