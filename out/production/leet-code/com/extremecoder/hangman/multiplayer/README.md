### Hangman Game (multiple and simultaneous)

Use either the Hangman program of Assignment 2 or Assignment 3. Convert it to a class called
“Hangman” that can be played as multiple and simultaneous games via another class called “Driver” by
creating the Hangman objects.

Rules of Hangman game remain the same as before; however, the Hangman class allows the Driver class
to create objects and execute the methods of the class which are:

* Hangman(): constructor that increments the game_id (an instance variable of Hangman class).
  The game_id must be displayed in each dialogue of that game as detailed in the screenshot
  examples below.
* initializeGame_collectWord(Scanner keyIn): that prompts the player 1 of a game for the word to
  be guessed by the player 2 of that game.
* play_a_guess(Scanner keyIn): that executes one prompt (either guessing a letter or full word)
* playGame(Scanner keyIn): that executes all prompts (either guessing a letter or full word)
  repeatedly until the game is completed.

You should maintain an instance variable for the status of the game if it’s completed or in-progress.
Once a game is completed, the methods play_a_guess() and playGame() shouldn’t do anything.

Example 1: The results for the following Driver class are presented in the screenshots below:

```
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Hangman h1 = new Hangman();
        h1.initializeGame_collectWord(key);
        Hangman h2 = new Hangman();
        h2.initializeGame_collectWord(key);
        h2.playGame(key);
        Hangman h3 = new Hangman();
        Hangman h4 = new Hangman();
        h3.initializeGame_collectWord(key);
        h3.play_a_guess(key);
        h4.initializeGame_collectWord(key);
        h3.play_a_guess(key);
        h4.play_a_guess(key);
        h3.play_a_guess(key);
        h4.play_a_guess(key);
        h3.playGame(key);
        h4.playGame(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
        h1.play_a_guess(key);
    }
}
```

