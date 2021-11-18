import java.util.*;

public class Receipt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("enter a price: ");
    double price = s.nextDouble();

    System.out.println("total plus tax: " + addTax(price););
    
  } // end main method

  public static double addTax(double price) {
    // price += price * 0.0825;
    return price * 1.0825;
  } // end addTax method

} // end class
