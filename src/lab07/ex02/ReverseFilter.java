package lab07.ex02;

public class ReverseFilter extends TextReaderDecorator {
    public ReverseFilter(TextReaderInterface r) {
        super(r);
    }

    @Override
    public String next() {
        String nextWord = super.next();
        return new StringBuilder(nextWord).reverse().toString();
    }

    ;
}
