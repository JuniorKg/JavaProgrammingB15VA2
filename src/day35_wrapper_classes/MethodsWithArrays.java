package day35_wrapper_classes;

public class MethodsWithArrays {
    public static void main(String[] args) {
        int[] myNums = {2, 5, 6, 32, 53, 12, 43, 22};
        printArray(myNums);

        /*
        Method: printArray
        arg/param : int[] nums
        return : void
        print each item in the array in seperate lines
         */

        System.out.println(has10(new int []{3,1,10,3,5}));
    //*****************************************************

        System.out.println(longerThan3(new int []{2,4,3,4}));
    }

    public static void printArray(int[] nums) {
        for (int eachNum : nums) {
            System.out.println(eachNum);
        }
    }

    /*
    Method name : has10
    Params : int[] nums
    return : boolean
    Returns true if there is 10 in the array, returns false if not
     */



    public static boolean has10(int[] nums) {
        for (int eachNum : nums) {
            if (eachNum == 10) {
               return true;

            }
        }
            return false;
        }
    public static boolean longerThan3(int [] nums) {
        return (nums.length>3);

//     public static boolean longerThan3(int [] nums) {
//         if (nums.length > 3) {
//             return true;
//         }
//
//             return false;
             }

    }





