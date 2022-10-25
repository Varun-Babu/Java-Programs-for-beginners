import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
        System.out.println("Build a Number Triangle");
        System.out.println("   ");
        Scanner input = new Scanner(System.in);
        System.out.println("   ");
        System.out.println("Enter the height of the triangle");
        int height = input.nextInt();
        if(height!=0){
            for(int i=1;i<=height;i++){
                for(int j=1;j<=i;j++) {
                    System.out.print(i +"");
                }
                System.out.println();
            }
        }
        else if(height == 0){
            System.out.println("Oops too small");
        }
    }
}

