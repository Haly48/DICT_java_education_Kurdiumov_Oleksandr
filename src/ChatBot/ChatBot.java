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
        System.out.println("Let's test your knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines");
        System.out.println("3. To determinate the education time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        /* switch (ans)
        {
            case 1:
                System.out.println("Please, try again!");
            case 2:
                System.out.println("Great, you're right!");
                break;
            case 3:
                System.out.println("Please, try again!");
            case 4:
                System.out.println("Please, try again!");
            default:
                System.out.println("There's no such variant");
        }*/
        int ans = input.nextInt();
        while (ans != 2)
        {
              if (ans == 1)
            {
                System.out.println("Please, try again.");
                ans = input.nextInt();
            }
            else if(ans == 3)
            {
                System.out.println("Please, try again.");
                ans = input.nextInt();
            }
            else if(ans == 4)
            {
                System.out.println("Please, try again.");
                ans = input.nextInt();
            }
              else
              {
                  System.out.println("Out of range. Select from 1 to 4.");
                  ans = input.nextInt();
              }
        }
        System.out.println("Great, you're right!");
        System.out.println("Goodbye, have a nice day!");
    }
}
