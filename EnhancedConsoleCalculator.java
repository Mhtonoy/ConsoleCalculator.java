import java.util.Scanner;

public class EnhancedConsoleCalculator{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Enhanced Console Calculator!");

        while(true){
            System.out.println("\nChoose an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            int choice = getChoice(scanner);

            if (choice == 0){
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            performOperation(scanner, choice);
        }

        // Close the scanner
        scanner.close();
    }

    private static int getChoice(Scanner scanner){
        int choice;

        while(true){
            System.out.println("Enter your choice (0-4): ");

            try{
                choice = scanner.nextInt();
                if(choice>=0 && choice<=4){
                    break;
                }
                else{
                    System.out.println("Invalid choice. Please enter a number between 0 and 4.");
                }
            } catch(Exception e){
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the buffer
            }
        }

        return choice;
    }

    private static void performOperation(Scanner scanner, int choice){
        double num1, num2;

        System.out.println("Enter the first number: ");
        num1 = getNumber(scanner);

        System.out.println("Enter the Second number: ");
        num2 = getNumber(scanner);

        switch(choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0){
                    System.out.println("Result: " + (num1 / num2));
                }
                else{
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    private static double getNumber(Scanner scanner){
        double num;

        while (true){

            try{
            num = scanner.nextDouble();
            break;
            }
            catch(Exception e){
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the buffer
            }
        }

        return num;
    }
}