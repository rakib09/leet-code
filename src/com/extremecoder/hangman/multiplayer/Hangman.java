package com.extremecoder.hangman.multiplayer;

import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    private int gameId = 0;
    private static int gameIdInc = 0;
    private char[] inputWord,inputWordFull;
    private int[] numberOfChar;
    private int scoreLeft,scoreLeftOneShoot;
    private int guessesLeft = 10;
    public Hangman() {
        this.gameIdInc++;
        this.gameId = this.gameIdInc;
    }
    public void initializeGame_collectWord(Scanner scanner) {
        System.out.printf(
                "-------------------------------\n" +
                        "Welcome to HANGMAN %d\n" +
                        "-------------------------------\n\n" +
                        "OK Guessing Player ... turn around, while your friend enters the word to guess!\n\n" +
                        "Other Player - Enter your word (up to 10 letters only, not case sensitive): ", gameId
        );
        inputWord = scanner.next().toCharArray();
        numberOfChar = new int[91];

        /* Converting input word to Upper case for making similar for quick matching with Character.toUpperCase(inputWord[i])
           make an array from A to Z & set zero as default & increment value if present in the input word
         */
        for (int i = 0; i < inputWord.length; i++) {
            inputWord[i] = Character.toUpperCase(inputWord[i]);
            numberOfChar[inputWord[i]] = ++numberOfChar[inputWord[i]];
        }

        // make a backup word for comparison
        inputWordFull = Arrays.copyOf(inputWord,inputWord.length);

        //20 blank lines to clear hide the word to guess from the screen
        for (int i = 0; i < 20; i++) {
            System.out.print("\n");
        }
        scoreLeft = inputWordFull.length;
        scoreLeftOneShoot = inputWordFull.length;
    }

    public void play_a_guess(Scanner scanner) {
        //Input guesses & checking
        if (guessesLeft >= 1) {
            System.out.printf("GameID %d: Word to date: ", gameId);

            //print stars for the number of letters in the word to guess.
            for (int i = 0; i < inputWord.length; i++) {
                if(inputWord[i] != '*') {
                    System.out.print("*");
                } else {
                    System.out.print(inputWordFull[i]);
                }
            }
            System.out.printf(" (%d guess(es) left)\n" +
                            "GameID %d: Want to solve the puzzle? Enter \"Y\" to solve the puzzle, or \"N\" to guess a character: ",
                    guessesLeft, gameId);

            // Input Y/y: Yes or N/n: No
            char[] solveInOneShot = scanner.next().toCharArray();

            // guess the entire word in one shot
            if(solveInOneShot[0] == 'Y' || solveInOneShot[0] == 'y') {
                scoreLeftOneShoot = inputWordFull.length;
                System.out.printf("GameID %d: Letters to try: ", gameId);
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
                    System.out.printf("GameID %d: Which letter should I check for? ", gameId);
                    scanner = new Scanner(System.in);  //need to remove
                    guessesInput = scanner.next().toCharArray();
                    for (char letter: guessesInput) {
                        if (guessesInput.length > inputWordFull.length || letter < 65 || letter > 122 ||
                                (letter > 90 && letter < 97)) {
                            isValidInput = false;
                            break;
                        }
                    }
                    if(!isValidInput) {
                        System.out.printf("GameID %d: --> Not a valid request - either not a letter or already guesses.\n", gameId);
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
                        System.out.printf("----------------------------------------------------\n" +
                                "GameID %d: Congratulations!!!\n" +
                                "          You guessed the mystery word \"", gameId);
                        for (char letter : inputWordFull) {
                            System.out.print(letter);
                        }
                        System.out.printf("\" in %d guesses!\n", (guessesLeft-1));
                        System.out.printf("\nGameID %d: Goodbye ....\n" +
                                "--------------------------------------------------\n", gameId);
                        guessesLeft = -1;
                    }
                }
            } else {
                System.out.printf("GameID %d: Letters to try: ", gameId);
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
                    System.out.printf("GameID %d: Which letter should I check for? ", gameId);
                    scanner = new Scanner(System.in);
                    char[] guessesInput = scanner.next().toCharArray();
                    if (guessesInput.length > 1 || guessesInput[0] < 65 || guessesInput[0] > 122 ||
                            (guessesInput[0] > 90 && guessesInput[0] < 97)) {
                        System.out.printf("GameID %d: --> Not a valid request - either not a letter or already guesses.\n", gameId);
                    } else {
                        guessesChar = guessesInput[0];
                        if(numberOfChar[Character.toUpperCase(guessesChar)] == -1) {
                            System.out.printf("GameID %d: --> Not a valid request - either not a letter or already guesses.\n", gameId);
                        } else {
                            break;
                        }
                    }
                }
                guessesChar = Character.toUpperCase(guessesChar);
                boolean isSuccessGuess = false;
                for (int i = 0; i < inputWord.length; i++) {
                    if(guessesChar == inputWord[i]) {
                        isSuccessGuess = true;
                        inputWord[i] = '*';
                        break;
                    }
                }
                if(isSuccessGuess) {
                    System.out.printf("GameID %d: --> great guess!\n", gameId);
                    scoreLeft--;
                    if(numberOfChar[guessesChar] > 1) {
                        numberOfChar[guessesChar]--;
                    } else {
                        numberOfChar[guessesChar] = -1;
                    }

                    if(scoreLeft == 0) {
                        System.out.printf("\n----------------------------------------------------\n" +
                                "GameID %d: Congratulations!!!\n" +
                                "          You guessed the mystery word \"", gameId);
                        for (char letter : inputWordFull) {
                            System.out.print(letter);
                        }
                        System.out.printf("\" in %d guesses!\n", (guessesLeft-1));
                        System.out.printf("\nGameID %d: Goodbye ....\n" +
                                "--------------------------------------------------\n", gameId);
                        guessesLeft = -1;
                    }
                } else {
                    System.out.printf("GameID %d: --> Sorry, wrong guess!\n", gameId);
                }
                System.out.print("\n");
                if(numberOfChar[guessesChar] == 0) {
                    numberOfChar[guessesChar] = -1;
                }
            }
            guessesLeft--;
        } else {
            if(scoreLeft != 0 && scoreLeftOneShoot != 0) {
                System.out.printf("\n----------------------------------------------------\n" +
                        "GameID %d: Sorry you didn't find the mystery word!\n" +
                        "It was \"", gameId);
                for (char letter : inputWordFull) {
                    System.out.print(letter);
                }
                System.out.println("\"");
                System.out.printf("\nGameID %d: Goodbye ....\n" +
                        "--------------------------------------------------\n", gameId);
            }
        }
    }

    public void playGame(Scanner scanner) {
        while (guessesLeft > 0){
            play_a_guess(scanner);
        }

    }
}
