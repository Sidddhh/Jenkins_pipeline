import java.io.*;
import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        int a = 5, b = 3;
        int sum = a + b;
        System.out.println("Program 1: Addition");
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

        // Calling next programs in sequence
        runProgram("Program2");
        runProgram("Program3");
        runProgram("Program4");
        runProgram("Program5");
    }

    public static void runProgram(String program) {
        try {
            Process process = new ProcessBuilder("java", program).inheritIO().start();
            process.waitFor(); // Ensures sequential execution
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
