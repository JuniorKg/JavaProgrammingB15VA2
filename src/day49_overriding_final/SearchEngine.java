package day49_overriding_final;

public class SearchEngine {
    public static void main(String[] args) {
    }

    public  int search(String item) {
        System.out.println("Searching for" + item + " \nreturning results count...");
            return item.length();
    }
    protected void getResults(){
        System.out.println("Search Engine displaying results...");
    }

    String clickResult(){
        System.out.println("Clicking result of search engine");
        return "SearchEngine item details";


    }
}
