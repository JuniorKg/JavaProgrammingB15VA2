package day47_inheritance_02;

public class AudioBook extends Book {
    private int length;
    private String narrator;

    public void listen(){
        System.out.println("Listening to AudioBook written by [" +getAuthor()+
                "] with title [" +getTitle()+"]." + " Narrator by " +  "[" +narrator+"]");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
