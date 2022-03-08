/*
* Lab 4: StringFix
* @author Jared Talladay
* 2/10/22
*/

import java.util.*;

class StringFix {

  public static void main(String [] args){

    //initialize scanner class
    Scanner scan = new Scanner(System.in);
    //Declare char variables for converting fractions
    final char QUARTER = 188;
    final char HALF = 189;
    String one_Quarter = "" + QUARTER;
    String one_Half = "" + HALF;

    //Prompt user to enter initial string
    System.out.println("Enter a sentence: ");
    String user_String = scan.nextLine();

    //Task 1: Remove any leading or trailing whitespace
    user_String = user_String.trim();

    //store length of string in variable
    int length = user_String.length();

    //Task 2: Convert all but the first character to lowercase and the first character to uppercase
    String lower_Case = user_String.substring(1,length);
    String upper_Case = user_String.substring(0,1);
    lower_Case = lower_Case.toLowerCase();
    upper_Case = upper_Case.toUpperCase();

    //Task 3: Replace all occurrences of 1/4 with ¼
    lower_Case = lower_Case.replace("1/4",one_Quarter);

    //Task 4: Replace all occurrences of 1/2 with ½
    lower_Case = lower_Case.replace("1/2",one_Half);

    //Task 5: Using a regular expression, replace all numbers with REDACTED
    lower_Case = lower_Case.replaceAll("\\d+[0-9]","REDACTED");

    //Print out repaired string to user
    System.out.println(upper_Case + lower_Case);

  }

}
