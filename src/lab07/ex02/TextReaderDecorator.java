package lab07.ex02;

public abstract class TextReaderDecorator implements TextReaderInterface {
    private TextReaderInterface reader;

    public TextReaderDecorator(TextReaderInterface r) {
        this.reader = r;
    }

    public boolean hasNext() {
        return this.reader.hasNext();
    }

    public String next() {
        return this.reader.next();
    }
}
