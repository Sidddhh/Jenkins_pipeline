// Program2.java - Subtraction
public class Program2 {
    public static void main(String[] args) {
        int a = 10, b = 3;
        int difference = a - b;
        System.out.println("Program 2: Subtraction");
        System.out.println("The difference of " + a + " and " + b + " is " + difference);

        // Calling Program 3 (Multiplication)
        try {
            Runtime.getRuntime().exec("java Program3");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
