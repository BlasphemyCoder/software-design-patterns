package lab05.ex02;

public class CentralCantineLunchBuilder implements LunchBuilder {
    private Lunch lunch = new Lunch();

    @Override
    public void buildDrink() {
        this.lunch.setDrink("Água");
    }

    @Override
    public void buildMainCourse() {
        this.lunch.setMainCourse("Grelhada mista");
    }

    @Override
    public void buildSide() {
        this.lunch.setSide("Queijo fresco");
    }

    @Override
    public Lunch getMeal() {
        return this.lunch;
    }
}
