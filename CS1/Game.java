//Example from class creating new class and objects

// Class defining a die
class Die {
  // State of the die; face on top
  private int face_Value; // this is an instance variable
  public static final int MAX = 6;
  //Constructor for Die class: no "parameters" no passed in information
  public Die (){
    face_Value = 1;
  }
  // Constructor for Die class: accepts an integer
  public Die (int starting_Value){
    face_Value = starting_Value;
  }

  public void roll () {
    face_Value = (int)(Math.random() * 6) + 1;
  }

  public String toString (){
    return "Die with value " + face_Value;

  }
  public void set_Value (int new_Value){
    if (new_Value >= 1 && new_Value <= MAX){
      face_Value = new_Value;
    }
  }
}

class Game {
  public static void main(String []args){
    Die d1 = new Die();
    Die d2 = new Die();
    Die d3 = new Die();
    d1.roll();
    d2.roll();
    d3.roll();
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);

  }

}
