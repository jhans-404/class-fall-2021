import java.util.*;

public class CentralMeasures {
  public static void main(String[] args) {
    int[] testGrades = {100, 95, 90, 95};

    System.out.println(average(testGrades)); // 95

    // 100 random values in an array
    int[] randomArray = new int[10];

    // loop 100 times
    for(int i = 0; i < 10; i++) {
      // choose a random value
      int value = (int)((Math.random() * 100) + 1);

      // store the value in the array
      randomArray[i] = value;
    }

    System.out.println(Arrays.toString(randomArray));
    System.out.println(average(randomArray));
    System.out.println(mode(testGrades));
  }

  public static double average(int[] arr) {
    // declare accumulator variable
    double total = 0.0;

    // add up all of the data
    for(int i = 0; i < arr.length; i++) {
      total += arr[i];
    }

    // divide total by number of data values
    return total / arr.length;
  } // end average method

  public static int mode(int[] arr) {
    // find the max value
    int max = findMax(arr);

    // construct a new array for frequencies
    // the size of the array will be max + 1
    int[] freq = new int[max + 1];

    for(int i = 0; i < arr.length; i++) {
        freq[arr[i]]++;
    }

    // how do we get the max value's index to be returned?

    return 0;
  } // end mode method

  public static int findMax(int[] arr) {
    int max = -99999;

    // {100, 95, 90, 95}
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > max) {
        max = arr[i];
      } // end if statement
    } // end for loop

    return max;
  } // end findMax method

} // end class
