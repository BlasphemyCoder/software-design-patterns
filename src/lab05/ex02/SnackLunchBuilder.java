package lab05.ex02;

public class SnackLunchBuilder implements LunchBuilder {
    private Lunch lunch = new Lunch();

    @Override
    public void buildDrink() {
        this.lunch.setDrink("Sumo");
    }

    @Override
    public void buildMainCourse() {
        this.lunch.setMainCourse("Pão com Panado");
    }

    @Override
    public void buildSide() {
        this.lunch.setSide("Rissol");
    }

    @Override
    public Lunch getMeal() {
        return this.lunch;
    }
}
