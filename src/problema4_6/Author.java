package problema4_6;

public class Author {
    private String name;
    private Integer noOfBooks;
    private Book[] books;

    public Author(String name, Integer noOfBooks, Book[] books) {
        this.name = name;
        this.noOfBooks = noOfBooks;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(Integer noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public Book[] getBooks() {
        return books;
    }

    public void showBooks () {
        for (int i = 0; i < this.getNoOfBooks(); i++){
            System.out.println(this.getBooks()[i]);
        }

    }
}
