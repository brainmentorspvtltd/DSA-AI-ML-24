import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        // Scanner act as a Buffer
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        // nextXXX - word
        // nextLine - Line
        // Scanner scanner = new Scanner("Hello How are You\n I am Good");
        // int count = 0;
        // while(scanner.hasNextLine()){
        //     count++;
        //     System.out.println(scanner.nextLine());
        // }
        // System.out.println(count);
        // scanner.close();
         
        // int num = 12345;
        int count = 0;
        int copy = num;
        int power = 0;
        while(copy!=0){
            copy/=10; // copy = copy / 10;
            count++;
        }
        while(num!=0){
        power = (int) Math.pow(10, count - 1);
        System.out.println(num / power);
        num = num % power; // make number small
        count --;
        }
        scanner.close();
    }
}
