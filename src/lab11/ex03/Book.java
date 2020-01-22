package ex03;

public class Book {
    private State state;
    private static int currISBN = 0;
    private int ISBN;
    private int year;
    private String author;
    private String title;

    public Book(String title, int year, String author) {
        state = new Inventory();
        this.title = title;
        this.year = year;
        this.author = author;
        ISBN = ++currISBN;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void register() {
        this.state.register(this);
    }

    public void reserve() {
        this.state.reserve(this);
    }

    public void cancelReserve() {
        this.state.cancelReserve(this);
    }

    public void giveBack() {
        this.state.giveBack(this);
    }

    public void take() {
        this.state.take(this);
    }

    public String toString() {
        return String.format("Book: %-5d %-20s %-20s %-15s", ISBN, title, author,
                "[" + state.getClass().getSimpleName() + "]");
    }
}