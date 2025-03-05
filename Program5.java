// Program5.java - Square Root
public class Program5 {
    public static void main(String[] args) {
        double number = 16;
        double sqrt = Math.sqrt(number);
        System.out.println("Program 5: Square Root");
        System.out.println("The square root of " + number + " is " + sqrt);


         // Calling Program 5 (Square Root)
        try {
            Runtime.getRuntime().exec("java Program1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
