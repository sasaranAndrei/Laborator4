package problema4_6;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private Boolean borrow;
    private Reader reader;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrow = false;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getBorrow() {
        return borrow;
    }

    public void setBorrow(Boolean borrow) {
        this.borrow = borrow;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}
