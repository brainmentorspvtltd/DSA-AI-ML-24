public class NestedLoop {
   public static void main(String[] args) {
    mylabel:
    for(int i = 1; i<=3; i++){
        for(int j = 1; j<=3; j++){
            if(i==j){
                break mylabel;
               // break; // exit from the current loop
            }
        }
    }
   } 
}
