package lab07.ex03;

public class Retangulo extends Shape {
    private String name;

    public Retangulo(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println(super.getIndent().toString() + "Retangulo " + this.name);
    }

}
