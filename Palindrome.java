import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Welcome to palindrome checker");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to be checked");
        String word = input.nextLine();
        input.close();

        char[] stringCharacter = word.toCharArray();
        int length = word.length();
        String reverseStr = "";
        for (int i = length - 1; i >= 0; i--) {
            reverseStr = reverseStr + stringCharacter[i];
        }
//        System.out.println(reverseStr);
//        System.out.println("vv"); bug test
//        System.out.println(word);
        if (word.equals(reverseStr)){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
