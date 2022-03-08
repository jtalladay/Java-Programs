/**
 * Project 3: Custom Class
 * Created on 3/3/2022
 *
 * @author Jared Talladay
 *
 *
 */

 /*example of enumerated type

 enum flavor {vanilla, chocolate, strawberry };

class A {
  private flavor chosenFlavor;

  public A (String flavorName){
    chosenFlavor = flavor.valueOf(flavorName);
  }

  public String toString() {
    String msg;

    if (chosenFlavor == flavor.vanilla){
    msg = "Great Choice";
    }
    return "object has a flavor of " + chosenFlavor + ", " + msg;
  }
}
class Example {
  public static void main(String []args){
    A obj = new A("vanilla");
    System.out.println(obj);
  }
}
*/
enum insurance { uninsured, self, couple, family };


class Paycheck {
  private insurance insuranceUser;
  private long salary;
  // add Constructor for paycheck
  Paycheck() {
    
  }


  public Paycheck (String insuranceType){
    insurance_User = insurance.valueOf(insurance_Type);
  }

  public String toString(){
    String insuranceMsg;

    if (insuranceUser == insurance.uninsured){
      insuranceMsg = "uninsured";
    } else if (insuranceUser == insurance.self){
      insuranceMsg = "self";
    } else if (insuranceUser == insurance.couple){
      insuranceMsg = "couple";
    } else if (insuranceUser == insurance.family){
      insuranceMsg = "family";
    } else {
      insuranceMsg = "error";
    }
    return "insurance has a value of " + insuranceMsg;

  }

  }


class CustomClass {
  public static void main(String []args){
    Paycheck obj = new Paycheck("couple");
    System.out.println(obj);
  }
}
