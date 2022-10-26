import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        System.out.println("Enter a single character to check whether its a vowel or consonant");
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);
        switch (Character.toLowerCase(letter)){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
                System.out.println("Is a Vowel");
                break;
            default:
                System.out.println("Is a Consonant");
        }


    }
}
