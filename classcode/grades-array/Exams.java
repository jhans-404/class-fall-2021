import java.util.*;

/*
Suppose a class was scheduled to have 5 exams
and the teacher was storing those exam grades
for each student in their own array.

Due to a test that many students did poorly on,
a 6th test has been introduced.
*/

public class Exams {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // sample student with 5 slots for grades
    int[] sampleStudent = new int[5];

    // fill up the "gradebook"
    for(int i = 0; i < sampleStudent.length; i++) {
      sampleStudent[i] = (int)(Math.random() * 46) + 55;
    } // end for loop

    // display the first 5 grades
    System.out.println(Arrays.toString(sampleStudent));
    System.out.println(Arrays.toString(addGrade(sampleStudent)));

    System.out.println(Arrays.toString(replaceGrade(sampleStudent)));
  } // end main method

/*
A) Write a method that adds a 6th exam
to the sample student’s set of grades.
*/
public static int[] addGrade(int[] grades) {
  // create a new array that is one size larger
  int[] moreGrades = new int[grades.length + 1];

  /*
  // traverse grades and copy to the new array
  for(int i = 0; i < grades.length; i++) {
    // take the value from grades and assign to moreGrades in the same slot
    moreGrades[i] = grades[i];
  } // end for loop
  */

  // enhanced for loop:
  int i = 0;
  for(int grade : grades) { // read as: "for each grade in grades"
    moreGrades[i] = grade;
    i++;
  }

  // add the last grade to the last slot in the new array
  moreGrades[moreGrades.length - 1] = (int)(Math.random() * 46) + 55;

  return moreGrades;
} // end addGrade


/*
B) Write a method that takes the original set
of 5 grades and replaces the lowest grade IF
the 6th grade is greater than it.
If it is not, then the original 5 grades remain.
*/
  public static int[] replaceGrade(int[] grades) {
    // determine what the lowest value is and store its position
    int currentLowest = 1000;
    int lowestPos = 0;
    int counter = 0;
    for(int grade : grades) {
      if(grade < currentLowest) {
        currentLowest = grade;
        lowestPos = counter;
      }
      counter++;
    }
    System.out.println(currentLowest);

    // randomly choose a 6th grade
    int sixthGrade = (int)(Math.random() * 46) + 55;
    System.out.println("6th: " + sixthGrade);
    // compare 6th grade to lowest
    if(sixthGrade < currentLowest) {
      return grades;
    } else {
        grades[lowestPos] = sixthGrade;
    }

    return grades;

  } // end replaceGrade method








} // end class
