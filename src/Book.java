import java.util.Objects;

public class Book implements Thinkable{

    private String name;
    private String author;
    private int numberOfPages;
    private int currentPage;

    public Book(String name, String author, int numberOfPages, int currentPage) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.currentPage = currentPage;
    }

    public Book writeBook(String name, String author, int numberOfPages, int currentPage) {
        return new Book(name, author, numberOfPages, currentPage);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                name.equals(book.name) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, numberOfPages);
    }
}
