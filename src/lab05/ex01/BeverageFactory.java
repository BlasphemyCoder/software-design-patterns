package lab05.ex01;

public class BeverageFactory {

    // Factory method that returns a specific beverage depending on the specified temperature
    public static Commodity createBeverage(Temperature t) {
        Commodity commodity = null;
        switch (t) {
            case COLD:
                commodity = new FruitJuice();
                break;
            case WARM:
                commodity = new Milk();
                break;
        }
        return commodity;
    }
}
