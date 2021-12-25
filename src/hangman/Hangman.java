package hangman;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    static String[] Words = { "python", "java", "javascript", "kotlin" };
    public static void main(String[] args) {
        String ans = Words[new Random().nextInt(Words.length)];
        System.out.println("HANGMAN");
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the word: > ");
        String word = input.next();
        if (word.equals(ans))
        {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}