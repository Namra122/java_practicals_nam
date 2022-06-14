/*  practical 14
            Write a program to demonstrate the concept of boxing and unboxing.
    
*/
public class prac_14 {

    public static void main(String args[]) {
        int a = 10;
        Integer a1 = a;// boxing
        Integer a2 = 15;// boxing
        System.out.println("Value after boxing " + a1 + " , " + a2);
        int c = a1;// unboxing
        int d = a2;// unboxing
        System.out.println("Value of after unboxing " + c + " , " + d);
    }
}
