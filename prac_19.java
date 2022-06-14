/*  practical 19
             Write a program to show the use of nested try statements that emphasizes the sequence of 
            checking for catch handler statements.

 */
public class prac_19 {

    public static void main(String[] args) {
        try {
            System.out.println("In outer try block.");
            try {
                System.out.println("In 1st inner try block.");
                int b = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            System.out.println("Out of 1st inner try block.");
            try {
                System.out.println("In 2nd inner try bloc.");
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("Out of 2nd inner try block.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Out of outer try block.");
    }
}
