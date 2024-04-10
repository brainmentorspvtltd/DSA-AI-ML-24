// Java OOPS, Close to 100% OOPS , but not complete 100%
// Every code start with a class
/*
 * class name and file name must be same if 
 * class is public , otherwise class name
 * and file name can be different
 */
// class can be public and default (by default)
class Second{
    // main is a function
    // void no return
    // static - things will be loaded when class is loaded
    // public - things can access outside the package(folder)
// String args [] - Command Line Arguments
// String - Predefine class

public static void main(String ...args){
    // No Garbage Value
    int x = 10;
    x++; // x = x  + 1
    System.out.println("X is "+x);
    // out - predefine object
    // out has print function for printing
    // out is an object of PrintStream class
    // System class - create object of PrintStream
    // that is out
    System.out.println("Hello Java");
}
}