package OfficeHours;
import java.util.*;
public class ListPractice {
    public static void main(String[] args) {

    }

        public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

            if (isAsleep)

            return false;

            if ((isMorning && isMom) || !isMorning)

            return true;
            else return false;



        }
}
