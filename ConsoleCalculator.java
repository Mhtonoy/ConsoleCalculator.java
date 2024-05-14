import java.util.Scanner;
/*
    Building a Simple Console Calculator
    author: Mozammal Haque
    Email: mht.index@gmail.com
*/

public class ConsoleCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Java Console Calculator");
        System.out.println("Enter two numbers");

        //Input
        System.out.println("Number 1: ");
        double num1 = input.nextDouble();

        System.out.println("Number 2: ");
        double num2 = input.nextDouble();

        //Operations
        double sum = num1 + num2;
        double difference = num1-num2;
        double product = num1*num2;
        double quotient = num1/num2;

        //Output
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        //Close the Scanner
        input.close();
    }
}

//Output:
/**
 * 
Welcome to Java Console Calculator
Enter two numbers
Number 1:
45
Number 2:
25

Results:
Sum: 70.0
Difference: 20.0
Product: 1125.0
Quotient: 1.8
*/