package MyPractice;

public class Assignment106S {
    public static void main(String[] args) {
        
        String text = "I am from small but beautiful city: \"Bishkek\", and my name is \"Zhumgalbek\"";
        String json = "\"id\" 1934, \"firstName\": \"James\", \"lastName\": \"May\", \"role\": \"student-team-member\"";
        
        String city = text.substring(text.indexOf("city")+7, text.indexOf("\","));
        String name = text.substring(text.indexOf("is ")+4, text.lastIndexOf("\""));
        System.out.println(city);
        System.out.println(name);
        
        String id = json.substring(json.indexOf("id")+4, json.indexOf(","));
        System.out.println(id);
        String firstname = json.substring(json.indexOf("firstsName")+14);
        System.out.println(firstname);

        
        


        
    }
}
