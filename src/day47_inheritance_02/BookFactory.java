package day47_inheritance_02;

public class BookFactory {
    public static void main(String[] args) {


        Book book = new Book();
        book.setAuthor("Jamie Chan");
        book.setTitle("Learn Java in One Day");
        book.setPrice(11.67);
        book.setType("coding");

        System.out.println("---BOOK INFO---");
        System.out.println("Author = " + book.getAuthor());
        System.out.println("Title = " + book.getTitle());
        System.out.println("Price = " + book.getPrice());
        System.out.println("Type = " + book.getType());

        AudioBook audioBook = new AudioBook();
        audioBook.setAuthor("Maria Fusco");
        audioBook.setTitle("Java 8 in Action");
        audioBook.setPrice(24.95);
        audioBook.setType("programming");
        audioBook.setLength(5);
        audioBook.setNarrator("Ezra Similoff ");

        System.out.println("--- AUDIO BOOK INFO ---");
        System.out.println("Author = " + audioBook.getAuthor());
        System.out.println("Title = " + audioBook.getTitle());
        System.out.println("Price = " + audioBook.getPrice());
        System.out.println("Type = " + audioBook.getType());
        System.out.println("Length = " + audioBook.getLength());
        System.out.println("Narrator = " + audioBook.getNarrator());
        audioBook.listen();
    }
}