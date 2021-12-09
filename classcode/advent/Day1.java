import java.util.*;
import java.io.*;

public class Day1{
  public static void main(String[] args) {

    try{
      Scanner s = new Scanner(new File("day1.txt"));
      int[] arr = new int[2000];
      int i = 0;

      // while there's still data in the file, xfer to arr
      while(s.hasNext()){
        int value = Integer.parseInt(s.next());
        arr[i] = value;
        i++;
      }//end while loop

      System.out.println(part1(arr));

      // work on part 2 and test below!
      // System.out.println(part2(arr));

      s.close();
    }//end try

    catch(Exception e){
      System.out.println("file not found");
    }//end catch
  }//end main method

  public static int part1(int[] a) {
    int count = 0;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] < a[i + 1]) {
        count++;
      }
    }
    return count;
  }

}//end class
