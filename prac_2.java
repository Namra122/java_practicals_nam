
/*  practical 2
        To find the factorial of a given number
    solution:-
*/
import java.util.*;

public class prac_2 {
    public static void main(String[] args) {
        int i, fact = 1;
        // taking the input from the user
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        // calculate the factorial
        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        // print the factorial
        System.out.println("The factorial of the number entered is : " + fact);
    }
}
