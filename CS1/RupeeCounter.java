/*
* Programming exam 1
* @author Jared Talladay
* 2/8/22
*/

import java.util.*;

class RupeeCounter {
  public static void main(String [] args){

// read initial rupee value from user
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the total value in rupees? ");
		int rupee_Value = scan.nextInt();

// intitialize rupee values and calculate value for each
    int gold_Rupee = rupee_Value/300;
//clever trick
    //rupee_Value = rupee_Value%300
    //rupee_Value %= 300
    //this gives the remainder, whats left over, for use on
    //the next calculation

    rupee_Value = rupee_Value - (gold_Rupee*300);
    //rupee_Value %= 300
    int silver_Rupee = rupee_Value/100;
    rupee_Value = rupee_Value - (silver_Rupee*100);
    //rupee_Value %= 100
    int purple_Rupee = rupee_Value/50;
    rupee_Value = rupee_Value - (purple_Rupee*50);
    //rupee_Value %= 50
    int red_Rupee = rupee_Value/20;
    rupee_Value = rupee_Value-(red_Rupee*20);
    //rupee_Value %= 20
    int blue_Rupee = rupee_Value/5;
    rupee_Value = rupee_Value - (blue_Rupee*5);
    //rupee_Value %= 5
    int green_Rupee = rupee_Value/1;

// calculate total number of individual rupees used
    int total_Number_Rupees = (gold_Rupee + silver_Rupee + purple_Rupee
      + red_Rupee + blue_Rupee + green_Rupee);

// print out number of rupees to user
    System.out.println(gold_Rupee + " gold rupees");
    System.out.println(silver_Rupee + " silver rupees");
    System.out.println(purple_Rupee + " purple rupees");
    System.out.println(red_Rupee + " red rupees");
    System.out.println(blue_Rupee + " blue rupees");
    System.out.println(green_Rupee + " green rupees");
    System.out.println(total_Number_Rupees + " individual rupees used.");

  }

}
