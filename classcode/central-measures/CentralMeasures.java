import java.util.*;

public class CentralMeasures {
  public static void main(String[] args) {
    int[] testGrades = {100, 95, 90, 95};

    // System.out.println(average(testGrades)); // 95

    // 100 random values in an array
    int[] randomArray = new int[10];

    // loop 10 times
    for(int i = 0; i < 10; i++) {
      // choose a random value
      int value = (int)((Math.random() * 100) + 1);

      // store the value in the array
      randomArray[i] = value;

    } // end for loop

    System.out.println(Arrays.toString(randomArray));
    // System.out.println(average(randomArray));
    // System.out.println(mode(testGrades));
    int[] sortedRandom = sort(randomArray);
    System.out.println(Arrays.toString(sortedRandom));
  } // end main method

  public static double average(int[] arr) {
    // declare accumulator variable
    double total = 0.0;

    // add up all of the data
    for(int i = 0; i < arr.length; i++) {
      total += arr[i];
    } // end for loop

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
    } // end for loop

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


  public static int[] sort(int[] arr) {
    // outer loop to track which index to sort next
    for(int i = 0; i < arr.length; i++) {

      // assume min is in correct spot
      int min = arr[i];
      int minLoc = i;

      // store temp for swap later on
      int temp = arr[i];

      // search for min of remaining values
      for (int j = i + 1; j < arr.length; j++) {

        // found a new min!
        if(arr[j] < min) {
          // update info on what and where min is
          min = arr[j];
          minLoc = j;
        } // end if statement
      } // end inner for loop

      // perform the swap
      arr[i] = min;
      arr[minLoc] = temp;
    } // end outer for loop

    return arr;
  } // end sort method

} // end class
