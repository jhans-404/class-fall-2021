import java.util.Arrays;

public class SelfDivisor {
  public static void main(String[] args) {
    // System.out.println(isSelfDivisor(20));
    // System.out.println(isSelfDivisor(121));
    System.out.println(Arrays.toString(firstNumSelfDivisors(10, 3)));
  }

  public static boolean isSelfDivisor(int number) {
    while(number > 0) {
      // extract the ones digit (using mod)
      int digit = number % 10;
      // make sure digit is not zero to avoid error
      if(digit == 0) {
        return false;
      }
      // divide number by digit (remainder 0?)
      if (number % digit != 0) {
        return false;
      }

      // short-circuit evaluation version
      // if (digit == 0 || number % digit != 0)

      // reduce the number (using division)
      number /= 10;
    }
    return true;
  }

  public static int[] firstNumSelfDivisors(int start, int num) {
    // create new array of size num
    int[] collection = new int[num];

    // begin the search at start
    // while the last value in the array is not zero, keep searching
    // ANOTHER WAY
    // create a counter variable successes, while succusses < num
    int count = 0;
    while (count < num) {
      // call part(a) to determine if the number should be in the array
      if (isSelfDivisor(start)) {
        // if part(a) returns true, then add value to array
        collection[count] = start;
        count++;
      }
      // increment start to check next number
      start++;
    }
    // return the array once filled
    return collection;
  }
}
