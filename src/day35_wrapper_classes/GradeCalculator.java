package day35_wrapper_classes;

public class GradeCalculator {
    public static void main(String[] args) {

        System.out.println(getGrade(56));

        if (getGrade(53) == 'C') {
            System.out.println("PASS - C grade returned correctly");
        }else {
            System.out.println("FAIL - UniTest Error");
        }
             char gradeTest = getGrade(35); //D
            System.out.println("gradeTest = " + gradeTest);
            if (gradeTest == 'D'){
                System.out.println("UNIT TEST PASS");
            } else {
                System.out.println("UNIT TEST FAIL");
            }
        }



/*
Method: getGrade
param/args/input: int score
return: char
Based on the score, return grade
score, grade
score range: 0-100
94 - 100 -> A
80 - 93  -> B
50 - 79  -> C
30 - 49  -> D
0  - 29  -> F
out of range -> print Error and return '0'
--------------

 */

public static char getGrade(int score) {
    char grade = 'N';
    if (score >= 94 && score <= 100) {
        grade = 'A';
    } else if (score >= 80 && score <= 93) {
        grade = 'B';
    } else if (score >= 50 && score <= 79) {
        grade = 'C';
    } else if (score >= 30 && score < 49) {
        grade = 'D';
    } else if (score >= 0 && score <= 29) {
        grade = 'F';
    } else {
        System.out.println("ERROR : INVALID SCORE - " +score);
        grade = '0';
    }
    return grade;




}
}