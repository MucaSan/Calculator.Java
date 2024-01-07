import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner myObject = new Scanner(System.in);
        String condition = "Y";
        while (condition.equals("Y")){
            Scanner myobj1 = new Scanner(System.in);
            Scanner myobj2 = new Scanner(System.in);
            Scanner myCondition = new Scanner(System.in);
            System.out.println("Insert the desired mathematical operation (+, -, * or /)");
            String choice = myObject.nextLine();
            if (choice.equals("+")){
                System.out.println("Insert the first number!:");
                float num1 = myobj1.nextFloat();
                System.out.println("Insert the second number!:");
                float num2 = myobj2.nextFloat();
                System.out.println("The result is: " + sum(num1,num2));
                System.out.println("Would you like to calculate again? (Y/N)");
                condition = myCondition.nextLine().toUpperCase();
            }
            else if(choice.equals("-")){
                System.out.println("Insert the first number!:");
                float num1 = myobj1.nextFloat();
                System.out.println("Insert the second number!:");
                float num2 = myobj2.nextFloat();
                System.out.println("The result is: " + minus(num1,num2));
                System.out.println("Would you like to calculate again? (Y/N)");
                condition = myCondition.nextLine().toUpperCase();
            }
            else if(choice.equals("*")){
                System.out.println("Insert the first number!:");
                float num1 = myobj1.nextFloat();
                System.out.println("Insert the second number!:");
                float num2 = myobj2.nextFloat();
                System.out.println("The result is: " + multiplication(num1,num2));
                System.out.println("Would you like to calculate again? (Y/N)");
                condition = myCondition.nextLine().toUpperCase();
            }
            else if(choice.equals("/")){
                System.out.println("Insert the first number!:");
                float num1 = myobj1.nextFloat();
                System.out.println("Insert the second number!:");
                float num2 = myobj2.nextFloat();
                System.out.println("The result is: " + division(num1,num2));
                System.out.println("Would you like to calculate again? (Y/N)");
                condition = myCondition.nextLine().toUpperCase();
            }
            else{
                System.out.println("Invalid choice!");
                System.out.println("Would you like to calculate again? (Y/N)");
                condition = myCondition.nextLine().toUpperCase();
            }
        }

    }
    public static float sum(float x , float y){
        return x+y;
    }
    public static float minus(float x, float y){
        return x - y;
    }
    public static float division(float x, float y){
        return x / y;
    }
    public static float multiplication(float x, float y){
        return x * y;
    }

}
