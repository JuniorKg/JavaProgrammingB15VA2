package day26_array05;
import java.util.*;
public class PopularNames {
    public static void main(String[] args) {
        String[] names = {"James", "Mary",
                "John", "Patricia",
                "Robert", "Jennifer",
                "Michael", "Linda",
                "William", "Elizabeth",
                "David", "Barbara",
                "Richard", "Susan",
                "Joseph", "Jessica",
                "Thomas", "Sarah",
                "Charles", "Margaret",
                "Christopher", "Karen",
                "Daniel", "Nancy",
                "Matthew", "Lisa",
                "Anthony", "Betty",
                "Donald", "Dorothy",
                "Mark", "Sandra",
                "Paul", "Ashley",
                "Steven", "Kimberly",
                "Andrew", "Donna",
                "Kenneth", "Emily",
                "George", "Carol",
                "Joshua", "Michelle",
                "Kevin", "Amanda",
                "Brian", "Melissa",
                "Edward", "Deborah",
                "Ronald", "Stephanie",
                "Timothy", "Rebecca",
                "Jason", "Laura",
                "Jeffrey", "Helen",
                "Ryan", "Sharon",
                "Jacob", "Cynthia",
                "Gary", "Kathleen",
                "Nicholas", "Amy",
                "Eric", "Shirley",
                "Stephen", "Angela",
                "Jonathan", "Anna",
                "Larry", "Ruth",
                "Justin", "Brenda",
                "Scott", "Pamela",
                "Brandon", "Nicole",
                "Frank", "Katherine",
                "Benjamin", "Samantha",
                "Gregory", "Christine",
                "Raymond", "Catherine",
                "Samuel", "Virginia",
                "Patrick", "Debra",
                "Alexander", "Rachel",
                "Jack", "Janet",
                "Dennis", "Emma",
                "Jerry", "Carolyn",
                "Tyler", "Maria",
                "Aaron", "Heather",
                "Henry", "Diane",
                "Jose", "Julie",
                "Douglas", "Joyce",
                "Peter", "Evelyn",
                "Adam", "Joan",
                "Nathan", "Victoria",
                "Zachary", "Kelly",
                "Walter", "Christina",
                "Kyle", "Lauren",
                "Harold", "Frances",
                "Carl", "Martha",
                "Jeremy", "Judith",
                "Gerald", "Cheryl",
                "Keith", "Megan",
                "Roger", "Andrea",
                "Arthur", "Olivia",
                "Terry", "Ann",
                "Lawrence", "Jean",
                "Sean", "Alice",
                "Christian", "Jacqueline",
                "Ethan", "Hannah",
                "Austin", "Doris",
                "Joe", "Kathryn",
                "Albert", "Gloria",
                "Jesse", "Teresa",
                "Willie", "Sara",
                "Billy", "Janice",
                "Bryan", "Marie",
                "Bruce", "Julia",
                "Noah", "Grace",
                "Jordan", "Judy",
                "Dylan", "Theresa",
                "Ralph", "Madison",
                "Roy", "Beverly",
                "Alan", "Denise",
                "Wayne", "Marilyn",
                "Eugene", "Amber",
                "Juan", "Danielle",
                "Gabriel", "Rose",
                "Louis", "Brittany",
                "Russell", "Diana",
                "Randy", "Abigail",
                "Vincent", "Natalie",
                "Philip", "Jane",
                "Logan", "Lori",
                "Bobby", "Alexis",
                "Harry", "Tiffany",
                "Johnny", "Kayla"};

        //System.out.println(names.length);

        //System.out.println(Arrays.toString(names));

        int sarahIndex = -1;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Sarah")) {
                sarahIndex = i; //assign index of Sarah to sarahIndex
                break; //exit loop.
            }
        }
        System.out.println("Sarah's index is " + sarahIndex);

        /*
        Males Names : James, John...
        Female Names:
         */

        System.out.println("MALES NAMES: ");
        for (int i = 0; i < names.length; i += 2) {
            System.out.print(names[i] + ", ");
        }
        System.out.println();
        System.out.println("FEMALE NAMES: ");
        for (int i = 1; i < names.length; i += 2) {
            System.out.print(names[i] + ", ");
        }
        System.out.println();
        //solve above task using a single loop
        String malesNames = "";
        String femalesNames = "";
        for (int i = 0; i < names.length; i++) {
            if (i % 2 == 0) {
                malesNames += names[i] + ", ";
            } else if (i % 2 != 0) {
                femalesNames += names[i] + ", ";
            }
        }
        System.out.println("Male names even: " + malesNames);
        System.out.println("Female names odd: " + femalesNames);

        System.out.println();
        if (malesNames.contains("David")) {
            System.out.println("David is in the list");
        } else {
            System.out.println("David is not in the list");

        }
        if (femalesNames.contains("Susan")) {
            System.out.println("Susan is in the list");
        } else {
            System.out.println("Susan is not in the list");

        }

        //find the person with the longest name
        String longestName = "";
        String shortestName = names[0];
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
            if (names[i].length() < shortestName.length()) {
                shortestName = names[i];
            }
        }
            System.out.println("Longest name: " +longestName);
            System.out.println("Shortest name: " + shortestName);

        }
    }




