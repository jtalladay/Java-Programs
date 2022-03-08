/*
* Lab 3: Random Circle
* @author Jared Talladay
* 2/8/22
*/

import java.util.Random;
import java.text.DecimalFormat;

class RandomCircle{

  public static void main(String [] args){

    //Declare radius variables
    Random generator = new Random();
    int radius_int;
    double radius_Decimal;
    double radius;

    //Generate random number to use as radius
    radius_int = generator.nextInt(31);
    radius_Decimal = generator.nextFloat();

    radius = radius_int + radius_Decimal;

    //Perform calculations for circumference, area, and volume
    double circumference = Math.PI * 2 * radius;
    double area = Math.PI * radius * radius;
    double volume = (4/3) * Math.PI * radius * radius * radius;

    //Format numbers to three decimal places and commas
    DecimalFormat fmt = new DecimalFormat("0.###");
    fmt.setGroupingUsed(true);
    fmt.setGroupingSize(3);

    //Print out information to user
    System.out.println("A circle of radius " + fmt.format(radius) + " has a circumference of " + fmt.format(circumference));
    System.out.println(", an area of " + fmt.format(area) + ", and a volume of " + fmt.format(volume));

  }

}
