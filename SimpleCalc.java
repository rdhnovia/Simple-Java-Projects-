// import package Scanner to receive user input
import java.util.Scanner;

public class SimpleCalc {
    
    public static void main(String[] args) {
        //create variable
        Double number1, number2, result;
        char operator;

    Scanner input = new Scanner(System.in);                                         // create an object of Scanner class

    System.out.println("Choose an operator: +, -, *, /, or %");                  // input specific operator         
    operator = input.next().charAt(0);

    System.out.println("Enter first number");                                    // input first number
    number1 = input.nextDouble();

    System.out.println("Enter second number");                                   // input second number
    number2 = input.nextDouble();

    switch (operator) {

      case '+':                                                                     // case 1 for addition between two numbers
        result = number1 + number2;
        System.out.println("Result");
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':                                                                     // case 2 for subtraction between two numbers
        result = number1 - number2;                                                 
        System.out.println("Result");
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':                                                                     // case 3 for multiplication between two numbers
        result = number1 * number2;
        System.out.println("Result");
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':                                                                     // case 4 for division between two numbers
        result = number1 / number2;
        System.out.println("Result");
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      case '%':                                                                     // case 5 for modulus between two numbers
        result = number1 % number2;
        System.out.println("Result");
        System.out.println(number1 + " % " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
    }

}
