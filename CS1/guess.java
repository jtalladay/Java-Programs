/*
* Lab 5: Guess
* @author Jared Talladay
* 2/24/22
*/

import java.util.Random;
import java.util.*;

class guess{

  public static void main(String []args){
    java.util.Scanner input = new java.util.Scanner(System.in);

    // generate random number between 1 and 1000
    Random generator = new Random();
    int actual_Number = generator.nextInt(1001);

    //prompt the user for their guess
    System.out.println("Guess a number between 1 and 1000 ");

    //store the user guess into a new variable
    int guess_Number = input.nextInt();

    //initialize a counter variable to keep track of number of guesses
    int count = 1;

    //Use while loop to iterate through user guesses until the guess is correct
    //Use if statement to test guessed number against actual number
    while (actual_Number != guess_Number){
      if (guess_Number < actual_Number){
          System.out.println("Too low.");
          guess_Number = input.nextInt();
      } else if (guess_Number > actual_Number) {
          System.out.println("Too high.");
          guess_Number = input.nextInt();
      }
      count++;
    }

    System.out.print("You got it in " + count + " guesses.");

      }
  }
