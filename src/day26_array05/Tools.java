package day26_array05;

public class Tools {
    public static void main(String[] args) {
        String[] tools = {"java", "selenium", "git", "junit", "jenkins", "cucumber"};

        for (String toolname : tools) {
            if (toolname.equals("java")) {
                System.out.println(toolname +" -> fun programming language");
            } else if (toolname.equals("selenium")) {
                System.out.println(toolname +" -> test automation");
            } else if (toolname.equals("git")) {
                System.out.println(toolname +" -> version control");
            } else if (toolname.equals("junit")) {
                System.out.println(toolname +" -> testing tool");
            } else if (toolname.equals("jenkins")) {
                System.out.println(toolname +" -> continious integration");
            } else if (toolname.equals("cucumber")) {
                System.out.println(toolname +" -> BDD style testing");



            }
        }
    }
}