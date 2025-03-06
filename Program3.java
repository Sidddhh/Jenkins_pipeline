import java.io.*;
import java.util.*;
// Program3.java - Multiplication
public class Program3 {
    public static void main(String[] args) {
        int a = 4, b = 6;
        int product = a * b;
        System.out.println("Program 3: Multiplication");
        System.out.println("The product of " + a + " and " + b + " is " + product);

        // Calling Program 4 (Division)
        try {
            Runtime.getRuntime().exec("java Program4");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
