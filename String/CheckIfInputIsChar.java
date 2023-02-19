package String;

import java.util.Scanner;

public class CheckIfInputIsChar {
    // Check if input is a character
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a character");
        } else {
            System.out.println(ch + " is not a character");
        }
        scanner.close();
    }
    
}
