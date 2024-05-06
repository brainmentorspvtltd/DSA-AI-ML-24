import java.util.ArrayList;

// class [X{

// }
class A extends Object{
    int x = 100;
    int y = 200;
}
public class ArrayDemo {
    public static void main(String[] args) {
        int x = 10;
        Object w2 = 10;
        w2 = true;
        w2 = "Amit";
        String s = new String("Amit");
        System.out.println(s.toString());
        A obj = new A();
        int w[][] =new int[3][3];
        System.out.println(w);
        System.out.println(obj.toString());
        int arr[] = new int[5];
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        boolean q[] = new boolean[5];
        int b[] = {10,20,30};
        int []c = {10,20,30};
        int []d = new int[]{1,2,3};
        System.out.println(arr);
    }
}
