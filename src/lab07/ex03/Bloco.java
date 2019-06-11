package lab07.ex03;

import java.util.ArrayList;

public class Bloco extends Shape {
    private ArrayList<Shape> elements;
    private String name;

    public Bloco(String name){
        this.elements = new ArrayList<>();
        this.name = name;
    }

    public void add(Shape c){
        elements.add(c);
    }

    public void draw(){
        System.out.println(super.getIndent().toString() + "Window " + this.name);

        super.getIndent().append("   ");    //Indent further

        for(Shape i : elements){ //Print elements
            i.draw();
        }

        super.getIndent().setLength(super.getIndent().length() - 3); //Get back to base indent
    }

}