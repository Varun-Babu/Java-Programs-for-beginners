import java.util.Scanner;

public class Perfectsquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Find out how many perfect square exist bw your favourite numbers");
        System.out.println("  ");
        System.out.println("Enter the first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = input.nextInt();
        input.close();

        for(int i = firstNumber; i<= secondNumber; i++){
            double square = Math.sqrt(i);
            if(square- Math.floor(square)==0){
                System.out.print((i+" "));
            }
        }
    }
}
