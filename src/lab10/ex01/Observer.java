package ex01;

public interface Observer {
    public abstract void update(String message);

    public abstract String getType();
}