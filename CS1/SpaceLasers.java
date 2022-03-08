/*
* Project 2: Space Lasers
* @author Jared Talladay
* 2/24/22
*/

import java.util.Random;
import java.util.*;

class SpaceLasers{

  public static void main(String []args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    Random generator = new Random();

    //Define some intial variables for the while loop
    String current_Player = "";
    boolean game_On = true;
    int counter = 0;

    //start while loop, checking if the game should continue
    while (game_On){

        /* use if statement to alternate between
        players with the counter variable */
      if (counter%2 == 0){
        current_Player = "Player 1";
      } else {
        current_Player = "Player 2";
      }

      // Initialize two variables to store the random die values
      // Use an int variable to store total die value
      int die_1 = generator.nextInt(6)+1;
      int die_2 = generator.nextInt(6)+1;
      int total_Die = die_1 + die_2;

      /* use these variables to test die values
      int die_1 = 3;
      int die_2 = 4;
      */

      //Prompt user for their chosen player action
      System.out.println(current_Player + ", are you shooting or moving?");
      String user_String = input.next();
      String player_Action = user_String.substring(0,1);

      // Begin if statements using consitons based on rules of the game
      if (player_Action.equalsIgnoreCase("S")){
        System.out.println(current_Player + " rolled " + die_1 + " and "
                                                      + die_2);
        if (die_1 == 6 && die_2 == 6){
          System.out.println(current_Player + " you have killed your opponent.");
          System.out.println("     GAMEOVER");
          //Game will now end and close the while loop
          game_On = false;
        } else if (die_1 == die_2){
          System.out.print("Take " + (total_Die*100) + " dollars from the");
          System.out.println(" other player, and go again.");
          counter++;
        } else if (die_1 != die_2){
          System.out.println(current_Player +  " missed.");
        }
      } else if (player_Action.equalsIgnoreCase("M")){
        System.out.println(current_Player + " rolled " + die_1 + " and "
                                                        + die_2);
        if (die_1 == die_2){
          System.out.print(current_Player + " gets " + (total_Die*100));
          System.out.println(" dollars.");
          System.out.print("Move " + total_Die + " spaces, and take ");
          System.out.println("another turn.");
          counter++;
        }//GRADED you can change this condition to (die_1 + die_2 == 4) 
        }else if ((die_1 == 1 && die_2 == 3) || (die_1 == 3 && die_2 == 1)){
          System.out.println("Draw an action card and move " + total_Die +
                                                      " spaces.");
        } else if (die_1 != die_2){
          System.out.println("Move " + total_Die + " spaces.");
        }
      } else {
          // This checks for invalid user input, ending the game if necessary
          System.out.println("You didnt type shooting or moving.m \n GAMEOVER");
          game_On = false;
        }
      // increase the counter in order to move to the next player
      counter++;
      }
    }
  }
