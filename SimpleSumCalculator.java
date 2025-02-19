import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter integers to sum (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break; 
            }

            try {
                Integer number = Integer.parseInt(input);
                numbers.add(number); 
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; 
        }

        System.out.println("The sum of the entered integers is: " + sum);
        scanner.close();
    }
}



