package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello my name is Juan");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name");
        Scanner input  = new Scanner(System.in);
        String name  = input.next();
        System.out.println("What a great name you have, " + name + "!");
    }
}
