// imports
import java.util.*;

public class CoordinatePlane {
  public static void main(String[] args) {
    // instantiate a scanner object
    Scanner s = new Scanner(System.in);

    System.out.print("please input a coordinate: ");
    String point1 = s.nextLine();

    int x1 = getX(point1);
    System.out.println(x1);

    System.out.println(x1 + 2);
  }// end main method

  /*
   * Name: getX
   * Purpose: extract the x-value from a point
              convert the String to an int
   * Input: String coordinate pair (input from main)
   * Return: the x-value (int)
  */
  public static int getX(String point) {
    int commaPos = point.indexOf(",");
    // get the String version of x
    String xVal = point.substring(1, commaPos);

    // convert that String to an int
    int x = Integer.parseInt(xVal);

    // send the info back to main
    return x;
  }

  public static int getY(String point) {

    return 0;
  }

  public static void crowsDistance(int x1, int y1, int x2, int y2) {

  }// end crowsDistance method

  public static void taxicabDistance(int x1, int y1, int x2, int y2) {

  }// end taxicabDistance method

}// end class
