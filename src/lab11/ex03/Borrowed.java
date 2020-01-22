package ex03;

public class Borrowed implements State {
    @Override
    public void register(Book wrapper) {
        throw new UnsupportedOperationException("Operation not available.");
    }

    @Override
    public void reserve(Book wrapper) {
        throw new UnsupportedOperationException("Operation not available.");    
    }

    @Override
    public void cancelReserve(Book wrapper) {
        throw new UnsupportedOperationException("Operation not available.");
    }

    @Override
    public void giveBack(Book wrapper) {
        wrapper.setState(new Available());
    }

    @Override
    public void take(Book wrapper) {
        throw new UnsupportedOperationException("Operation not available.");
    }
}