import java.io.*;
import java.util.*;
// Program4.java - Division
public class Program4 {
    public static void main(String[] args) {
        double a = 20, b = 4;
        double quotient = a / b;
        System.out.println("Program 4: Division");
        System.out.println("The quotient of " + a + " and " + b + " is " + quotient);

        // Calling Program 5 (Square Root)
        try {
            Runtime.getRuntime().exec("java Program5");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
