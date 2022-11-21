package book;

public class Book {
    public static void main(String[] args) {
        Title myTitle = new Title();
        Author myAuthor = new Author();
        Content myContent = new Content();
        myTitle.setTitle("New title");
        myAuthor.setAuthor("New author");
        myContent.setContent("New content");
        myTitle.show();
        myAuthor.show();
        myContent.show();
    }
}
