package day37_arraylist;
import java.util.*;
public class ArrayListComparison {
    public static void main(String[] args) {
        List <Double> nums1 = new ArrayList<>();

        nums1.add(1.2);
        nums1.add(5.2);
        nums1.add(7.5);
        nums1.add(8.0);
        nums1.add(52.5);
        nums1.add(100.0);

        List <Double> nums2 = nums1;



        List <Double> nums3 = new ArrayList<>();

        nums3.add(1.2);
        nums3.add(5.2);
        nums3.add(7.5);
        nums3.add(8.0);
        nums3.add(52.5);
        nums3.add(100.0);
        System.out.println("nums1 -> " + nums1.toString());
        System.out.println("nums3 -> " + nums3.toString());
        //bellow is false because nums1 and nums3 are pointing different object
        System.out.println("nums1 == nums3 - " + (nums1==nums3));
        System.out.println("nums1 == nums2 - " + (nums1==nums2));

        List<Integer> listA = new ArrayList<>();
        listA.add(30);
        listA.add(10);
        listA.add(11);

        List<Integer> listB = new ArrayList<>();
        listB.add(30);
        listB.add(10);

        System.out.println("listA -> " + listA.toString());
        System.out.println("listB -> " + listB.toString());

        System.out.println("listA==listB > " + (listA == listB));
        System.out.println("listA.equals(listB) > " + (listA.equals(listB)));
        System.out.println("listA.containsAll(listB) > " + (listA.containsAll(listB)));

        /*
        listA -> [30,10.11]
        listB -> [30,10]
         */
        //Remove all elements from listA that matches listB

        listA.removeAll(listB);
        System.out.println("listA -> " + listA.toString());
        System.out.println("listB -> " + listB.toString());
        listB.removeAll(listB);
        System.out.println("listB -> " + listB.toString());
    }
}
