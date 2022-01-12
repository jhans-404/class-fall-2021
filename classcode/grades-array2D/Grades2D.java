import java.util.*;

public class Grades2D {
  public static void main(String[] args) {
    // initialize a 2-dimensional array
    // 15 rows, each storing 5 values
    /*
    [
      [[0][0], , , , ]
      [ , , , ,[1][4]]
      [ , , , , ]
      [ , , , , ]
      [ , , , , ]
      [ ,[5][1], , , ]
      .
      .
      .
      [[14][0],[14][1],[14][2],[14][3],[][]]
    ]
    */
    int[][] studentGrades = new int[15][5];

    System.out.println(studentGrades[studentGrades.length-1][studentGrades[0].length - 1]);
    System.out.println(studentGrades.length); // = 15
    System.out.println(studentGrades[0].length); // = 5

    int num = 1;
    for(int row = 0; row < studentGrades.length; row++) {
      for(int col = 0; col < studentGrades[0].length; col++) {
        studentGrades[row][col] = num;
        num++;
      }
    }
    System.out.println(studentGrades[studentGrades.length-1][studentGrades[0].length - 1]);

    // for(int array = 0; array < studentGrades.length; array++){
    //   System.out.println(Arrays.toString(studentGrades[array]));
    // }

    System.out.println(Arrays.deepToString(studentGrades));

  }

}
