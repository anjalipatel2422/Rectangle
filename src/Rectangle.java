import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        /*This read the input provided by user
        *using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter first number:" );
                //This method reads the number provided using keyboard
                int num1 = scan.nextInt();
                System.out.print("Enter second number: ");
                int num2=scan.nextInt();
                // Closing Scanner after the use
                scan.close();

                //calculation product of two numbers
        int product = num1*num2;
        //Diplaying the multiplication result
        System.out.println("Output: "+product);
    }}










        


