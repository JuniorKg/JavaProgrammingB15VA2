package day42_encapsulation;

/*
Name should not be empty
Age can only be 0 - 170;
 */
public class Person {
    //encapsulate below variables
    private String name;
    private int age;

    public void setAge(int newAge){
        if (newAge > 0 && newAge < 120) {
            age = newAge;
        }else {
            System.out.println("ERROR: Invalid age - " + newAge);
        }

    }
    //getter/setter for name
    //read only
    public String getName() {
        return name;
    }


    public void setName(String newName){
        if (!newName.isEmpty()) {
            name = newName;
        } else {
            System.out.println("ERROR: NAME CANNOT BE EMPTY");
        }
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
