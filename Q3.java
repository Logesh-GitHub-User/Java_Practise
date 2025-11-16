import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal value: ");
        double value = scanner.nextDouble();
        
        int integer = (int)value;
        double decimal = value-integer;
        
        int rounded_value;
        if(value<0){
            if(decimal<=-0.5){
                rounded_value=integer-1;
                System.out.println("Rounded value: "+rounded_value);    
            }
            else{
                rounded_value=integer;
                System.out.println("Rounded value: "+rounded_value);
            }
        }
        else{
            if(decimal<0.5){
            rounded_value=integer;
            System.out.println("Rounded value: "+rounded_value);    
            }
            else{
                rounded_value=integer+1;
                System.out.println("Rounded value: "+rounded_value);
            }
        }
        scanner.close();
    }
}
