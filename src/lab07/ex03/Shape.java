package lab07.ex03;

public abstract class Shape {
    private static StringBuffer indent = new StringBuffer();
    public abstract void draw();

    public StringBuffer getIndent(){
        return indent;
    }
}
