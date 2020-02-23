package day43_constructor;

public class Pet {

    /**data/instance variables, attributes, properties, field
     type, name

     Encapsulate type and name

     **/
    private String type;
    private String name;


    public Pet(){
        System.out.println("Pet no-arg constructor");
    }
    public Pet(String type, String name){
        System.out.println("Pet 2 args constructor");
        this.type = type;
        this.name = name;
    }

    public void setPetInfo(String type, String name){
        this.type = type;
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;

    }
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
        }
    public void speak(){
        switch (type){
            case "dog":
                System.out.println("Gav-Gav");
                break;
            case "cat":
                System.out.println("Meow-Meow");
                break;
            case "fish":
                System.out.println("...");
                break;
            case "bird":
                System.out.println("Tweet - Tweet");
                break;
            case "lion":
                System.out.println("Roar - Roar");
                break;
            default:
                System.out.println("Not pet was found");

        }
    }



    }


