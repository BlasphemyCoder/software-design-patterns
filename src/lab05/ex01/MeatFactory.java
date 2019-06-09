package lab05.ex01;

public class MeatFactory {

    // Factory method that returns a specific meat depending on the specified temperature
    public static Commodity createMeat(Temperature t) {
        Commodity commodity = null;
        switch (t) {
            case COLD:
                commodity = new Tuna();
                break;
            case WARM:
                commodity = new Pork();
                break;
        }
        return commodity;
    }
}
