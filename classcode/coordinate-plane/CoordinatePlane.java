// imports
import java.util.*;

public class CoordinatePlane {
  public static void main(String[] args) {
    // instantiate a scanner object
    Scanner s = new Scanner(System.in);

    System.out.println("Which of the following do you want?");
    System.out.print("1. Distance calculator \n2. Area calculator\n");

    int choice = s.nextInt();

    if (choice == 1) {
      distance();
    } // end if statement
    else {
      area();
    } // end else statement

  }// end main method

  public static void distance() {
    Scanner s = new Scanner(System.in);

    System.out.print("please input a coordinate: ");
    String point1 = s.nextLine();

    int x1 = getX(point1);
    int y1 = getY(point1);

    System.out.print("please input another coordinate: ");
    String point2 = s.nextLine();

    int x2 = getX(point2);
    int y2 = getY(point2);

    System.out.println(crowsDistance(x1, y1, x2, y2));
    System.out.println(taxicabDistance(x1, y1, x2, y2));

    System.out.println(slope(x1, y1, x2, y2));
  }

  public static void area() {
    Scanner s = new Scanner(System.in);

    System.out.println("What shape do you want to know the area of?");
    System.out.print("1. Square\n");

    int choice = s.nextInt();

    if (choice == 1) {
      square();
    } // end if statement

  } // end area method

  public static void square() {
    Scanner s = new Scanner(System.in);

    System.out.println("Please go in clockwise order");
    System.out.print("Enter the first point: ");

    // get points and parse out x and y
    // point 1
    String point1 = s.nextLine();
    int x1 = getX(point1);
    int y1 = getY(point1);

    // point 2
    System.out.print("Enter the second point: ");
    String point2 = s.nextLine();
    int x2 = getX(point2);
    int y2 = getY(point2);

    // point 3
    System.out.print("Enter the third point: ");
    String point3 = s.nextLine();
    int x3 = getX(point3);
    int y3 = getY(point3);

    // point 4
    System.out.print("Enter the fourth point: ");
    String point4 = s.nextLine();
    int x4 = getX(point4);
    int y4 = getY(point4);

    // calculate 4 distances
    double distance1 = crowsDistance(x1, y1, x2, y2);
    double distance2 = crowsDistance(x2, y2, x3, y3);
    double distance3 = crowsDistance(x3, y3, x4, y4);
    double distance4 = crowsDistance(x4, y4, x1, y1);

    // test if all sides are congruent
    if (distance1 == distance2 && distance2 == distance3 && distance3 == distance4) {
      // calculate slopes
      double slope1 = slope(x1, y1, x2, y2);
      double slope2 = slope(x2, y2, x3, y3);

      if ((slope1 * slope2 == -1) || (slope1 == Integer.MAX_VALUE && slope2 == 0)
            || (slope1 == 0 && slope2 == Integer.MAX_VALUE)) {
        System.out.println("Is a square");
        drawSquare((int)distance1);
      }
    } // end if statement
    else {
      System.out.println("Fails distance test");
    } // end else statement



  } // end square method

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
  } // end getX method

  public static int getY(String point) {
    int commaPos = point.indexOf(",");

    // get the String version of y
    String yVal = point.substring(commaPos + 2, point.length() - 1);

    // convert that String to an int
    int y = Integer.parseInt(yVal);

    // send the info back to main
    return y;
  }  // end getY method

  public static double crowsDistance(int x1, int y1, int x2, int y2) {
    // distance formula = sqrt[(y2 - y1)^2 + (x2 - x1)^2]
    int deltaX = x2 - x1;
    int deltaY = y2 - y1;

    // distance formula = sqrt[(deltaY)^2 + (deltaX)^2]
    int deltaXsquared = deltaX * deltaX;
    int deltaYsquared = deltaY * deltaY;

    // distance formula = sqrt[(deltaYsquared + deltaXsquared]
    int sum = deltaYsquared + deltaXsquared;

    // distance formula = sqrt[sum]
    double distance = Math.sqrt(sum);

    return distance;
  }// end crowsDistance method

  public static double taxicabDistance(int x1, int y1, int x2, int y2) {
    // distance forumla = |y2 - y1| + |x2 - x1|
    int distance = Math.abs(y2 - y1) + Math.abs(x2 - x1);

    return distance;

  }// end taxicabDistance method

  /*
  N: slope
  P: calculate the slope between two points
  I: 2 points, already parsed (4 ints)
  R: a double
  */
  public static double slope(int x1, int y1, int x2, int y2) {
    // formula: (y2 - y1) / (x2 - x1)
    if (x1 != x2) {
      return (double)(y2 - y1) / (x2 - x1);
    }  // end if statement

    return Integer.MAX_VALUE;
  } // end slope method

  public static void drawSquare(int d) {
    for (int row = 0; row < d; row++) {
      for(int col = 0; col < d; col++) {
        System.out.print("*  ");
      } // end of row
      System.out.println();
    } // end of square

  }

}// end class
