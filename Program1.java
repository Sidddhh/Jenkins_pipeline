// Program1.java - Addition
public class Program1 {
    public static void main(String[] args) {
        int a = 5, b = 3;
        int sum = a + b;
        System.out.println("Program 1: Addition");
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

        // Calling Program 2 (Subtraction)
        try {
            Runtime.getRuntime().exec("java Program2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
