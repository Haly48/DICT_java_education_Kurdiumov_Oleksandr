package hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String ans = "java";
        if (word.equals(ans))
        {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}