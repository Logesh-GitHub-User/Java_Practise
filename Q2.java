//3 digit Armstrong number checker
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3 digit number to check whether its an armstrong number: ");
        int number = scanner.nextInt();
        
        if(number >= 100 && number < 1000){
            int num = number;
        
            int ones = num%10; // getting one's digit
            num /= 10;
            int tens = num%10; // getting ten's digit
            num /= 10;
            int hundreds = num%10; // getting hundred's digit
            
            int a = (int)Math.pow(ones,3) + (int)Math.pow(tens,3) + (int)Math.pow(hundreds,3);
            
            if(a==number){
                System.out.println(hundreds+"^3 + "+tens+"^3 + "+ones+"^3 = "+a);
                System.out.println(a+" == "+number);
                System.out.println(number+" is an ARMSTRONG Number.");
            } 
            else{
                System.out.println(hundreds+"^3 + "+tens+"^3 + "+ones+"^3 = "+a);
                System.out.println(a+" != "+number);
                System.out.println(number+" is not an Armstrong number.");
            }
        }
        else{
            System.out.println("Kindly enter a number between 100 and 999(Inclusive)");
        }
        scanner.close();
    }
}
