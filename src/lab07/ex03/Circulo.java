package lab07.ex03;

public class Circulo extends Shape {
    private String name;

    public Circulo(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println(super.getIndent().toString() + "Circulo " + this.name);
    }

}