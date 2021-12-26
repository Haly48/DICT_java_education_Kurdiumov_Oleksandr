package hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;


public class Hangman {

    public static final String[] WORDS = {"python", "java", "javascript", "kotlin"};

    public static final Random RANDOM = new Random();

    public static final int MAX_ERRORS = 8;

    private String wordToFind;

    private char[] wordFound;
    private int nbErrors;

    private ArrayList < String > letters = new ArrayList < > ();


    private String nextWordToFind() {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }


    public void newGame() {
        nbErrors = 0;
        letters.clear();
        wordToFind = nextWordToFind();


        wordFound = new char[wordToFind.length()];

        for (int i = 0; i < wordFound.length; i++) {
            wordFound[i] = '_';
        }
    }


    public boolean wordFound() {
        return wordToFind.contentEquals(new String(wordFound));
    }


    private void enter(String c) {

        if (!letters.contains(c)) {

            if (wordToFind.contains(c)) {

                int index = wordToFind.indexOf(c);

                while (index >= 0) {
                    wordFound[index] = c.charAt(0);
                    index = wordToFind.indexOf(c, index + 1);
                }
            } else {

                nbErrors++;
            }

            letters.add(c);
        }
    }

    private String wordFoundContent() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < wordFound.length; i++) {
            builder.append(wordFound[i]);

            if (i < wordFound.length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }


    public void play() {
        try (Scanner input = new Scanner(System.in)) {

            while (nbErrors < MAX_ERRORS) {
                System.out.print("Input a letter : >");

                String str = input.next();

                if (str.length() > 1) {
                    str = str.substring(0, 1);
                }

                enter(str);

                System.out.println(wordFoundContent());

                if (wordFound()) {
                    System.out.println("You win!");
                    break;
                } else {
                    System.out.println("That letter doesn't appear in the word");
                }
            }

            if (nbErrors == MAX_ERRORS) {
                System.out.println("You lose!");
                System.out.println("=> Word to find was : " + wordToFind);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Type 'play'; to play the game, 'exit'; to quit: >");
        Scanner input  = new Scanner(System.in);
        String PorE  = input.next();
        if (PorE.equals("play")){
            Hangman hangmanN = new Hangman();
            hangmanN.newGame();
            hangmanN.play();
        }else if(PorE.equals("exit")){
            exit(0);
        }
    }

}