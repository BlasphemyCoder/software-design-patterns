package lab05.ex02;

public class LunchDirector {
    private LunchBuilder lunchBuilder;

    public LunchDirector(LunchBuilder builder) {
        this.lunchBuilder = builder;
    }

    public void constructMeal() {
        this.lunchBuilder.buildDrink();
        this.lunchBuilder.buildMainCourse();
        this.lunchBuilder.buildSide();
    }

    public Lunch getMeal() {
        return this.lunchBuilder.getMeal();
    }
}
