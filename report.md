# Lab 1 Report

Joel Logan  
CpS 209  
August 29, 2024

Time spent: 50 minutes.

## Work Completed

I certify that I completed all steps in the lab using my own computer.

**Part A:** Replaced `Scanner()` with `Scanner(System.in)` and added parentheses to fix the math in the print statement.

**Part B:** Recreated the Python Guess program in Java. I chose to use the `java.util.Random` instead of the `Math.random`. The program maintains a `while` loop until the user enters the randomly selected number.

**Part C:** Created a grading program that follows the specifications. It creates a `for` loop that loops for the number of grade entries that you gave in your first `Scanner` input. It checks the number and the remainer of the number, and if it passes, it adds 1 until the remainder is 0, which means that it has reached the next 5 or 0.

## Known Issues

* If you give too few entries to the Grader program, it will throw an error because it was expecting the number of entries that you told it you would give it. This is the result of using the `for` loop.

## Transcripts

```
C:\Users\joelj\OneDrive - Bob Jones University\BJU Work\Programming\cps209\lab01> java Hello.java
1
2
The sum is: 3
```
```
C:\Users\joelj\OneDrive - Bob Jones University\BJU Work\Programming\cps209\lab01> java Guess.java
Enter your guess: 
3
Your guess is too low.
Enter your guess: 
7
You got it!!
It took you 2 guesses.
```
```
C:\Users\joelj\OneDrive - Bob Jones University\BJU Work\Programming\cps209\lab01> java Grader.java
4
73
75
67
67
38
40
33
33
```