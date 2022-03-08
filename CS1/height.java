

class height{

  public static void main(String []args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("How tall are you? ");
    int height = input.nextInt();

    System.out.print("Do you have a ticket? ");
    String has_Ticket = input.next();

    if (height < 24 || has_Ticket.equalsIgnoreCase("No")){
        //we know that height is less than 24 OR first letter is N
        System.out.println("You cannot ride the anything you stupid child.");
    } else if (height > 84) {
        // height > 84 and first letter is NOT N
        System.out.println("You can ride the carousel but " +
                              "not the inverter");
    } else {
        //height is between 24 and 84 and first letter is NOT N
        System.out.println("Hop on board.");
    }

    System.out.print("all done");
    
      }
  }
