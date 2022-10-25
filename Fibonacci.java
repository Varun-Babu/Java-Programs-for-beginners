import java.util.Scanner;

public class Fibonacci{
    static int a=0, b=0, c;
    public static int fibonacciNo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciNo(n - 1) + fibonacciNo(n - 2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of Fibonacci No to be generated");
        int count = input.nextInt();
        System.out.println(" ");
        System.out.print(0+" ");
        for(int i=1; i<=count;i++){
            System.out.print(fibonacciNo(i)+" ");
        }
    }
}