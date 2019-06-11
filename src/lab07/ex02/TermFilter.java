package lab07.ex02;

public class TermFilter extends TextReaderDecorator {
    private String[] buffer;
    private int bufferCounter;

    public TermFilter(TextReaderInterface r) {
        super(r);
        this.buffer = new String[0];
        this.bufferCounter = 0;
    }

    @Override
    public String next() {
        if (this.bufferCounter == this.buffer.length) {
            this.buffer = super.next().split(" ");
            this.bufferCounter = 0;
        }

        String nextWord = this.buffer[this.bufferCounter];
        this.bufferCounter++;

        return nextWord;

    }

}