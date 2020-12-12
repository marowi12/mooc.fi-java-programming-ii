
public class Book {

    private String bookName;
    private int bookAge;

    public Book(String n, int a) {
        this.bookName = n;
        this.bookAge = a;
    }

    @Override
    public String toString() {
        return bookName + " (recommended for " + bookAge + " year-olds or older)";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookAge() {
        return bookAge;
    }

    public void setBookAge(int bookAge) {
        this.bookAge = bookAge;
    }

}
