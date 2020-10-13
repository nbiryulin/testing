public class Book {

    private String name;
    private String author;
    private int numberOfPages;

    public Book(String name, String author, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book writeBook(String name, String author, int numberOfPages) {
        return new Book(name, author, numberOfPages);
    }

    public Book addToBook(Book book, int addingPages) {
        int pagesNow = book.getNumberOfPages();
        book.setNumberOfPages(pagesNow + addingPages);
        return book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
