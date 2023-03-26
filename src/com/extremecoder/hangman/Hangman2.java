package com.extremecoder.hangman;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman2 {
    public static void main(String[] args) {
        System.out.print(
                "-------------------------------\n" +
                "Welcome to HANGMAN2\n" +
                "-------------------------------\n\n" +
                "OK Guessing Player ... turn around, while your friend enters the word to guess!\n\n" +
                "Other Player - Enter your word (up to 10 letters only, not case sensitive): "
        );
        Scanner scanner = new Scanner(System.in);
        char[] inputWord = scanner.next().toCharArray();
        int[] numberOfChar = new int[91];

        /* Converting input word to Upper case for making similar for quick matching with Character.toUpperCase(inputWord[i])
           make an array from A to Z & set zero as default & increment value if present in the input word
         */
        for (int i = 0; i < inputWord.length; i++) {
            inputWord[i] = Character.toUpperCase(inputWord[i]);
            numberOfChar[inputWord[i]] = ++numberOfChar[inputWord[i]];
        }

        // make a backup word for comparison
        char[] inputWordFull = Arrays.copyOf(inputWord,inputWord.length);

        //20 blank lines to clear hide the word to guess from the screen
        for (int i = 0; i < 20; i++) {
            System.out.print("\n");
        }
        int scoreLeft = inputWordFull.length;
        int scoreLeftOneShoot = inputWordFull.length;

        //Input guesses & checking
        for (int guessesLeft = 10; guessesLeft >= 1; guessesLeft--) {
            System.out.print("Word to date: ");

            //print stars for the number of letters in the word to guess.
            for (int i = 0; i < inputWord.length; i++) {
                if(inputWord[i] != '*') {
                    System.out.print("*");
                } else {
                    System.out.print(inputWordFull[i]);
                }
            }
            System.out.printf(" (%d guess(es) left)\n" +
                    "Want to solve the puzzle? Enter \"Y\" to solve the puzzle, or \"N\" to guess a character: ",
                    guessesLeft);

            // Input Y/y: Yes or N/n: No
            scanner = new Scanner(System.in);
            char[] solveInOneShot = scanner.next().toCharArray();

            // guess the entire word in one shot
            if(solveInOneShot[0] == 'Y' || solveInOneShot[0] == 'y') {
                scoreLeftOneShoot = inputWordFull.length;
                System.out.print("Letters to try: ");
                for (int i = 65 ; i <= 90; i++) {
                    if(numberOfChar[i] < 0) {
                        System.out.print("*");
                    } else {
                        System.out.printf("%c", i);
                    }
                }
                System.out.print("\n");
                char[] guessesInput;
                while (true) {
                    boolean isValidInput = true;
                    System.out.print("Which letter should I check for? ");
                    scanner = new Scanner(System.in);
                    guessesInput = scanner.next().toCharArray();
                    for (char letter: guessesInput) {
                        if (guessesInput.length > inputWordFull.length || letter < 65 || letter > 122 ||
                                (letter > 90 && letter < 97)) {
                            isValidInput = false;
                            break;
                        }
                    }
                    if(!isValidInput) {
                        System.out.println("--> Not a valid request - either not a letter or already guesses.");
                    } else {
                        break;
                    }
                }
                System.out.print("\n");
                if(guessesInput.length == inputWordFull.length) {
                    for (int i = 0; i < inputWordFull.length; i++) {
                        if(inputWordFull[i] == Character.toUpperCase(guessesInput[i])) {
                            scoreLeftOneShoot--;
                        }
                    }
                    if(scoreLeftOneShoot == 0) {
                        System.out.print("----------------------------------------------------\n" +
                                "Congratulations!!!\n" +
                                "You guessed the mystery word \"");
                        for (char letter : inputWordFull) {
                            System.out.print(letter);
                        }
                        System.out.printf("\" in %d guesses!\n", (guessesLeft-1));
                        guessesLeft = -1;
                    }
                }
            } else {
                System.out.print("Letters to try: ");
                for (int i = 65 ; i <= 90; i++) {
                    if(numberOfChar[i] < 0) {
                        System.out.print("*");
                    } else {
                        System.out.printf("%c", i);
                    }
                }
                System.out.print("\n");
                char guessesChar;
                while (true) {
                    System.out.print("Which letter should I check for? ");
                    scanner = new Scanner(System.in);
                    char[] guessesInput = scanner.next().toCharArray();
                    if (guessesInput.length > 1 || guessesInput[0] < 65 || guessesInput[0] > 122 ||
                            (guessesInput[0] > 90 && guessesInput[0] < 97)) {
                        System.out.println("--> Not a valid request - either not a letter or already guesses.");
                    } else {
                        guessesChar = guessesInput[0];
                        if(numberOfChar[Character.toUpperCase(guessesChar)] == -1) {
                            System.out.println("--> Not a valid request - either not a letter or already guesses.");
                        } else {
                            break;
                        }
                    }
                }
                System.out.print("\n");
                guessesChar = Character.toUpperCase(guessesChar);
                for (int i = 0; i < inputWord.length; i++) {
                    if(guessesChar == inputWord[i]) {
                        scoreLeft--;
                        if(numberOfChar[inputWord[i]] > 1) {
                            numberOfChar[inputWord[i]]--;
                        } else {
                            numberOfChar[inputWord[i]] = -1;
                        }
                        inputWord[i] = '*';
                        if(scoreLeft == 0) {
                            System.out.print("\n----------------------------------------------------\n" +
                                    "Congratulations!!!\n" +
                                    "You guessed the mystery word \"");
                            for (char letter : inputWordFull) {
                                System.out.print(letter);
                            }
                            System.out.printf("\" in %d guesses!\n", (guessesLeft-1));
                            guessesLeft = -1;
                        }
                        break;
                    }
                }
                if(numberOfChar[guessesChar] == 0) {
                    numberOfChar[guessesChar] = -1;
                }
            }
        }
        if(scoreLeft != 0 && scoreLeftOneShoot != 0) {
            System.out.print("\n----------------------------------------------------\n" +
                    "Sorry you didn't find the mystery word!\n" +
                    "It was \"");
            for (char letter : inputWordFull) {
                System.out.print(letter);
            }
            System.out.println("\"");
        }

        System.out.println("\nGoodbye ....\n" +
                "--------------------------------------------------");
    }
}
