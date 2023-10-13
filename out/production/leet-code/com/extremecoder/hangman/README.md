### Hangman Game

General rules for the hangman word game: [wikipedia](http://en.wikipedia.org/wiki/Hangman_%28game%29)
“Hangman is a guessing game for two or more players. One player thinks of a word, phrase or sentence
and the other(s) tries to guess it by suggesting letters within a certain number of guesses.” The game is
over when: The guessing player completes the word or guesses the whole word correctly, or the number
of tries is exhausted.

#### Hangman2 Game (only to guess the word)

1. The word to guess can have repeated letters.
2. The word to guess is not case sensitive, and only up to a maximum of 10 characters.
3. The guessing player has 10 tries to find the letters.
4. The player can guess the entire word in one shot, at any time of the game, or S/he must can guess
   and write one letter at a time.

Recommended skeleton of the structure of your program (refer to screen shots for examples):

1. A player enters the word to guess. Remember a word can only have letters.
2. Print 20 blank lines to clear hide the word to guess from the screen, before guessing player starts.
3. Guessing player (the other player) is shown with stars for the number of letters in the word to
   guess. Your program also shows the number of guesses left as well as a list of the letters still not
   picked (See sample run output below).
4. Guessing player is prompted for a letter.
5. As long as the input is more than one character long, is not a letter or is a letter that was already
   tried, your program should keep on prompting the user for valid input. Incorrect entries should
   not be counted as guesses.
6. Once a valid letter is entered, your program (a) updates the list of letters (alphabet) still left to try
   by removing this letter from the list if there are no more characters of the same letter in the word,
   (b) reduces the number of guesses left by one, and (c) checks whether the letter is part of the word
   to guess. If it is, then replace the star with the letter in the appropriate position.

Steps 3 to 6 are repeated till all letters in the word are found or reaches 10 guesses.

7. Your program name must be “Hangman2” and all program code must be in the main() method.

- Your program should use: character arrays, selections, and loops. Your program shouldn’t use
  Strings. However, you can use String to Array and vice versa, conversion methods such as:
  <String reference>.toCharArray() method; and String.valueOf(<array reference>) method to
  convert String to Character array and vice versa. You can convert an array to string for printing
  (i.e., display) purpose, and Arrays.equals(<array1 reference>, <array2 reference>) for equality.

Your program ends with a summary of the game (See sample output).

Here are 2 sample runs to illustrate the behavior of the program.

Sample output 1 –
Guessing player does not guess the word

```
-------------------
Welcome to HANGMAN2
-------------------

OK Guessing Player ... turn around, while your friend enters the word to guess!

Other Player - Enter your word (up to 10 letters only, not case sensitive): Talla
<<<< 20 blank lines here >>>>
Word to date: ***** (10 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: N
Letters to try: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Which letter should I check for? A
Word to date: *A*** (9 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: N
Letters to try: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Which letter should I check for? T
Word to date: TA*** (8 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: N
Letters to try: ABCDEFGHIJKLMNOPQRS*UVWXYZ
Which letter should I check for? L
Word to date: TAL** (7 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: N
Letters to try: ABCDEFGHIJKLMNOPQRS*UVWXYZ
Which letter should I check for? a
Word to date: TAL*A (6 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: *BCDEFGHIJKLMNOPQRS*UVWXYZ
Which letter should I check for? k
Word to date: TAL*A (5 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: *BCDEFGHIJ*LMNOPQRS*UVWXYZ
Which letter should I check for? b
Word to date: TAL*A (4 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: **CDEFGHIJ*LMNOPQRS*UVWXYZ
Which letter should I check for? a
--> Not a valid request - either not a letter or already guesses.
Which letter should I check for? h
Word to date: TAL*A (3 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: **CDEFG*IJ*LMNOPQRS*UVWXYZ
Which letter should I check for? j
Word to date: TAL*A (2 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: **CDEFG*I**LMNOPQRS*UVWXYZ
Which letter should I check for? e
Word to date: TAL*A (1 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: **CD*FG*I**LMNOPQRS*UVWXYZ
Which letter should I check for? b
--> Not a valid request - either not a letter or already guesses.
Which letter should I check for? n
----------------------------------

Sorry you didn't find the mystery word!
It was "TALLA"
Goodbye ....
----------------------------------

```

Sample output 2 –
Guessing player finds the word

```
-------------------
Welcome to HANGMAN2
-------------------

OK Guessing Player ... turn around, while your friend enters the word to guess!

Other Player - Enter your word (up to 10 letters only, not case sensitive): Talla
<<<< 20 blank lines here >>>>
Word to date: ***** (10 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Which letter should I check for? a
Word to date: *A*** (9 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: ABCDEFGHIJKLMNOPQRSTUVWXYZ
Which letter should I check for? a
Word to date: *A**A (8 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: *BCDEFGHIJKLMNOPQRSTUVWXYZ
Which letter should I check for? t
Word to date: TA**A (7 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: *BCDEFGHIJKLMNOPQRS*UVWXYZ
Which letter should I check for? l
Word to date: TAL*A (6 guess(es) left)
Want to solve the puzzle? Enter "Y" to solve the puzzle, or "N" to guess a character: n
Letters to try: *BCDEFGHIJKLMNOPQRS*UVWXYZ
Which letter should I check for? l
----------------------------------

Congratulations!!!
You guessed the mystery word "TALLA" in 5 guesses!
Goodbye ....
----------------------------------
```



RESTRICTION for Question #1:

- Your program should use: character arrays, selections, and loops. Your program shouldn’t use
  Strings. However, you can use String to Array and vice versa, conversion methods such as:
  <String reference>.toCharArray() method; and String.valueOf(<array reference>) method to
  convert String to Character array and vice versa. You can use all methods in Arrays class.
- You can convert an array to string for printing (i.e., display) purpose, Arrays.equals(<array1
  reference>, <array2 reference>) for equality.
- Your output should be formatted as closely as the sample screen shots.
