package day26_array05;
import java.util.*;
public class PopularNamesv2Scanner {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String[] names = {"James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda",
                        "William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica",
                        "Thomas", "Sarah", "Charles", "Margaret", "Christopher", "Karen", "Daniel", "Nancy",
                        "Matthew", "Lisa", "Anthony", "Betty", "Donald", "Dorothy", "Mark", "Sandra",
                        "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth", "Emily",
                        "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa",
                        "Edward", "Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura",
                        "Jeffrey", "Helen", "Ryan", "Sharon", "Jacob", "Cynthia", "Gary", "Kathleen",
                        "Nicholas", "Amy", "Eric", "Shirley", "Stephen", "Angela", "Jonathan", "Anna",
                        "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon", "Nicole",
                        "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
                        "Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet",
                        "Dennis", "Emma", "Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane",
                        "Jose", "Julie", "Douglas", "Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria",
                        "Zachary", "Kelly", "Walter", "Christina", "Kyle", "Lauren", "Harold", "Frances",
                        "Carl", "Martha", "Jeremy", "Judith", "Gerald", "Cheryl", "Keith", "Megan", "Roger", "Andrea",
                        "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean", "Sean", "Alice", "Christian", "Jacqueline",
                        "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn", "Albert", "Gloria", "Jesse", "Teresa",
                        "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce", "Julia", "Noah", "Grace",
                        "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly", "Alan", "Denise",
                        "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose",
                        "Louis", "Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane",
                        "Logan", "Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla"};
                //System.out.println(names.length);
                //System.out.println(Arrays.toString(names));
                System.out.println("Enter a name to find: ");
                String findName = scan.next();
                int nameIndex = -1;
                for (int i = 0; i < names.length ; i++) {
                    String temp = names[i];
                    if(temp.equals(findName)){
                        nameIndex = i;
                        System.out.println(temp + "'s index is: "+nameIndex);
                        break;
                    }
                }
            }
        }

