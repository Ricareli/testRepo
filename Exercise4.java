import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        new Exercise4().run();
    }
    
    private void run() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = in.nextInt();
        
        System.out.println("The smallest number is: " + (Math.min(number1, number2)));
    }
}