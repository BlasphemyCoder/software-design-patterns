package lab05.ex02;

public interface LunchBuilder {
    void buildDrink();

    void buildMainCourse();

    void buildSide();

    Lunch getMeal();
}