public class Grade {
    /*
     * >90 A Grade
     * 90 to 70 B Grade 
     * <70 to 60 C Grade
     * <60 to 50 D Grade
     * <50 F Grade
     */
    public static void main(String[] args) {
        int marks = 20;
        if(marks>90){
            System.out.println("A Grade");
        }
        else if(marks<=90 && marks>=70){
            System.out.println("B Grade");
        }
        else if(marks<70 && marks>=60){
            System.out.println("C Grade");
        }
        else if(marks<60 && marks>=50){
            System.out.println("D Grade");
        }
        else{
            System.out.println("F Grade...");
        }
        // int a = 10;
        // int b = 20;
        // if(a>b){
        //     System.out.println("A is Greater");
        // } else if(b>a){
        //     System.out.println("B is Greater");
        // }
        // else{
        //     System.out.println("Both Same");
        // }
    }
}
