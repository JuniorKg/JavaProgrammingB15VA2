package day15_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies = "java,c++,python,tomcat,aws";
        System.out.println(technologies.indexOf("java"));
        int java, c, python, tomcat, aws;
        // System.out.println(java); Eror. nothing assigned

        java = technologies.indexOf("java");
        System.out.println("java = " + java);

        c = technologies.indexOf("c++");
        System.out.println("c++ = " + c++);


        python = technologies.indexOf("python");
        System.out.println("python = " + python);
        tomcat = technologies.indexOf("tomcat");
        System.out.println("tomkat = " + tomcat);
        aws = technologies.indexOf("aws");
        System.out.println("aws = " + aws);

        int html = technologies.indexOf("html");

        //technologies -> how can I check if "c++" is in the technologies String
        //contains
        //index result is > -1


        if (technologies.contains("c++")) {
            System.out.println("c++ is there");
        } else {
            System.out.println("c++ is not present");
        }


        if (technologies.indexOf("c++") >= -1) {
            System.out.println("c++ is there");
        } else {
            System.out.println("c++ is not there");
        }

        int firstComma = technologies.indexOf(",");
        System.out.println("firstComma = " + firstComma);
        
    
        int lastComma = technologies.lastIndexOf(",");
        System.out.println("lastComma = " + lastComma);
    

        //how to find seconds, or third comma,

        System.out.println(technologies.indexOf(",",5));

        int secondComma = technologies.indexOf(",",5);
        System.out.println("secondComma = " + secondComma);

        System.out.println(technologies.indexOf(",", secondComma+1));

        String url = "www.cybertekschool.okta.com";
        //find the second . from the url and print index ;

        System.out.println(url.indexOf(".", secondComma+1));


        System.out.println(url.indexOf(".",url.indexOf("." )+1));

        










        }
    }

