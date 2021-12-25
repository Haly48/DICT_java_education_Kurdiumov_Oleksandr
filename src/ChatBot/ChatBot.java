package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello, my name is Juan");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name");
        Scanner input  = new Scanner(System.in);
        String name  = input.next();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3  = input.nextInt();
        int remainder5  = input.nextInt();
        int remainder7  = input.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("You age is " + age + "; that's good time to start programming.");
        System.out.println("Now I will prove to you that i can count to any numbers you want");
        int num = input.nextInt();
        int i = 0;
        while (i<=num-1){
            i+=1;
            System.out.println(i + " !");
        }
    }
}
