public class RotateANumber {
    public static void main(String[] args) {
        int num = 12345;
        int r = 7;
        
        int count = 0;
        int copy = num;
        while(copy!=0){
            copy=copy/10; // make digit small
            count++;
            }
            r = r % count;
        int pow = (int)Math.pow(10,r);
        int rhs = num % pow;
        int lhs = num /pow;
        
        int result = rhs * (int)Math.pow(10, count-r) + lhs;
        System.out.println(result);

       // System.out.println(rhs +""+ lhs); // Printing
    }
}
