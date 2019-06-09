package lab05.ex02;

public class CrastoLunchBuilder implements LunchBuilder {
    private Lunch lunch = new Lunch();

    @Override
    public void buildDrink() {
        this.lunch.setDrink("Vinho Tinto");
    }

    @Override
    public void buildMainCourse() {
        this.lunch.setMainCourse("Bacalhau à lagareiro");
    }

    @Override
    public void buildSide() {
        this.lunch.setSide("Broa");
    }

    @Override
    public Lunch getMeal() {
        return this.lunch;
    }
}
