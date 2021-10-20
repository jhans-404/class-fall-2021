import java.util.*;

public class Username {
  public static void main(String[] args) {
      // create an instance of the Scanner
      Scanner s = new Scanner(System.in);

      // ask the user their first name
      System.out.print("Please enter your first name: ");
      String fName = s.nextLine();

      // ask the user their last name
      System.out.print("Please enter your last name: ");
      String lName = s.nextLine();

      // ask the user their birthday in the form mm/dd/year
      System.out.print("Hi, " + fName + ", please enter your birthday in mm/dd/year format: " );
      String birthday = s.nextLine();

      // generate a username for that person based on their data
      System.out.println(fName + " " + lName + " " + birthday);

  } // end main method

} // end class
