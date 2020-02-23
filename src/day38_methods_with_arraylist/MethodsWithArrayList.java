package day38_methods_with_arraylist;
import java.util.*;
public class MethodsWithArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(15);
        nums.add(54);
        nums.add(32);
        nums.add(322);
        nums.add(12);
        nums.add(86);
        nums.add(123);
        printList(nums);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(4);
        nums2.add(2);
        nums2.add(6);

        System.out.println("Before doubling: " + nums2.toString());
        doubleTheList(nums2);
        System.out.println("After doubling: " + nums2.toString());


        System.out.println("Nums2 Sum: " + sumList(nums2));

    }

    /*
    Method: printList
    Params: List<Integer> list
    Return: void
    Print each value in same line
     */
    public static void printList(List<Integer> list){

        for (Integer iEach : list){
            System.out.println(iEach + " ");
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.print(list.toArray()[i] + " ");


        }
        System.out.println();
        }


        public static void doubleTheList(List<Integer> nums){
            for (int i = 0; i < nums.size() ; i++) {
                 int temp = nums.get(i);
                 nums.set(i, temp*2);

            }
            System.out.println();
        }
        public static int sumList(List <Integer> nums){
            int sum = 0;
            for (int i = 0; i < nums.size() ; i++) {
                sum += nums.get(i);
            }
            return sum;




            }

        }



