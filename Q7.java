import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("\nEnter second number: ");
        int second = scanner.nextInt();
        
        int current;
        System.out.println("\nFirst 20 terms");
        System.out.print("\nThe Sequence: "+first+", "+second+", ");
        for(int i=0;i<18;i++){
            current = 2*second-first;
            System.out.print(current+", ");
            first=second;
            second=current;
        }
        System.out.print("END");
        scanner.close();
    }
}
