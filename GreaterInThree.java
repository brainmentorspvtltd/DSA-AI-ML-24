public class GreaterInThree {
    public static void main(String[] args) {
        // nested if else
        int a = 10;
        int b = 20;
        int c = 5;
        if(a>b){ // outer if 
           if(a>c){ // inner if
            System.out.println("A is Greater");
           } 
           else { // inner else
            System.out.println("C is Greater");
           }
        }
        else if(b>c){ // outer else
            System.out.println("B is Greater");
        } 
        else{
            System.out.println("C is Greater");
        }
        // if(){
        //     if(){

        //     }
        //     else{

        //     }
        // }
        // else{

        // }
    }
}
