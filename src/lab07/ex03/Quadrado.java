package lab07.ex03;

public class Quadrado extends Shape {
    private String name;

    public Quadrado(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println(super.getIndent().toString() + "Quadrado " + this.name);
    }

}