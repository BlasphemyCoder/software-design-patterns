package lab07.ex02;

public class Test {

    public static void main(String[] args) {
        System.out.println("Using no filters:");
        TextReaderInterface reader = new TextReader("lab07/ex02/TestFile.txt");
        System.out.println(reader.next()+"\n");

        System.out.println("Using CodeFilter:");
        reader = new CodeFilter(new TextReader("lab07/ex02/TestFile.txt"));
        System.out.println(reader.next()+"\n");

        System.out.println("Using ReverseFilter:");
        reader = new ReverseFilter(new TextReader("lab07/ex02/TestFile.txt"));
        reader.next();
        System.out.println(reader.next()+"\n");

        System.out.println("Using TermFilter:");
        reader = new TermFilter(new TextReader("lab07/ex02/TestFile.txt"));
        reader.next();
        System.out.println(reader.next()+"\n");


        System.out.println("Using all filters:");
        reader = new ReverseFilter(new TermFilter(new TextReader("lab07/ex02/TestFile.txt")));
        reader.next();
        System.out.println(reader.next());
    }
}