Here are a sample run to illustrate the behavior of the program.
```
-------------------------------
Welcome to HANGMAN 1
-------------------------------
OK Guessing Player ... turn around, while your friend enters the word to guess!
Other Player - Enter your word (up to 10 letters only, not case sensitive): Talla
<<< 20 blank lines here >>>
-------------------------------
Welcome to HANGMAN 2
-------------------------------
OK Guessing Player ... turn around, while your friend enters the word to guess!
Other Player - Enter your word (up to 10 letters only, not case sensitive): Karan
<<< 20 blank lines here >>>
GameID 2: Word to date: ***** (10 guess(es) left)
GameID 2: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 2: Letters to try: ABCDEFGHIJKLMNOPQRSTUVWXYZ
GameID 2: Which letter should I check for? K
GameID 2: --> great guess!
GameID 2: Word to date: K**** (9 guess(es) left)
GameID 2: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 2: Letters to try: ABCDEFGHIJ*LMNOPQRSTUVWXYZ
GameID 2: Which letter should I check for? Z
GameID 2: --> Sorry, wrong guess!
GameID 2: Word to date: K**** (8 guess(es) left)
GameID 2: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 2: Letters to try: ABCDEFGHIJ*LMNOPQRSTUVWXY*
GameID 2: Which letter should I check for? A
GameID 2: --> great guess!
GameID 2: Word to date: KA*** (7 guess(es) left)
GameID 2: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 2: Letters to try: ABCDEFGHIJ*LMNOPQRSTUVWXY*
GameID 2: Which letter should I check for? A
GameID 2: --> great guess!
GameID 2: Word to date: KA*A* (6 guess(es) left)
GameID 2: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 2: Letters to try: *BCDEFGHIJ*LMNOPQRSTUVWXY*
GameID 2: Which letter should I check for? R
GameID 2: --> great guess!
GameID 2: Word to date: KARA* (5 guess(es) left)
GameID 2: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 2: Letters to try: *BCDEFGHIJ*LMNOPQ*STUVWXY*
GameID 2: Which letter should I check for? X
GameID 2: --> Sorry, wrong guess!
GameID 2: Word to date: KARA* (4 guess(es) left)
GameID 2: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 2: Letters to try: *BCDEFGHIJ*LMNOPQ*STUVW*Y*
GameID 2: Which letter should I check for? N
GameID 2: --> great guess!
----------------------------------------------------
GameID 2: Congratulations!!!
You guessed the mystery word "KARAN" in 7 guesses!
GameID 2: Goodbye ....
--------------------------------------------------
-------------------------------
Welcome to HANGMAN 3
-------------------------------
OK Guessing Player ... turn around, while your friend enters the word to guess!
Other Player - Enter your word (up to 10 letters only, not case sensitive): Sunday
<<< 20 blank lines here >>>
GameID 3: Word to date: ****** (10 guess(es) left)
GameID 3: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 3: Letters to try: ABCDEFGHIJKLMNOPQRSTUVWXYZ
GameID 3: Which letter should I check for? A
GameID 3: --> great guess!
-------------------------------
Welcome to HANGMAN 4
-------------------------------
OK Guessing Player ... turn around, while your friend enters the word to guess!
Other Player - Enter your word (up to 10 letters only, not case sensitive): Monday
<<< 20 blank lines here >>>
GameID 3: Word to date: ****A* (9 guess(es) left)
GameID 3: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 3: Letters to try: *BCDEFGHIJKLMNOPQRSTUVWXYZ
GameID 3: Which letter should I check for? S
GameID 3: --> great guess!
GameID 4: Word to date: ****** (10 guess(es) left)
GameID 4: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 4: Letters to try: ABCDEFGHIJKLMNOPQRSTUVWXYZ
GameID 4: Which letter should I check for? M
GameID 4: --> great guess!
GameID 3: Word to date: S***A* (8 guess(es) left)
GameID 3: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 3: Letters to try: *BCDEFGHIJKLMNOPQR*TUVWXYZ
GameID 3: Which letter should I check for? U
GameID 3: --> great guess!
GameID 4: Word to date: M***** (9 guess(es) left)
GameID 4: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 4: Letters to try: ABCDEFGHIJKL*NOPQRSTUVWXYZ
GameID 4: Which letter should I check for? O
GameID 4: --> great guess!
GameID 3: Word to date: SU**A* (7 guess(es) left)
GameID 3: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 3: Letters to try: *BCDEFGHIJKLMNOPQR*T*VWXYZ
GameID 3: Which letter should I check for? D
GameID 3: --> great guess!
GameID 3: Word to date: SU*DA* (6 guess(es) left)
GameID 3: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 3: Letters to try: *BC*EFGHIJKLMNOPQR*T*VWXYZ
GameID 3: Which letter should I check for? Y
GameID 3: --> great guess!
GameID 3: Word to date: SU*DAY (5 guess(es) left)
GameID 3: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: Y
GameID 3: Enter the complete word: SUNDAY
----------------------------------------------------
GameID 3: Congratulations!!!
You guessed the mystery word "SUNDAY" in 6 guesses!
GameID 3: Goodbye ....
--------------------------------------------------
GameID 4: Word to date: MO**** (8 guess(es) left)
GameID 4: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 4: Letters to try: ABCDEFGHIJKL*N*PQRSTUVWXYZ
GameID 4: Which letter should I check for? M
GameID 4: --> Not a valid request - either not a letter or already guessed.
GameID 4: Which letter should I check for? N
GameID 4: --> great guess!
GameID 4: Word to date: MON*** (7 guess(es) left)
GameID 4: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: Y
GameID 4: Enter the complete word: MONDA
GameID 4: Incorrect guess, Continue guessting next character
GameID 4: Letters to try: ABCDEFGHIJKL***PQRSTUVWXYZ
GameID 4: Which letter should I check for? D
GameID 4: --> great guess!
GameID 4: Word to date: MOND** (5 guess(es) left)
GameID 4: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: Y
GameID 4: Enter the complete word: MONDAY
----------------------------------------------------
GameID 4: Congratulations!!!
You guessed the mystery word "MONDAY" in 6 guesses!
GameID 4: Goodbye ....
--------------------------------------------------
GameID 1: Word to date: ***** (10 guess(es) left)
GameID 1: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 1: Letters to try: ABCDEFGHIJKLMNOPQRSTUVWXYZ
GameID 1: Which letter should I check for? T
GameID 1: --> great guess!
GameID 1: Word to date: T**** (9 guess(es) left)
GameID 1: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 1: Letters to try: ABCDEFGHIJKLMNOPQRS*UVWXYZ
GameID 1: Which letter should I check for? A
GameID 1: --> great guess!
GameID 1: Word to date: TA*** (8 guess(es) left)
GameID 1: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 1: Letters to try: ABCDEFGHIJKLMNOPQRS*UVWXYZ
GameID 1: Which letter should I check for? A
GameID 1: --> great guess!
GameID 1: Word to date: TA**A (7 guess(es) left)
GameID 1: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 1: Letters to try: *BCDEFGHIJKLMNOPQRS*UVWXYZ
GameID 1: Which letter should I check for? L
GameID 1: --> great guess!
GameID 1: Word to date: TAL*A (6 guess(es) left)
GameID 1: Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a
character: N
GameID 1: Letters to try: *BCDEFGHIJKLMNOPQRS*UVWXYZ
GameID 1: Which letter should I check for? L
GameID 1: --> great guess!
----------------------------------------------------
GameID 1: Congratulations!!!
You guessed the mystery word "TALLA" in 5 guesses!
GameID 1: Goodbye ....
--------------------------------------------------
```
