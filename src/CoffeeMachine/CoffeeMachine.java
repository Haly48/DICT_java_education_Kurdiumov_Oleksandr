package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeebeans = 120;
    static int cups = 9;
    static int money = 550;

    static Boolean exit = false;
    static Scanner scanner = new Scanner(System.in);

    enum Status {
        Choise, Buy, Fill, Take, Remaining, Exit
    }

    static Status cStatus = Status.Choise;

    public static void main(String[] args) {
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            System.out.print("> ");
            String action = scanner.next();
            switch (action) {
                case "buy" -> {
                    cStatus = Status.Buy;
                    System.out.println(cStatus);
                    buy();
                }
                case "fill" -> {
                    cStatus = Status.Fill;
                    System.out.println(cStatus);
                    fill();
                }
                case "take" -> {
                    cStatus = Status.Take;
                    System.out.println(cStatus);
                    take();
                }
                case "remaining" -> {
                    cStatus = Status.Remaining;
                    System.out.println(cStatus);
                    Inf();
                }
                case "exit" -> {
                    exit();
                    System.out.println(cStatus);
                }
            }
        } while (cStatus != Status.Exit);
            coffeMachineFunc();
    }

    private static void coffeMachineFunc() {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String func = scanner.next();
            switch (func) {
                case "fill" -> fill();
                case "buy" -> buy();
                case "take" -> take();
                case "remaining" -> Inf();
                case "exit" -> check = false;
            }
        }
    }
    private static void buy() {
        Scanner scanner = new Scanner(System.in);
        String coffeType = "";
        boolean check = true;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        coffeType = scanner.next();
        switch (coffeType) {
            case "1":
                if (water >= 250 && coffeebeans >= 16) {
                    System.out.println("I have enough resources, making you a coffee!");
                    money = money + 4;
                    cups = cups - 1;
                }
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else {
                    water = water - 250;
                }
                if (coffeebeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else {
                    coffeebeans = coffeebeans - 16;
                }
                break;
            case "2":
                if (water >= 350 && coffeebeans >= 20 && milk >= 75) {
                    System.out.println("I have enough resources, making you a coffee!");
                    money = money + 7;
                    cups = cups - 1;
                }
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else {
                    water = water - 350;
                }
                if (coffeebeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else {
                    coffeebeans = coffeebeans - 20;
                }
                if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else {
                    milk = milk - 75;
                }
                break;
            case "3":
                if (water >= 200 && coffeebeans >= 12 && milk >= 100) {
                    System.out.println("I have enough resources, making you a coffee!");
                    money = money + 6;
                    cups = cups - 1;
                }
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else {
                    water = water - 200;
                }
                if (coffeebeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else {
                    coffeebeans = coffeebeans - 12;
                }
                if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else {
                    milk = milk - 100;
                }
                break;
            case "back":
                return;
            default:
                if (water == 0 || milk == 0 || coffeebeans == 0) {
                    System.out.println("its default choice");
                }
        }
    }
    private static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int water_inp = scanner.nextInt();
        water = water + water_inp;
        System.out.println("Write how many ml of milk do you want to add:");
        int milk_inp = scanner.nextInt();
        milk = milk + milk_inp;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffeebeans_inp = scanner.nextInt();
        coffeebeans = coffeebeans + coffeebeans_inp;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups_inp = scanner.nextInt();
        cups = cups + cups_inp;
    }
    private static void Inf() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " " + "of water");
        System.out.println(milk + " " + "of milk");
        System.out.println(coffeebeans + " " + "of coffee beans");
        System.out.println(cups + " " + "of disposable cups");
        System.out.println(money + " " + "of money");
    }
    private static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    static void exit() {
        cStatus = Status.Exit;
        System.exit(0);
    }
}
