package day49_overriding_final;

public class Google extends SearchEngine {
    @Override
    public int search(String item){
        System.out.println("Googling for ... " + item + "\n returning results count");
        return item.length()*2;
    }
    @Override
    protected void getResults(){
        System.out.println("Google displaying results...");

    }
    String clickResult(){
        System.out.println("Clicking result of search engine");
        return "Google item details";

    }




}
