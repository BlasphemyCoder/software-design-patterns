package ex03;

public interface State {
    public void register(Book wrapper);

    public void reserve(Book wrapper);

    public void cancelReserve(Book wrapper);

    public void giveBack(Book wrapper);

    public void take(Book wrapper);
}