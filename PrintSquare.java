public class PrintSquare {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1; row<=n; row++){
            for(int star = 1; star<=n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
