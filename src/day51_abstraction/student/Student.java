package day51_abstraction.student;

    public abstract class Student{

        String name;


        public Student(){
            System.out.println("Student constructor...");
        }

        public abstract void attendClass();

        public void code(String language){
            System.out.println("Student is coding " + language + "...");
        }

    }



