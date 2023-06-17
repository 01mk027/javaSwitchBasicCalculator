import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2, select;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        n1 = input.nextInt();
        System.out.print("Enter second number: ");
        n2 = input.nextInt();
        System.out.print("1-) Addition\n2-) Subtraction\n3-) Multiplication\n4-) Division");
        System.out.println("\nChoose transaction type:");
        select = input.nextInt();
        switch(select)
        {
            case 1:
            {
                System.out.println("Addition of two numbers = " + (n1 + n2));
                break;
            }
            case 2:
            {
                System.out.println("Subtraction of two numbers = " + (n1 - n2));
                break;
            }
            case 3:
            {
                System.out.println("Multiplication of two numbers = " + (n1 * n2));
                break;
            }
            case 4:
            {
                if(n2 != 0)
                {
                    System.out.println("Division of two numbers: " + (n1 / n2));
                }
                else
                {
                    System.out.println("Dividing a number to zero is not possible.");
                }
                break;
            }
            default:
                System.out.println("Please enter a valid transaction type.");
        }
    }
}
