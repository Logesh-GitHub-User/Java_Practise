import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter Value "+(i+1)+": ");
            values[i] = scanner.nextDouble();
        }
        
        double min = Math.min(values[0],Math.min(values[1],values[2]));
        double max = Math.max(values[0],Math.max(values[1],values[2]));
        
        //Does not handle the case where two or more inputs are same
        
        for(int j=0;j<3;j++){
            if(values[j] != min && values[j] != max){
                System.out.println("Minimum value: "+min);
                System.out.println("Maximum value: "+max);
                System.out.println("The middle value is: "+values[j]);
            }
        }
        
        scanner.close();
    }
}
