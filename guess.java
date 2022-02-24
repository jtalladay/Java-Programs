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
    Random generator = new Random();
    int actual_Number = generator.nextInt(1001);

    System.out.println("Guess a number between 1 and 1000 ");

    int guess_Number = input.nextInt();

    System.out.println("The actual number is " + actual_Number);
    System.out.println("The guessed number is " + guess_Number);


    while (actual_Number != guess_Number){
      if (guess_Number < actual_Number){
          System.out.println("too low");
          System.out.println("try again: ");
          guess_Number = input.nextInt();
      } else if (guess_Number > actual_Number) {
          System.out.println("too high");
          System.out.println("try again:  ");
          guess_Number = input.nextInt();
      } else {
          System.out.println("you guessed it");
          System.out.println("dont try again ");
          actual_Number = guess_Number;
      }
    }
    System.out.print("all done");

      }
  }
