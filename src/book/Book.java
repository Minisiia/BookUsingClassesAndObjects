package book;

public class Book {
    private String title;
    private String author;
    private String content;

    public Book() {
    }

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public static void main(String[] args) {
        Title myTitle = new Title();
        Author myAuthor = new Author();
        Content myContent = new Content();
        myTitle.setTitle("New title");
        myAuthor.setAuthor("New author");
        myContent.setContent("New content");
        Book book = new Book(myTitle.getTitle(), myAuthor.getAuthor(), myContent.getContent()); // Реалізуйте можливість додавання до книги назви книги, імені автора та змісту
        myTitle.show();  //  Виведіть на екран за допомогою методу show() назву книги,
        myAuthor.show(); // ім'я автора
        myContent.show();// та зміст.
    }
}
