package ex03;

public class Available implements State {
    @Override
    public void register(Book wrapper) {
        throw new UnsupportedOperationException("Operation not available.");
    }

    @Override
    public void reserve(Book wrapper) {
        wrapper.setState(new Reserved());
    }

    @Override
    public void cancelReserve(Book wrapper) {
        throw new UnsupportedOperationException("Operation not available.");
    }

    @Override
    public void giveBack(Book wrapper) {
        throw new UnsupportedOperationException("Operation not available.");
    }

    @Override
    public void take(Book wrapper) {
        wrapper.setState(new Borrowed());
    }
}