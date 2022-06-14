/*  practical 12
            Write a program to show the difference between public and private access specifiers. The 
            program should also show that primitive data types are passed by value and objects are passed 
            by reference and to learn use of final keyword
    solution:-
*/
class Distance {

    public int feet, inches;
    private int meters, centimeters;
    public final int kilo = 10;// final keyword

    Distance(int f, int i) {
        meters = 15;
        centimeters = 25;
        this.feet = f;
        this.inches = i;
    }

    void display() {
        System.out.println("The value of feet is = " + feet);
        System.out.println("The value of inches is = " + inches);
        System.out.println("The value of meters is = " + meters);
        System.out.println("The value of centimeters is = " + centimeters);

    }

    void addDistance(Distance d3) {
        // the value of kilo is = 10
        // because the final value can't be assigned
        d3.feet = d3.feet + kilo;
        d3.inches = d3.inches + kilo;

    }
}

public class prac_12 {

    public static void main(String args[]) {

        Distance d1 = new Distance(5, 10);
        Distance d3 = new Distance(10, 15);

        d1.display();
        // System.out.println("The value of meters is = "+d1.metrs);
        // metrs can't be accessed because of private access specifier
        // System.out.println("The value of centimeters is = "+d1.centimetrs);
        // centimeters can't be accessed because of private access specifier
        d1.addDistance(d3);
        d3.display();

    }
}